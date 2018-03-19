package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//435. Non-overlapping Intervals
//https://leetcode.com/problems/non-overlapping-intervals/description/
public class Solution_20171212_1 {
	public static class Interval {
		 int start;
		 int end;
		 Interval() { start = 0; end = 0; }
		 Interval(int s, int e) { start = s; end = e; }
	}
//	public static int eraseOverlapIntervals(Interval[] intervals) {
//		if(intervals.length<1) return 0;
//        quickSort(intervals,0,intervals.length-1);
//        ArrayList<Interval> al = new ArrayList<>();
//        int count = 0;
//        al.add(intervals[0]);
//        for(int i = 1;i<intervals.length;i++){
//        	if(intervals[i].start>=al.get(count).end){
//        		al.add(intervals[i]);
//        		count++;
//        	}else if(intervals[i].end<al.get(count).end){
//        		al.remove(count);
//        		al.add(intervals[i]);
//        	}
//        }
//        return intervals.length-al.size();
//    }
//	public static void quickSort(Interval[] intervals,int left,int right){
//		if(left>right)
//			return;
//		int i = left;
//		int j = right;
//		Interval reference = intervals[left];
//		while(i<j){
//			while((intervals[j].start>reference.start||(intervals[j].start==reference.start&&intervals[j].end>=reference.end))&&i<j){
//				j--;
//			}
//			while((intervals[i].start<reference.start||(intervals[i].start==reference.start&&intervals[i].end<=reference.end))&&i<j){
//				i++;
//			}
//			if(i<j){
//				Interval temp = intervals[i];
//				intervals[i] = intervals[j];
//				intervals[j] = temp;
//			}
//		}
//		intervals[left] = intervals[i];
//		intervals[i] = reference;	
//		quickSort(intervals,left,i-1);
//		quickSort(intervals,i+1,right);
//	}
	/*******standar********/
	public static int eraseOverlapIntervals(Interval[] intervals) {
        if (intervals.length == 0)  return 0;

        Arrays.sort(intervals, new myComparator());
        int end = intervals[0].end;
        int count = 1;        

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i].start >= end) {
                end = intervals[i].end;
                count++;
            }
        }
        return intervals.length - count;
    }
    
    public static class myComparator implements Comparator<Interval> {
        public int compare(Interval a, Interval b) {
            return a.end - b.end;
        }
    }
	public static void main(String[] args) {
		Interval[] intervals = new Interval[4];
		intervals[0] = new Interval(2,3);
		intervals[1] = new Interval(1,2);
		intervals[2] = new Interval(3,4);
		intervals[3] = new Interval(1,3);
		System.out.println(eraseOverlapIntervals(intervals));
	}
}
