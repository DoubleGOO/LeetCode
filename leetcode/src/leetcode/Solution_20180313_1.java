package leetcode;
//5. Longest Palindromic Substring
//https://leetcode.com/problems/longest-palindromic-substring/description/
public class Solution_20180313_1 {
	
	/*我挺喜欢我的算法，但是太慢了实在，所以还是学习标准的吧 */
	public static String longestPalindrome(String s) {
		if(s.length() == 0)
			return "";
        int[][] table = new int[s.length()][s.length()];
        int max = 0,start = 0,end = 0;
        for(int i = 0 ;i<s.length();i++){
        	table[i][i] = 1;
        }
        for(int i = 0;i<s.length();i++){
        	for(int j = i - 1;j >= 0;j--){
        		if(s.charAt(j) == s.charAt(i)){
        			if(i - j ==1)
        				table[j][i] = 2;
        			if(table[j+1][i-1]!=0)
        				table[j][i] = table[j+1][i-1] + 2;
        		}
        		if(table[j][i]>max){
        			max = table[j][i];
        			start = j;
        			end = i;	
        		}
        	}
        }
        return s.substring(start, end+1);
    }
//	public class Solution {
//		private int lo, maxLen;
//
//		public String longestPalindrome(String s) {
//			int len = s.length();
//			if (len < 2)
//				return s;
//			
//		    for (int i = 0; i < len-1; i++) {
//		     	extendPalindrome(s, i, i);  //assume odd length, try to extend Palindrome as possible
//		     	extendPalindrome(s, i, i+1); //assume even length.
//		    }
//		    return s.substring(lo, lo + maxLen);
//		}
//
//		private void extendPalindrome(String s, int j, int k) {
//			while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
//				j--;
//				k++;
//			}
//			if (maxLen < k - j - 1) {
//				lo = j + 1;
//				maxLen = k - j - 1;
//			}
//		}}
	
	public static void main(String[] args) {
		String s = "cbbd";
		System.out.println(longestPalindrome(s));
	}

}
