package leetcode;
//63. Unique Paths II
//https://leetcode.com/problems/unique-paths-ii/description/

public class Solution_20180320_1 {
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if(obstacleGrid == null)
			return 0;
		int row = obstacleGrid.length, col = obstacleGrid[0].length;
		if(obstacleGrid[row-1][col-1]==1)
			return 0;
		int[][] dp = new int[row][col];
		for(int i = 0;i<row;i++){
			if(obstacleGrid[i][0]==0)
				dp[i][0] = 1;
			else
				break;
		}
		for(int j = 0;j<col;j++){
			if(obstacleGrid[0][j]==0)
				dp[0][j] = 1;
			else
				break;
		}
		for(int m = 1;m<row;m++){
			for(int n = 1;n<col;n++){
				if(obstacleGrid[m][n]!=1)
					dp[m][n] = dp[m-1][n]+dp[m][n-1];
			}
		}
		return dp[row-1][col-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = {{0,0}};
		System.out.println(uniquePathsWithObstacles(test));
	}

}
