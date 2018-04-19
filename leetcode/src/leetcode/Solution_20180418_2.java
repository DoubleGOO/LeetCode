package leetcode;
//�ж϶�����������������

//BST�ĺ������еĺϷ������ǣ�����һ������S�����һ��Ԫ����x ��Ҳ���Ǹ�����
//���ȥ�����һ��Ԫ�ص�����ΪT����ôT���㣺T���Էֳ����Σ�ǰһ�Σ���������С��x��
//��һ�Σ�������������x���������Σ����������ǺϷ��ĺ������С������ĵݹ鶨�� : ) ��

public class Solution_20180418_2 {
	
	public static boolean VerifySquenceOfBST(int [] sequence) {
	      if(sequence.length<=0){
	    	  return false;
	      }
	      return isLastOrder(sequence,0,sequence.length);
	}
	
	public static boolean isLastOrder(int[] sequence,int start,int length){
		if(length<=2){
			return true;
		}
		int mid = length;
		boolean flag = true;
		for(int i = start;i<length;i++){
			if(flag&&sequence[i]>sequence[start+length-1]){
				mid = i;
				flag = false;
			}
			if(!flag&&sequence[i]<sequence[start+length-1]){
				return false;
			}
		}
		if(mid == length)
			return isLastOrder(sequence,0,length-1);
		return isLastOrder(sequence,0,mid)&&isLastOrder(sequence,mid,length-mid-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,6,9,8,11,17,15,12,10};
		if(VerifySquenceOfBST(arr))
			System.out.println("yes");
		else
			System.out.println("no");
	}

}
