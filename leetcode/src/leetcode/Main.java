//package leetcode;
//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        @SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        char[][] arr = new char[n][m];
//        sc.nextLine();
//        for(int i = 0;i<n;i++){
//        	String s = sc.nextLine();
//        	for(int j = 0;j<m;j++){
//        		arr[i][j] = s.charAt(j);
//        	}
//        }
//        int count = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = 0; j < m; j++){
//                if(arr[i][j]=='Y'||arr[i][j]=='G'){
//                	if(i==0||j==0){
//                		count++;
//                	}else if(arr[i-1][j-1]!='Y'&&arr[i-1][j-1]!='G'){
//                		count++;
//                	}
//                }
//                if(arr[i][j]=='B'||arr[i][j]=='G'){
//                	if(i==0||j==m-1){
//                		count++;
//                	}else if(arr[i-1][j+1]!='B'&&arr[i-1][j+1]!='G'){
//                		count++;
//                	}
//                }
//            }
//        } 
//        System.out.println(count);
//    }
//    
//}
package leetcode;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = 0;
        m = m - n;
        float i = 0.5f;
        while(m>0){
        	m = (int) (m - i * 2);
        	ans ++;
        }
        System.out.println(ans);
    }
}


//package leetcode;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int ans = 0;
//        int n = sc.nextInt();
//        int[] number = new int[n];
//        for(int i = 0;i<n;i++){
//        	number[i] = sc.nextInt();
//        }
//        Arrays.sort(number);
//        int firstSum = 0;
//        int secondSum = 0;
//        boolean flag = true;
//        for(int i = n-1;i>=0;i--){
//        	if(flag)
//        		firstSum += number[i];
//        	else
//        		secondSum += number[i];
//        	flag = !flag;
//        }
//        ans = firstSum - secondSum;
//        System.out.println(ans);
//    }
//}


