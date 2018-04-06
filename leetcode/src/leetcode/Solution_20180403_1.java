package leetcode;

public class Solution_20180403_1 {
	//7
//	public int Fibonacci(int n) {
//		if(n <= 0)
//			return 0;
//		if(n<2)
//			return 1;
//		return Fibonacci(n-1)+Fibonacci(n-2);
//    }
	//8
//	public int JumpFloor(int target) {
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		return dp[target-1];
//    }
	//9
//	public int JumpFloorII(int target) {
//		if(target == 1)
//			return 1;
//		if(target == 2)
//			return 2;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			int sum = 0;
//			for(int j = 0;j<i;j++){
//				sum = sum + dp[j]; 
//			}
//			dp[i] = sum + 1;
//		}
//		
//		return dp[target -1 ];
//	}
	//10
//	public int RectCover(int target) {
//		if(target <= 2)
//			return target;
//		int[] dp = new int[target];
//		dp[0] = 1;
//		dp[1] = 2;
//		for(int i = 2;i<target;i++){
//			dp[i] = dp[i-1] + dp[i-2];
//		}
//		return dp[target-1];
//    }
	//11
//	public int NumberOf1(int n){
//        int index = 1;
//        int number = 0;
//     
//	    while(index!=0){
//	        if((n & index)!=0)
//	            number++;
//	        index = index << 1;
//	    }
//    	return number;
//	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
