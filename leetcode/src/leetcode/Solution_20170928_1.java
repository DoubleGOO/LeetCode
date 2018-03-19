package leetcode;
//400. Nth Digit
//https://leetcode.com/problems/nth-digit/description/
public class Solution_20170928_1 {
	public static int findNthDigit(int n ){
		int temp = n;
		int count = 0;
		int save = 0;
		while(temp>0){
			save = temp;
			temp -= 9*Math.pow(10, count)*(count+1);
			count++;
		}
		temp = save;
		int result = (int) Math.pow(10, count-1)+(temp-1)/count;
		return (int)Integer.toString(result).charAt((temp-1)%count)-48;
	}
	public static void main(String[] args){
		System.out.println(findNthDigit(1000000000));
	}
}
