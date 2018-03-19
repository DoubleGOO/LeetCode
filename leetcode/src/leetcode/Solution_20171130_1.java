package leetcode;
//110. Balanced Binary Tree
//https://leetcode.com/problems/balanced-binary-tree/description/
public class Solution_20171130_1 {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x; }
	}
	/*���������жϣ�ÿ���ڵ㶼��һ�����̽�飬ʱ�临�Ӷ�ΪO(n^2)*/
	public static boolean isBalanced_up(TreeNode root){
		if(root == null)
			return true;
		int left = depth(root.left);
		int right = depth(root.right);
		return Math.abs(left-right)<2&&isBalanced_up(root.left)&&isBalanced_up(root.right);
	}
	public static int depth(TreeNode root){
		if(root==null)
			return 0;
		return Math.max(depth(root.left),depth(root.right))+1;
	}
	/*���������жϣ�û���ظ����㣬����������ƽ��ֱ�ӷ���-1*/
	public boolean isBalanced_bottom(TreeNode root){
		return dfsHeight(root) != -1;
	}
	public int dfsHeight(TreeNode root){
        if (root == null) {
            return 0;
        }
        
        int left = dfsHeight(root.left);
        int right = dfsHeight(root.right);
        if (left == -1 || right == -1 || Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }
	public static void main(String[] main){
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		t1.right = t2;
		if(isBalanced_up(t1))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
