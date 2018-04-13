package leetcode;

import java.util.ArrayList;

public class Solution_20180413_1 {
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		int m = matrix.length, n = matrix[0].length;
	    boolean[][] table = new boolean[matrix.length][matrix[0].length];
	    ArrayList<Integer> al = new ArrayList<>();
	    int i = 0;
	    int j = -1;
	    int count = 0;
	    while(true){
	    	while(++j<n&&!table[i][j]){
	    		al.add(matrix[i][j]);
	    		table[i][j] = true;
	    		count++;
	    		continue;
	    	}
	    	j--;
	    	while(++i<m&&!table[i][j]){
	    		al.add(matrix[i][j]);
	    		table[i][j] = true;
	    		count++;
	    		continue;
	    	}
	    	i--;
	    	while(--j>=0&&!table[i][j]){
	    		al.add(matrix[i][j]);
	    		table[i][j] = true;
	    		count++;
	    		continue;
	    	}
	    	j++;
	    	while(--i>=0&&!table[i][j]){
	    		al.add(matrix[i][j]);
	    		table[i][j] = true;
	    		count++;
	    		continue;
	    	}
	    	i++;
	    	if(count == m * n)
	    		break;
	    }
	    return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		printMatrix(arr);
	}

}
