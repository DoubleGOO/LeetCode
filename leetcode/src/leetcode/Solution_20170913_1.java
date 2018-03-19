package leetcode;
//583. Delete Operation for Two Strings
//https://leetcode.com/problems/delete-operation-for-two-strings/description/
public class Solution_20170913_1 {
	public static int minDistance(String word1,String word2){
		int count1 = 0,max1 = 0;
		int count2 = 0,max2 = 0;
		for(int i = 0;i<word1.length();i++){
			count1 = 0;
			String str_temp = word2;
			for(int j = i;j<word1.length();j++){
				int temp = str_temp.indexOf(word1.charAt(j));
				if(str_temp.isEmpty()) break;
				if(temp == -1) continue;;
				str_temp = str_temp.substring(temp+1);
				if(++count1>max1) max1 = count1;
			}
		}
		for(int i = 0;i<word2.length();i++){
			count2 = 0;
			String str_temp = word1;
			for(int j = i;j<word2.length();j++){
				int temp = str_temp.indexOf(word2.charAt(j));
				if(str_temp.isEmpty()) break;
				if(temp == -1) continue;;
				str_temp = str_temp.substring(temp+1);
				if(++count2>max2) max2 = count2;
			}
		}
		if(max1<max2) max1 = max2;
		return word1.length()+word2.length()-2*max1;
	}
	public static int minDistance_standar(String word1,String word2){//¶¯Ì¬¹æ»®
		int[][] table = new int[word1.length()+1][word2.length()+1];
		int m = word1.length();
		int n = word2.length();
		for(int i = 1;i<=m;i++){
			for(int j = 1;j<=n;j++){
				if(word1.charAt(i-1)==word2.charAt(j-1)){
					table[i][j] = table[i-1][j-1]+1;
				}
				else{
					table[i][j] = Math.max(table[i-1][j], table[i][j-1]);
				}
			}
		}
		return n+m-table[m][n]*2;
	}
	public static void main(String[] args){
		String word1 = "food";
		String word2 = "money";
		System.out.println(minDistance_standar(word1,word2));
	}
}
