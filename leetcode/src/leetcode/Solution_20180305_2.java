package leetcode;
//9. Palindrome Number
//https://leetcode.com/problems/palindrome-number/description/
public class Solution_20180305_2 {
	public static boolean isPalindrome(int x){
		int y = 0;
		int temp = x;
		while(x>0){
			y = y * 10 + x % 10;
			x = x/10;
		}
		if(y==temp)
			return true;
		return false;
	}
	public static void main(String[] args) {
		
	}
}
