class Solution {
    public int countWays(int index, int amount, int[] coins, int[][] storeAnswer){
        if(index < 0){
            return amount == 0 ? 1 : 0;
        }
        
        if(storeAnswer[index][amount] != -1){
            return storeAnswer[index][amount];
        }
        
        int ways = countWays(index - 1, amount, coins, storeAnswer);
        if(amount >= coins[index]){
            ways += countWays(index, amount - coins[index], coins, storeAnswer);
        }
        
        return storeAnswer[index][amount] = ways;
    }
    
    public int change(int amount, int[] coins) {
        int[][] storeAnswer = new int[coins.length][amount + 1];
        for(int index = 0; index < coins.length; ++index){
            for(int sum = 0; sum <= amount; ++sum){
                storeAnswer[index][sum] = -1;
            }
        }
        return countWays(coins.length - 1, amount, coins, storeAnswer);
    }
}
// Bottom-up

// class Solution {
//     public int change(int amount, int[] coins) {
//         int[][] ways = new int[2][amount + 1];
//         ways[0] = new int [amount + 1];
//         for(int index = 0; index < coins.length; ++index){
//             ways[1] = new int[amount + 1];
//             for(int sum = 0; sum <= amount; ++sum){
//                 ways[1][sum] = ways[0][sum];
//                 if(sum == coins[index]){
//                     ++ways[1][sum];
//                 }
//                 else if(sum > coins[index]){
//                     ways[1][sum] += ways[1][sum - coins[index]];
//                 }
//             }
//             ways[0] = ways[1];
//         }
//         return amount == 0 ? 1 : ways[1][amount];
//     }
// }