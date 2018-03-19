package leetcode;
import java.util.Hashtable;
//Two Sum 888
//https://leetcode.com/problems/two-sum/description/
public class Solution_20170905_1 {
	public static int[] twoSum(int[] nums, int target) {
		int[] value = new int[2];
		outloop://跳出外部循环
        for(int i=0;i<nums.length-1;i++){
        	for(int j=i+1;j<nums.length;j++){
        		if(nums[i]+nums[j]==target){
        			value[0] = i;
        			value[1] = j;
        			break outloop;
        		}
        	}
        }
        return value;
    }
	public static int[] twoSum_standar(int[] nums,int target){
		int[] result = new int[2];
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i = 0;i<nums.length;i++){
			Integer temp = table.get(target-nums[i]);
			if(temp!=null){
				result[0] = temp;
				result[1] = i;
				break;
			}
			table.put(nums[i], i);//把里头的值作为key来查找
		}
		return result;
	}
	public static void main(String[] args){
		int[] nums = {3,4,3,6};
		int[] temp = twoSum_standar(nums,6);
		for(int i = 0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}
}
