package leetcode;
import java.util.HashMap;
//389. Find the Difference
//https://leetcode.com/problems/find-the-difference/description/
public class Solution_20170918_1 {
	public static char findTheDifference(String s,String t){
		HashMap<Character,Integer> hm = new HashMap<>(); 
		for(int i = 0;i<s.length();i++){
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		for(int i = 0;i<t.length();i++){
			Integer temp = hm.get(t.charAt(i));
			if(temp==null||temp==0)
				return t.charAt(i);
			hm.put(t.charAt(i), temp-1);
		}
		return 0;
	}
	public static char findTheDifference_standar(String s,String t){
		char xor = 0;
		for(char ch:s.toCharArray()){
			xor ^= ch;
		}
		for(char ch:t.toCharArray()){
			xor ^= ch;
		}
		return xor;
	}
	public static void main(String[] args){
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s,t));
	}
}
