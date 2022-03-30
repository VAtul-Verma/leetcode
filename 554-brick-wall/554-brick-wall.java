 class Solution {

  public int leastBricks(List<List<Integer>> wall) {
     
    HashMap<Integer, Integer> hm = new HashMap<>();

    int BricksInRow = BRow(wall.get(0));

    for (List<Integer> list : wall) {
      int sum = 0;
      for (int i = 0; i < list.size() - 1; i++) {
        sum = sum + list.get(i);

        if (hm.containsKey(sum)) {
          hm.put(sum, hm.get(sum) + 1);
        } else {
          hm.put(sum, 1);
        }
      }
    }
    int ans = Integer.MIN_VALUE;

    for (int key : hm.keySet()) {
      ans = Math.max(ans, hm.get(key));
    }

    System.out.println(BricksInRow);
    if (hm.size() == 0) {
      return wall.size();
    }
  
    return wall.size() - ans;
  }

  public int BRow(List<Integer> list) {
    int sum = 0;
    for (int i = 0; i < list.size(); i = i + 1) {
      sum = sum + list.get(i);
    }

    return sum;
  }
}
