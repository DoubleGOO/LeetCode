package leetcode;

import java.util.LinkedList;
import java.util.Queue;

//542. 01 Matrix
//https://leetcode.com/problems/01-matrix/description/
public class Solution_20171003_1 {
	public int[][] updateMatrix(int[][] matrix){
		int m = matrix.length;
        int n = matrix[0].length;
		int [][] result = matrix;
		Queue<int []> queue = new LinkedList<>();
		for(int i = 0;i<matrix.length;i++){
			for(int j = 0;j<matrix[0].length;j++){
				if(result[i][j]==1)
					result[i][j] = Integer.MAX_VALUE;
				else
					queue.offer(new int[] {i,j});
			}
		}
		int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
		while(!queue.isEmpty()){
			int[] temp = queue.poll();
			for(int[] d:dirs){
				int r = temp[0]+d[0];
				int c = temp[1]+d[1];
				if(r<0||r>=m||c<0||c>=n||
					result[r][c]<=result[temp[0]][temp[1]]+1) continue;
				queue.offer(new int[] {r,c});
				result[r][c] = result[temp[0]][temp[1]]+1;
			}
		}
		return result;
	}
	public static void main(String[] args){
		
	}
}
