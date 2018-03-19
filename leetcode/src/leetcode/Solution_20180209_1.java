package leetcode;

import java.util.ArrayList;
import java.util.List;

//17. Letter Combinations of a Phone Number
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
public class Solution_20180209_1 {
	public static List<String> letterCombinations(String digits) {
        List<String> answer = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        if(digits.length()==0) return answer;
        char[][] table = {{'a','b','c','\0'},{'d','e','f','\0'},{'g','h','i','\0'},{'j','k','l','\0'},{'m','n','o','\0'},
        				  {'p','q','r','s'},{'t','u','v','\0'},{'w','x','y','z'}};
        helper(answer,sb,table,digits,0);
        return answer;
    }
	public static void helper(List<String> answer,StringBuffer sb,char[][] table,String digits,int start){
		if(start == digits.length()){
			answer.add(new String(sb.toString()));
			return;
		}
		int j = 0;
		while(j<4&&table[digits.charAt(start)-50][j]!='\0'){
				sb.append(table[digits.charAt(start)-50][j]);
				helper(answer,sb,table,digits,start+1);
				sb.deleteCharAt(start);
				j++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String digits = "247";
		System.out.println(letterCombinations(digits));
	}

}
