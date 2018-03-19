package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//491. Increasing Subsequences
//https://leetcode.com/problems/increasing-subsequences/description/
public class Solution_20170922_2 {
	@SuppressWarnings("unchecked")
	public static List<List<Integer>> findSubsequences(int[] nums){
		Set<List<Integer>> res = new HashSet<List<Integer>>();
		List<Integer> sub = new ArrayList<Integer>();
		findSubsequence(res,sub,0,nums);
		@SuppressWarnings({ "rawtypes" })
		List result = new ArrayList(res);
		return result;
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void findSubsequence(Set<List<Integer>> res,List<Integer> sub,int index,int[] nums){
		if(sub.size()>=2)
			res.add(new ArrayList(sub));
		for(int i = index;i<nums.length;i++){
			if(sub.size() == 0 || sub.get(sub.size() - 1) <= nums[i]) {
				sub.add(nums[i]);
				findSubsequence(res,sub,i+1,nums);
				sub.remove(sub.size()-1);
			}
		}
	}
	public static void main(String[] args){
	   int nums[] = {4,6,7,8};
	   System.out.println(findSubsequences(nums));
    }
}
