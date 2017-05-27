package homework2;

public class Search_Insert_Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
    public int searchInsert(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length-1;
        
        while(l<=r){
            
            int m = l + (r-l)/2;
            
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                
                r = m-1;
                
            }            
            else {//nums[m]<target
                l = m+1;                
            }   
            
        }
        
        return l;
        
    }
}
