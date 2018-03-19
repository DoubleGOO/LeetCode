package leetcode;
//reshape matrix
//https://leetcode.com/problems/reshape-the-matrix/description/
public class Solution_20170904 {
	public static int[][] matrixReshape(int[][] nums,int r,int c){
		int[][] value = new int[r][c];
		int[] temp = new int[nums.length*nums[0].length];
		if(temp.length==r*c){
			int i = 0;
			for(int[] row:nums){
				for(int column:row){
					temp[i] = column;
					i++;
				}
			}
			i = 0;
			for(int n = 0;n<r;n++){
				for(int m = 0;m<c;m++){
					value[n][m] = temp[i];
					i++;
				}
			}
			return value;
		}
		else
			return nums;
	}
	public static void main(String[] args){
		int[][] nums = {{1,2},{3,4}};
		int[][] value = matrixReshape(nums,1,4);
		for(int i = 0;i<value.length;i++){
			for(int j = 0;j<value[i].length;j++){
				System.out.print(value[i][j]+" ");
			}
			System.out.println();
		}
	}
}
