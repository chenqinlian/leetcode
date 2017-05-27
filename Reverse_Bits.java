package homework2;

public class Reverse_Bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int reverseBits(int n) {
        int res = 0;
        
        for(int i=0; i<32; i++){
            
        	res += n&1;	
        	n >>>= 1;	//notice the differece of ">>" and ">>>"
        	
            if(i<31){
                res <<= 1;//res =res<<1;
            }    
        }
        
        return res;
    }
}
