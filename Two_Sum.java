package homework2;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{1,3,4};
		int target = 6;
		
		Two_Sum solution = new Two_Sum();
		
		int[] res = solution.twoSum(nums, target);
		System.out.println(res[0]+" "+res[1]);
		
		
	}

    public int[] twoSum(int[] nums, int target) {

    	
    	
        Map<Integer,Integer> mapping = new HashMap<>();
        
        for(int i=0; i<nums.length ;i++){
            
            if(mapping.containsKey(target-nums[i])){
                return new int[]{mapping.get(target-nums[i]),i};
            }
            
            
            mapping.put(nums[i],i);
        }
    
        throw new IllegalArgumentException("No two sum solution");

    }	
	
}
