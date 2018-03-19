package leetcode;
//202. Happy Number
//https://leetcode.com/problems/happy-number/description/
import java.util.HashSet;
import java.util.Set;

public class Solution_20180311_1 {
	public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int sum = 0;
        while(sum != 1){
        	n = sum;
        	sum = 0;
        	while(n > 0){
        		sum = (n%10) * (n%10) + sum;
        		n = n/10;
        	}
        	if(!set.add(sum))
        		return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
