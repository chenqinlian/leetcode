package homework2;

public class Valid_Perfect_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Valid_Perfect_Square solution = new Valid_Perfect_Square();
		
		int num = 24;
		
		System.out.println(solution.isPerfectSquare(num));
		
	}

    public boolean isPerfectSquare(int num) {
        
        int l = 0;
        int r = num;
        
        while(l<=r){
            
            int mid = l + (r-l)/2;
            
            //System.out.println(" l "+ l + " r " + r + " mid " + mid);
            
            if(mid*mid==num){
            	return true;
            }
            else if( mid*mid>num ){
            	r = mid - 1;
            }
            else if( mid*mid<num ){
                l = mid + 1;
            }
        }

        return false;
        
    }	
	
}
