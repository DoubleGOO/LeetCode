package leetcode;
// 621. Task Scheduler
//https://leetcode.com/problems/task-scheduler/description/

import java.util.Arrays;
import java.util.Comparator;

public class Solution_20171214_1 {
	/************************wrong*************************/
//	public static int leastInterval(char[] tasks,int n){
//		Integer[] table = new Integer[26];
//		for(int i = 0;i<26;i++){
//			table[i] = new Integer(0);
//		}
//		for(char c:tasks){
//			table[(int)c-65]++;
//		}
//		Arrays.sort(table, new myComparator());
//		int pointer = 0;
//		int position = 0;
//		int relPosition = 0;
//		int result = 0;
//		boolean flag = false;
//		while(table[pointer]!=0){
//			if(flag){
//				if(relPosition==table[pointer]){
//					result+=1;
//					position = position - table[pointer] +1;
//					if(position>=0){
//						pointer++;
//					}else{
//						table[pointer] = -(position-1);
//						result -= 1;
//						flag = false;
//					}
//				}else{
//					position = position - table[pointer];
//					if(position>=0){
//						pointer++;
//					}else{
//						table[pointer] = -position;
//						flag = false;
//					}
//				}
//			}
//			else{
//				position = (table[pointer]-1)*n;
//				relPosition = table[pointer];
//				result += (table[pointer]-1)*(n+1)+1;
//				pointer++;
//				flag = true;
//			}
//		}
//		return result;
//	}
//	public static class myComparator implements Comparator<Integer>{
//		public int compare(Integer a, Integer b){
//			return b - a;
//		}
//	}
	public static int leastInterval(char[] tasks, int n) {

        int[] c = new int[26];
        for(char t : tasks){
            c[t - 'A']++;
        }
        Arrays.sort(c);
        int i = 25;
        while(i >= 0 && c[i] == c[25]) i--;

        return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);
    }
	public static void main(String[] args) {
		char[] tasks = {'A','A','A','A','A','B','B','C','C','D','E'};
		System.out.println(leastInterval(tasks,2));
//		System.out.println((int)tasks[0]);
	}
}
