package leetcode;
import java.util.Scanner;

//import java.util.Calendar;
//import java.util.Scanner;
//
//public class Main {  
//	  
//	public static void  main(String[] args)
//    {
//		Scanner in = new Scanner(System.in);
//        Calendar calendar =Calendar.getInstance(); //当前日期
//        int year = in.nextInt();
//        if(!(year<=400&&year>=0)){
//        	System.out.println(-1);
//        	return;
//        }
//        int nextYear = 1900+year;
//        int day = in.nextInt();
//        if(!(day<=6&&day>=0)){
//        	System.out.println(-1);
//        	return;
//        }
//        int count = 0;
//        if(day==0)
//        	day=7;
//        Calendar cstart =Calendar.getInstance(); 
//        Calendar cend =Calendar.getInstance(); 
//        cstart.set(1900, 0, 1);
//        cend.set(nextYear, 0, 1);
//        calendar.set(1900, 0, day);
//         
//        Calendar c = (Calendar)calendar.clone();
//
//        for(;c.before(cend);c.add(Calendar.DAY_OF_YEAR, 7))
//        {
//            if(c.get(Calendar.DATE)==13)
//            	count++;
//        }
//        System.out.println(count);
//    }
//
//     
//}
////打印
//public static void printf(Calendar calendar)
//{
//    System.out.println(calendar.get(Calendar.YEAR)+"-"+(1+calendar.get(Calendar.MONTH))+"-"+calendar.get(Calendar.DATE));
//     
//}

import java.io.IOException;  


public class Main {  
	  
    public static void main(String[] args) throws IOException {  
    	Scanner in = new Scanner(System.in);
    	String s = in.nextLine();
    	if(s.length()==0)
    		return;
    	int number = in.nextInt();
    	if(number<0||number>s.length())
    		return;
        byte []buf = s.getBytes("GBK");  
        System.out.println(outputGBK(buf,number));   
    }  
  
  
    public static String outputGBK(byte[] buf, int number) throws IOException {  
        int count = 0;     
        int i =0;  
        for(i = number-1 ; i >= 0 ; i--){  
            if(buf[i]<0)  //汉字为负
                count++;  
            else  
                break;            
        }  
        String s =null;   
        if(count%2 == 0)  
            s =new String(buf,0,number,"GBK");  
        else  
            s= new String(buf,0,number-1,"GBK");  
        return s;  
    }  
}

//public class Main {
//
//	
//	public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int number = in.nextInt();
//        if (number < 1)    
//	        return;    
//	    int sum = 6; 
//	    int flag = 0;   
//	    int count = (int) Math.pow(sum, number);   
//	    int[][] resultTable = new int[2][sum * number + 1];    
//	    
//	    for (int i = 1; i <= sum; i++)    
//	    	resultTable[0][i] = 1;    
//	    
//	    for (int k = 2; k <= number; ++k) {    
//	        for (int i = 0; i < k; ++i)    
//	        	resultTable[1 - flag][i] = 0;    
//	        for (int i = k; i <= sum * k; ++i) {    
//	        	resultTable[1 - flag][i] = 0;    
//	            for (int j = 1; j <= i && j <= sum; ++j)    
//	            	resultTable[1 - flag][i] += resultTable[flag][i - j];    
//	        }    
//	        flag = 1 - flag;    
//	    }    
//	    System.out.print("["); 
//	    for (int i = number; i <= sum * number-1; i++) {    
//	    	
//	        double result = (double) ( resultTable[flag][i]*1.0 / count);   
//	        String double_str = String.format("%.5f", result);
//	    	result = Double.valueOf(double_str);
//	        System.out.print("["+i+", "+result+"]"+", ");  
//	    } 
//	    double result = (double) ( resultTable[flag][sum * number]*1.0 / count);   
//        String double_str = String.format("%.5f", result);
//    	result = Double.valueOf(double_str);
//        System.out.print("["+sum * number+", "+result+"]");  
//	    System.out.println("]"); 
//    }
//}

 

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = in.nextInt();
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int[][] table = new int[12][13];
//        int[][] lastTable = new int[12][13];
//        boolean[][] bTable = new boolean[12][13]; 
//        table[2][2] = 1;
//        bTable[2][2] = true;
//        while(count > 0){
//        	count--;
//        	
//        	for(int i = 0;i<12;i++){
//        		for(int j = 0;j<13;j++){
//            		lastTable[i][j] = table[i][j];
//            	}
//        	}
//        	for(int i = 0;i<12;i++){
//        		for(int j = 0;j<13;j++){
//            		if(lastTable[i][j]>0){
//            			bTable[i][j] = true;
//            		}else{
//            			bTable[i][j] = false;
//            		}
//            	}
//        	}
//        	for(int i = 0;i<12;i++){
//        		for(int j = 0;j<13;j++){
//            		table[i][j] = 0;
//            	}
//        	}
//        	for(int i = 2;i<10;i++){
//        		for(int j = 2;j<11;j++){
//        			if(bTable[i+1][j+2])
//        				table[i][j] += lastTable[i+1][j+2];
//        			if(bTable[i+1][j-2])
//        				table[i][j] += lastTable[i+1][j-2];
//        			if(bTable[i+2][j+1])
//        				table[i][j] += lastTable[i+2][j+1];
//        			if(bTable[i+2][j-1])
//        				table[i][j] += lastTable[i+2][j-1];
//        			if(bTable[i-1][j+2])
//        				table[i][j] += lastTable[i-1][j+2];
//        			if(bTable[i-1][j-2])
//        				table[i][j] += lastTable[i-1][j-2];
//        			if(bTable[i-2][j+1])
//        				table[i][j] += lastTable[i-2][j+1];
//        			if(bTable[i-2][j-1])
//        				table[i][j] += lastTable[i-2][j-1];
//            	}
//        	}
//        }
//        System.out.println(table[x+2][y+2]%1000000007);
//    }
//}

//import java.util.Scanner;
//public class Main {
//	public static int result = 0;
//	public static int x = 0;
//	public static int y = 0;
//	public static int count = 0;
//	
//	public static void helper(int cx,int cy,int i){
//		if(cx<0||cx>8||cy<0||cy>9)
//			return;
//		if(i<count){
//			helper(cx+1,cy+2,i+1);
//			helper(cx+2,cy+1,i+1);
//			helper(cx+2,cy-1,i+1);
//			helper(cx+1,cy-2,i+1);
//			helper(cx-1,cy-2,i+1);
//			helper(cx-2,cy-1,i+1);
//			helper(cx-2,cy+1,i+1);
//			helper(cx-1,cy+2,i+1);
//		}else if(i == count){
//			if(cx == x && cy == y)
//				result = ++result%1000000007;
//		}
//		return;
//	}
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        count = in.nextInt();
//        x = in.nextInt();
//        y = in.nextInt();
//        helper(0,0,0);
//        System.out.println(result);
//    }
//}

//import java.util.*;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        boolean findFlag = false;
//        int count = in.nextInt();
//        int[] number = new int[count];
//        for(int i = 0;i<count;i++){
//        	number[i] = in.nextInt();
//        }
//        for(int i:number){
//        	if(i%2==1){
//        		System.out.println("No");
//        		continue;
//        	}
//        	for(int j = 2;j<=i/2;j++){
//        		int h = i/j;
//        		if(h*j==i){
//        			if(h%2==1||j%2==1){
//        				System.out.println(h + " " + j);
//        				findFlag = true;
//        				break;
//        			}
//        		}
//        		continue;
//        	}
//        	if(findFlag){
//        		findFlag = false;
//        	}else{
//        		System.out.println("No");
//        	}
//        }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int count = in.nextInt();
//        int result = 0;
//        in.nextLine();
//        String s = in.nextLine();
//        String[] sArray = s.split(" ");
//        for(String str:sArray) {
//            String[] temp = str.split(":");
//            int a = Integer.parseInt(temp[0]);
//            int b = Integer.parseInt(temp[1]);
//            if(a>=0&&a<=23&&b>=0&&b<=59){
//            	if(a==b){
//            		result++;
//            	}else if((a%10==a/10)&&(b%10==b/10)){
//            		result++;
//            	}else if((a%10==b/10)&&(b%10==a/10)){
//            		result++;
//            	}
//            }
//        }
//        System.out.println(result);
//    }
//}


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


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int ans = 0;
//        m = m - n;
//        float i = 0.5f;
//        while(m>0){
//        	m = (int) (m - i * 2);
//        	ans ++;
//        }
//        System.out.println(ans);
//    }
//}


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


