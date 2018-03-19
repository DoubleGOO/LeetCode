package leetcode;

public class Solution_20171012_2 {
	public static String toHex(int num){
		char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		StringBuffer sb = new StringBuffer();
		if(num==0) sb.append('0');
		while(num!=0){
			int temp = num & 15;
			sb.append(map[temp]);
			num = num >>> 4;
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args){
		System.out.println(toHex(-1));
	}
}
