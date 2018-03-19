package leetcode;
import java.util.HashMap;
import java.util.ArrayList;

//451. Sort Characters By Frequency
//https://leetcode.com/problems/sort-characters-by-frequency/description/
public class Solution_20170921_1 {
	public static String frequencySort(String s){
		HashMap<Character,Integer> hm = new HashMap<>();
		for(int i = 0;i<s.length();i++){
			hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0)+1);
		}
		@SuppressWarnings("unchecked")
		ArrayList<Character> [] l = new ArrayList[s.length()+1];
		for(char c : hm.keySet()){
			int frequency = hm.get(c);
			if(l[frequency]==null){
				l[frequency] = new ArrayList<>();
				l[frequency].add(c);
			}else{
				l[frequency].add(c);
			}

		}
		StringBuffer sb = new StringBuffer();
		for(int i = s.length();i>0;i--){
			if(l[i]!=null){
				for(char c:l[i]){
					for(int j = 0;j<i;j++){
						sb.append(c);
					}
				}
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args){
		System.out.println(frequencySort("tree"));
	}
}
