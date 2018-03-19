package leetcode;
import java.util.Hashtable;
import java.util.Set;
import java.util.HashSet;
//Contains Duplicate II
//https://leetcode.com/problems/contains-duplicate-ii/description/
public class Solution_20170905_2 {
	public static boolean containsNearbyDuplicate(int[] nums,int k){
		Hashtable<Integer,Integer> table = new Hashtable<Integer,Integer>();
		for(int i=0;i<nums.length;i++){
			Integer temp = table.get(nums[i]);
			if(temp!=null)
			{
				if(i-temp<=k)
					return true;
			}
			table.put(nums[i], i);
		}
		return false;
	}
	public static boolean containsNearbyDuplicate_standar(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
 }
	public static void main(String[] args){
		int[] nums = {1,2,1,3};
		System.out.println(containsNearbyDuplicate(nums,2));
	}
}
