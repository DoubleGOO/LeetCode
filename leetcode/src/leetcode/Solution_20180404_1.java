package leetcode;

public class Solution_20180404_1 {
	//12
//	public double power(double base, int exponent){
//		double result = 1;
//		for(int i = 0;i<Math.abs(exponent);i++){
//			result*=base;
//		}
//		if(exponent<0){
//			result = 1/result;
//		}
//		return result;
//	}
	//13
//	public static void reOrderArray(int [] array) {
//		int evenPosition = 0;
//		int oddPosition = 0;
//		for(int i = 0;i<array.length;i++){
//			if(isEven(array[i])){
//				evenPosition = i;
//				break;
//			}
//		}
//		for(int i = array.length - 1;i>=0;i--){
//			if(!isEven(array[i])){
//				oddPosition = i;
//				break;
//			}
//		}
//		if(evenPosition>oddPosition)
//			return;
//		while(evenPosition<oddPosition){
//			for(int j = array.length - 2;j>=0;j--){
//				if(isEven(array[j])&&!isEven(array[j+1]))
//					exchange(array,j,j+1);
//			}
//			evenPosition++;
//			oddPosition--;
//		}
//    }
//	public static void exchange(int[] array,int a,int b){
//		int temp = array[a];
//		array[a] = array[b];
//		array[b] = temp;
//	}
//	public static boolean isEven(int number){
//		return number%2==0;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
