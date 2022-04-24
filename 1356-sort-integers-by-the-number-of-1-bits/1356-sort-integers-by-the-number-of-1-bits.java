class Solution {
    public class Data {
        int v;
        int c;

        public Data(int s, int c) {
            this.v = s;
            this.c = c;
        }
    }
    
    public int[] sortByBits(int[] arr) {
       List<Data> ls=new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            ls.add(new Data(arr[i],Integer.bitCount(arr[i])));
        }
        ls.sort(Comparator.comparing(e->e.c));

        for (int i = 0; i < ls.size(); i++) {
            arr[i]=ls.get(i).v;
        }
        return arr;
    }
}
