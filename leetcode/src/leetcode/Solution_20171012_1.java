package leetcode;
//342. Power of Four
//https://leetcode.com/problems/power-of-four/discuss/
public class Solution_20171012_1 {
	public boolean isPowerOfFour(int num){
		return num > 0 && (num&(num-1)) == 0 && (num&0x55555555)!=0;
	}
}
