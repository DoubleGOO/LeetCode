package leetcode;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
//347. Top K Frequent Elements
//https://leetcode.com/problems/top-k-frequent-elements/description/
public class Solution_20170919_1 {
	public static List<Integer> topKFrequent(int[] nums,int k){
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i = 0;i<nums.length;i++){
			hm.put(nums[i],hm.getOrDefault(nums[i], 0)+1);
		}
		Object[] temp = hm.values().toArray();
		Arrays.sort(temp);
		int limit = (int)temp[temp.length-k];
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i:nums){
			if(hm.get(i)!=null&&hm.get(i)>=limit){
				al.add(i);
				hm.remove(i);
			}
		}
		return al;
	}
	public static void main(String[] args){
		int nums[] = {1,1,1,2,2,3};
		System.out.println(topKFrequent(nums,2));
	}
}
