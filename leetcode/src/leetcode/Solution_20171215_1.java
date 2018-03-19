package leetcode;

public class Solution_20171215_1 {
	public static boolean canJump(int[] nums) {
        if(nums.length<2)return true;
        int position = 0;
        while(position+nums[position]<nums.length-1){
        	int maxForward = 0;
        	int move = 0;
        	for(int i = 1;i<=nums[position];i++){
        		if(maxForward<=nums[position+i]+(i-1)){
        			maxForward = nums[position+i]+(i-1);
        			move = i;
        		}
        	}
        	if(maxForward>=nums[position]&&nums[position]!=0){
        		position += move;
        	}else return false;
        }
        return true;
    }
	/**漂亮的写法（同为贪心算法）
	 *  public boolean canJump(int[] nums) {
        
        if(nums == null)
            return false;

     
        int lastPos = nums.length -1;
        for(int i = nums.length - 2; i>=0; i--) {
            
            if(i + nums[i] >= lastPos) {
                lastPos = i;
            }
            
        }
        
        return lastPos == 0;
 

    }
	 * 
	 * 
	 * **/
	public static void main(String[] args) {
		int[] test = {3,2,1,0,4};
		if(canJump(test))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
