package leetcode;
//454. 4Sum II
//https://leetcode.com/problems/4sum-ii/description/
import java.util.HashMap;
public class Solution_20170918_2 {
	public static int fourSumCount(int[] A,int[] B,int[] C,int[] D){
		HashMap<Integer,Integer> hmAB = new HashMap<>();
		int n = A.length;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				hmAB.put(A[i]+B[j], hmAB.getOrDefault(A[i]+B[j], 0)+1);
			}
		}
		int res = 0;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				res+=hmAB.getOrDefault(-(C[i]+D[j]), 0);
			}
		}
		return res;
	}
	public static void main(String[] args){
		int[] A = {1,2};
		int[] B = {-2,-1};
		int[] C = {-1,2};
		int[] D = {0,2};
		System.out.println(fourSumCount(A,B,C,D));
	}
}
