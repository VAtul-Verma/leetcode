class Solution {
    List<Integer> res;
    int min = 60;
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
        int n = people.size();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            int maskOfSkill = 0;
            for (int j = 0; j < req_skills.length; j++)
                for (String s : people.get(i))
                    if (s.equals(req_skills[j])) maskOfSkill += (1 << j);
            nums[i] = maskOfSkill;
        }
        int target = (1 << req_skills.length) - 1;
        dfs(new ArrayList<>(), nums, target, 0, 0);
        return res.stream().mapToInt(i -> i).toArray(); 
    }
    
    private void dfs(List<Integer> list, int[] nums, int target, int val, int index) {
        if (list.size() > min) return; 
        if (val == target) {
            min = list.size();
            res = new ArrayList<>(list);
            return;
        } 
        for (int i = index; i < nums.length; i++) {
            int next = val | nums[i];
            if (next == val) continue;
            list.add(i);
            dfs(list, nums, target, next, i + 1);
            list.remove(list.size() - 1);
        }
    }
}