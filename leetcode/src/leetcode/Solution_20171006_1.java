package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Solution_20171006_1 {
	public static List<Integer> findMinHeightTrees(int n, int[][] edges) {
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> result = new ArrayList<>();
        List<Integer>[] tool = new ArrayList[n];
        if(n==1){
        	result.add(0);
        	return result;
        }
        if(n==2){
        	result.add(0);
        	result.add(1);
        	return result;
        }
        for(int i = 0;i<n-1;i++){
        	if(tool[edges[i][0]]==null)
        		tool[edges[i][0]] = new ArrayList<>();
        	tool[edges[i][0]].add(edges[i][1]);
        	if(tool[edges[i][1]]==null)
        		tool[edges[i][1]] = new ArrayList<>();
        	tool[edges[i][1]].add(edges[i][0]);
        }
        int count = 0;
        while(count!=n-2&&count!=n-1){
        	hs.clear();
        	for(int i = 0;i<n;i++){
        		if(tool[i].size()==1&&!hs.contains(i)){
        			int temp = (int) tool[i].get(0);
        			tool[temp].remove((Object)i);
        			tool[i].clear();
        			hs.add(temp);
        			count ++;
        		}
        	}
        }
        result = new ArrayList<Integer>(hs);
        return result;
    }
	public static void main(String[] args){
		int[][] edges = {{0,3},{1,3},{2,3},{4,3},{5,4}};
		System.out.println(findMinHeightTrees(6, edges));
	}
}
