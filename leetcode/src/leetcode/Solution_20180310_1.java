package leetcode;

public class Solution_20180310_1 {
	
	public int singleNumber(int[] nums) {
        int result = 0;
        for(int i :nums){
        	result = result^i;
        }
        return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
