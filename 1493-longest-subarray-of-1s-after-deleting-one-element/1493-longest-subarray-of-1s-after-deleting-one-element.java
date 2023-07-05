class Solution {
	public int longestSubarray(int[] nums) {
		List<Integer> list = new ArrayList<>() ;
		for( int i=0;i<nums.length;i++ ) 
			if( nums[i]==0 ) list.add( i ) ;
		int result = 0 ;
		if( list.size()<=1 ) return nums.length-1 ;
		if( list.size()==nums.length ) return 0 ;
		for( int i=0;i<list.size()-1;i++ ) 
			if( list.get(i)==0 ) 
				result = Math.max( result , list.get(i+1)-1 ) ;
			else if( i==0 )
				result = Math.max( result , list.get(i)+( list.get(i+1)-list.get(i)-1 ) ) ;
			else 
				result =  Math.max( result , list.get(i+1)-list.get(i)-1+(list.get(i)-list.get(i-1)-1) ) ; 
		int last = list.size()-1 ;
		result = Math.max( result , nums.length-1-list.get(last)+list.get(last)-list.get(last-1)-1 ) ;
		return result ; 
	}
}