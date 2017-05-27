package homework2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Intersection_of_Two_Arrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int[] intersect(int[] nums1, int[] nums2) {

        if(nums1.length==0 || nums2.length==0){
            return new int[]{};
        }

        
        List<Integer> list = new ArrayList<>();
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int p1 = 0;
        int p2 = 0;
        
        while(p1<nums1.length && p2<nums2.length){
            
            if(nums1[p1] < nums2[p2]){
                p1++;
            }
            else if(nums1[p1] > nums2[p2]){
                p2++;
            }
            else{  //nums1[p1] == nums2[p2]
                list.add(nums1[p1]);
                p1++;
                p2++;
            }
            
        }
        

        int[] res = new int[list.size()];        
        
        int i=0;
        for(int num:list){
            
            res[i++] = num;
        }
        
        
        return res;
        
    }
	
	
}
