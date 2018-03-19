package leetcode;
//520. Detect Capital
//https://leetcode.com/problems/detect-capital/description/
public class Solution_20170908_4 {
	public static boolean detectCapitalUser(String word){
		int flag = 1;
		int i = 0;
		for(i = 0 ;i<word.length();i++){
			char temp = word.charAt(i);
			if((int)temp>64&&(int)temp<91&&flag==1) continue;
			else if(i == 1&&flag==1){
				flag=2;
				continue;
			}
			else if(i==0&&flag==1){
				flag = 3;
				continue;
			}
			else if((flag == 3||flag == 2)&&(int)temp>96&&(int)temp<123){
				continue;
			}
			break;
		}
		if(i==word.length())
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Amazon";
		if(detectCapitalUser(a))
			System.out.println("true");
		else
			System.out.println("false");
	}

}
