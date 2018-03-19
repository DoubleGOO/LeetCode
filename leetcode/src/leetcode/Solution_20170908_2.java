package leetcode;
import java.util.Hashtable;
//167. Two Sum II - Input array is sorted
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class Solution_20170908_2 {
	public static int[] twoSum(int[] numbers,int target){
		int[] result = new int[2];
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i=0;i<numbers.length;i++){
			table.put(numbers[i], i);
		}
		int i = 0;
		while(numbers[i]<=target&&i<numbers.length){
			Integer temp = table.get(target - numbers[i]);
			if(temp != null){
				result[0] = i+1;
				result[1] = temp+1;
				return result;
			}
			i++;
		}
		return result;
	}
	public static int[] twoSum_standar(int[] numbers,int target){
		int[] result = new int[2];
		int left = 0;
		int right = numbers.length - 1;
		while(left<right){
			int total = numbers[left]+numbers[right];
			if(total == target){
				result[0] = left+1;
				result[1] = right+1;
				return result;
			}
			if(total<target){
				left += 1;
			}
			else{
				right-= 1;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,7,11,15};
		int[] result = twoSum_standar(numbers,9);
		System.out.println(result[0]+" "+result[1]);
	}

}
