package leetcode;
//383. Ransom Note
//https://leetcode.com/problems/ransom-note/description/
public class Solution_20170915_1 {
	public static boolean canConstruct(String ransomNote,String magazine){
		if(ransomNote.isEmpty())
			return true;
		int[] letterTable = new int[26];
		for(int i = 0;i<magazine.length();i++){
			letterTable[magazine.charAt(i)-'a'] ++;
		}
		for(int i = 0;i<ransomNote.length();i++){
			if(letterTable[ransomNote.charAt(i)-'a']>0)
				letterTable[ransomNote.charAt(i)-'a'] --;
			else
				break;
			if(i == ransomNote.length()-1)
				return true;
		}
		return false;
	}
	public static boolean canConstruct_standar(String ransomNote,String magazine){
		if(ransomNote.isEmpty())
			return true;
		int[] letterTable = new int[26];
		for(char aChar:magazine.toCharArray()){
			letterTable[aChar-'a']++;
		}
		for(char aChar:ransomNote.toCharArray()){
			if(--letterTable[aChar-'a']<0)
				return false;
		}
		return true;
	}
	public static void main(String[] args){
		if(canConstruct_standar("aa","aab"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
