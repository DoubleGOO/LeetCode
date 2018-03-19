package leetcode;

import java.util.Arrays;

//556. Next Greater Element III
//https://leetcode.com/problems/next-greater-element-iii/description/
public class Solution_20170914_1 {
	public static int nextGreaterElement(int n){
		Integer a = n;
		String str = a.toString();
		int length = str.length();
		int[] value = new int[length];
		for(int i = 0;i<length;i++){
			value[i] = (int)(str.charAt(i)-'0');
		}
		for(int i = value.length-1;i>=0;i--){
			int flag = 0;
			for(int j = 1;j<value.length-i;j++){
				if(value[i]<value[i+j]&&value[i+flag]!=value[i+j]){
					flag = j;
					continue;
				}
			}
			if(flag!=0){
				int temp = value[i];
				value[i] = value[i+flag];
				value[i+flag] = temp;
				int[] arrayChild = Arrays.copyOfRange(value, i+1, length); 
				Arrays.sort(arrayChild);
				for(int x = 0;x<length-i-1;x++){
					value[i+x+1] = arrayChild[x]; 
				}
				long result = 0;
				for(int m = 0;m<length;m++){
					result += Math.pow(10, length-m-1)*value[m];
				}
				return result>Integer.MAX_VALUE?-1:(int)result;
			}
		}
		return -1;
	}
	public static void main(String[] args){
		System.out.println(nextGreaterElement(1999999999));
	}
}
//13452
//12432