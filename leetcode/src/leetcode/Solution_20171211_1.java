package leetcode;

import java.util.Arrays;

//455. Assign Cookies
//https://leetcode.com/problems/assign-cookies/description/
public class Solution_20171211_1 {
	public static int findContentChildren(int[] g,int[] s){
		int gLength = g.length, sLength = s.length, result = 0;
		Arrays.sort(g);
		Arrays.sort(s);
		int gPointer = 0,sPointer = 0;;
		while(gPointer < gLength && sPointer < sLength){
			if(g[gPointer]<=s[sPointer]){
				result++;
				gPointer++;
			}
			sPointer++;
		}
		return result;
	}
	public static void main(String[] args) {
		
	}
}
