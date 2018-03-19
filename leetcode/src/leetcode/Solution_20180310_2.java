package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_20180310_2 {
	public boolean isValidSudoku(char[][] board) {
		List<List<Character>> row = new ArrayList<>();
		List<List<Character>> col = new ArrayList<>();
		List<List<Character>> gri = new ArrayList<>();
		for(int i = 0;i<9;i++)
			row.add(new ArrayList());
		for(int i = 0;i<9;i++)
			col.add(new ArrayList());
		for(int i = 0;i<9;i++)
			gri.add(new ArrayList());
		for(int i = 0;i<9;i++){
			for(int j = 0;j<9;j++){
				if(board[i][j]=='.'){
					continue;
				}
				if(row.get(i).contains(board[i][j]))
					return false;
				row.get(i).add(board[i][j]);
				if(col.get(j).contains(board[i][j]))
					return false;
				col.get(j).add(board[i][j]);
				int g = i/3 * 3 + j/3;
				if(gri.get(g).contains(board[i][j]))
					return false;
				gri.get(g).add(board[i][j]);
			}
		}
		return true;
		
    }
	/*更高明一点的写法*/
//	public boolean isValidSudoku(char[][] board) {
//	    for(int i = 0; i<9; i++){
//	        HashSet<Character> rows = new HashSet<Character>();
//	        HashSet<Character> columns = new HashSet<Character>();
//	        HashSet<Character> cube = new HashSet<Character>();
//	        for (int j = 0; j < 9;j++){
//	            if(board[i][j]!='.' && !rows.add(board[i][j]))
//	                return false;
//	            if(board[j][i]!='.' && !columns.add(board[j][i]))
//	                return false;
//	            int RowIndex = 3*(i/3);
//	            int ColIndex = 3*(i%3);
//	            if(board[RowIndex + j/3][ColIndex + j%3]!='.' && !cube.add(board[RowIndex + j/3][ColIndex + j%3]))
//	                return false;
//	        }
//	    }
//	    return true;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
