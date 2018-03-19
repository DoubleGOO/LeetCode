package leetcode;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
//500. Keyboard Row
//https://leetcode.com/problems/keyboard-row/description/
public class Solution_20170915_2 {
	public static String[] findWords(String[] words){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		String[] s= {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		for(int i = 0;i<s.length;i++){
			for(char c:s[i].toCharArray()){
				hm.put(c, i);
			}
		}
		List<String> ls = new ArrayList<String>();
		for(String str:words){
			Integer flag = -1;
			String temp = str.toUpperCase();
			int length = str.length();
			if(length==1){
				ls.add(str);
				continue;
			}
			for(int i = 0;i<length;i++){
				if(i == 0){
					flag = hm.get(temp.charAt(0));
					continue;
				}
				if(hm.get(temp.charAt(i))!=flag){
					break;
				}
				if(i==length-1)
					ls.add(str);
			}
		}
		return ls.toArray(new String[0]);
	}
	public static void main(String[] args){
		String[] st = {"Hello","Alaska","dad","peace"} ;
		String[] temp = findWords(st);
		for(String s:temp){
			System.out.println(s);
		}
	}
}
