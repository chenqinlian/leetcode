package homework2;

import java.util.HashSet;

public class Intersection_of_Two_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> setting = new HashSet<>(); 
        HashSet<Integer> intersects = new HashSet<>();
        
        for(int num:nums1){
            setting.add(num);
        }
     
        for(int num:nums2){
            if(setting.contains(num)){
                intersects.add(num);
            }
        }
        
        int len = intersects.size();
        int[] res = new int[len];

        int index = 0;
        for(int num:intersects){
            
            res[index++]=num;
        }
    
        
        return res;
        
    }
	
	
}
