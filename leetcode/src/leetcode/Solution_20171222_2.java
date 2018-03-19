package leetcode;
//514. Freedom Trail
//https://leetcode.com/problems/freedom-trail/description/
public class Solution_20171222_2 {
	/******贪心算法不对，只能用DP******/
	public static int findRotateSteps(String ring, String key) {
		int position = 0;
		int result = 0;
        for(char k:key.toCharArray()){
        	int rightNumber = 0;
    		int leftNumber = 0;
        	while(ring.charAt((position+rightNumber)%ring.length())!=k){
        		rightNumber++;
        	}
        	while(ring.charAt((ring.length() + (position-leftNumber))%ring.length())!=k){
        		leftNumber++;
        	}
        	if(rightNumber<leftNumber){
        		result = result + rightNumber + 1;
        		position = (position + rightNumber)%ring.length();
        	}else{
        		result = result + leftNumber + 1;
        		position = (ring.length() + (position-leftNumber))%ring.length();
        	}
        }
        return result;
    }
	public static void main(String[] args) {
		System.out.println(findRotateSteps("iotfo", "fioot"));
	}
}
