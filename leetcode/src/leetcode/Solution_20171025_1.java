package leetcode;

import java.util.Arrays;

public class Solution_20171025_1 {
	public static boolean checkInclusion(String s1, String s2) {
		int[] table = new int[26];
		for(char c:s1.toCharArray()){
			table[c-97]++;
		}
		int left = 0;
		int right = 0;
		for(int i = 0;i<=s2.length()-s1.length();i++){
			left =  i;
			right = left + s1.length() - 1;
			int[] copy = Arrays.copyOf(table, 26);
			while((left==right&&copy[s2.charAt(left)-97]>0)||(copy[s2.charAt(left)-97]-->0&&copy[s2.charAt(right)-97]-->0)){
				if(++left > --right){
					return true;
				}
			}
		}
		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(checkInclusion("adc","dcda"))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
