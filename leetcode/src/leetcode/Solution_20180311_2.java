package leetcode;

import java.util.HashMap;
import java.util.Hashtable;

//3. Longest Substring Without Repeating Characters
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class Solution_20180311_2 {
	//ÂýµÄ·ÉÆð
//	public static int lengthOfLongestSubstring(String s) {
//		Hashtable<Character,Integer> table = new Hashtable<>();
//		char[] cs = s.toCharArray();
//		int count = 0,max = 0;
//		for(int i = 0;i<cs.length;i++){				
//			if(!table.containsKey(cs[i])){
//				table.put(cs[i], i);
//				count ++;
//			}
//			else{
//				max = (max>count)?max:count;
//				count = 0;
//				i = table.get(cs[i]);
//				table = new Hashtable<>();
//				
//			}
//		}
//		max = (max>count)?max:count;
//		return max;
//    }
	public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
