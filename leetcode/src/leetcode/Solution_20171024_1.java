package leetcode;

public class Solution_20171024_1 {
	public static String decodeString(String s){
		StringBuffer sb = new StringBuffer();
		decode(s,sb,0,1);
		return sb.toString();
	}
	
	public static int decode(String s,StringBuffer sb,int pointer,int count){
		int nextCount = 0;
		int temp = pointer;
		while(count-- > 0){
			pointer = temp;
			while(true){
				if(pointer==s.length()||s.charAt(pointer)==']'){
					break;
				}
				if((s.charAt(pointer)>47&&s.charAt(pointer)<58)){
					nextCount = nextCount * 10 + s.charAt(pointer) - 48;
					pointer++;
					continue;
				}
				if(nextCount>0){
					pointer = decode(s,sb,pointer+1,nextCount) + 1 ;
					nextCount = 0;
					continue;
				}
				sb.append(s.charAt(pointer));
				pointer++;
			}
		}
		return pointer;
	}
	
	public static void main(String[] args){
		System.out.println(decodeString("2[20[bc]31[xy]]xd4[rt]"));
	}
}
