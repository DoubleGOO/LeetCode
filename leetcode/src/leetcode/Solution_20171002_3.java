package leetcode;
//413. Arithmetic Slices
//https://leetcode.com/problems/arithmetic-slices/description/
public class Solution_20171002_3 {
	public static int numberOfArithmeticSlices(int[] A){
		if(A==null||A.length<3)
			return 0;
		int result = 0;
		int pre_add = Integer.MAX_VALUE;
		int count = 1;
		for(int i = 1;i<A.length;i++){
			if(A[i]-A[i-1] == pre_add){
				result += count;
				count++;
				continue;
			}
			count = 1;
			pre_add = A[i]-A[i-1];
		}
		return result;
	}
	public static void main(String[] args){
		int[] A= {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		System.out.println(numberOfArithmeticSlices(A));
	}
}
