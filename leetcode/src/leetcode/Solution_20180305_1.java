package leetcode;
//Submission Detail
//https://leetcode.com/submissions/detail/143554332/
public class Solution_20180305_1 {
	public static int reverse(int x){
		int y = 0;
		int lastY = 0;
		while(Math.abs(x)>0){
			y = y * 10 + x % 10;
			if( (y - x%10) /10 != lastY)
				return 0;
			x = x/10;
			lastY = y;
		}
		return y;
	}
//	public int reverse(int x) {
//		int flag = 0;
//		if(x<Integer.MIN_VALUE||x>Integer.MAX_VALUE)
//			return 0;
//		if(x<0)
//			flag = 1;
//		x= Math.abs(x);
//		String s = Integer.toString(x);
//		char[] c = s.toCharArray();
//		for(int i = 0;i<c.length/2;i++){
//			char temp = c[i];
//			c[i] = c[c.length-i-1];
//			c[c.length-i-1] = temp;
//		}
//		s = new String(c);
//		if(flag==0)
//			return Integer.parseInt(s);
//		return -Integer.parseInt(s);
//	}
	public static void main(String[] args) {
		System.out.println(reverse(-123));
	}
}
