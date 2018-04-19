package leetcode;
//判断二叉树后续遍历数列

//BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），
//如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，
//后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。完美的递归定义 : ) 。

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
