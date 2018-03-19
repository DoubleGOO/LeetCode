package leetcode;
//7. Reverse Integer
//https://leetcode.com/problems/reverse-integer/description/
public class Solution_20171002_1 {
	public static int reverse(int x){
		if(x<10&&x>-10)
			return x;
		int flag = 0;
		if(x<0)
			flag = 1;
		String s = Integer.toString(x);
		char[] c = s.toCharArray();
		if(flag == 0 ){
			for(int i = 0;i<c.length/2;i++){
				char temp = c[i];
				c[i] = c[c.length-i-1];
				c[c.length-i-1] = temp;
			}
		}
		else{
			for(int i = 0;i<c.length/2;i++){
				char temp = c[i+1];
				c[i+1] = c[c.length-i-1];
				c[c.length-i-1] = temp;
			}
		}
			
		s = new String(c);
		if(Integer.parseInt(s.substring(0, s.length()-1))<Integer.MIN_VALUE/10||Integer.parseInt(s.substring(0, s.length()-1))>Integer.MAX_VALUE/10)
			return 0;
		return Integer.parseInt(s);
	}
	public static void main(String[] args){
		System.out.println(reverse(-123));
	}
	
}
