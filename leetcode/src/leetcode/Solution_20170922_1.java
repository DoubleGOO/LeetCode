package leetcode;
import java.util.HashMap;
//290. Word Pattern
//https://leetcode.com/problems/word-pattern/description/
public class Solution_20170922_1 {
	public static boolean wordPattern(String pattern,String str){
		String[] s = str.split(" ");
		if(pattern.length()!=s.length)
			return false;
		HashMap<Character,String> hm = new HashMap<Character,String>();		
		for(int i = 0;i<pattern.length();i++){
			if(!hm.containsKey(pattern.charAt(i))&&!hm.containsValue(s[i]))
				hm.put(pattern.charAt(i), s[i]);
			else{
				if(hm.containsValue(s[i])&&!hm.containsKey(pattern.charAt(i)))
					return false;
				if(!hm.get(pattern.charAt(i)).equals(s[i]))
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(wordPattern("abba","dog cat cat dog"))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
