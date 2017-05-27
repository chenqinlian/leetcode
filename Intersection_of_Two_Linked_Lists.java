package homework2;

class ListNode{
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }	
	
}


public class Intersection_of_Two_Linked_Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	//Solution1
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        int countA = getCount(headA);
        int countB = getCount(headB);
        
        if(countA ==0 || countB==0){return null;}
        
        ListNode pA = headA;
        ListNode pB = headB;
        
        
        if(countA > countB){
            
            int diff = countA-countB;
            
            while(diff-->0){
                pA = pA.next;
            }
        
        }
        
        else if(countA < countB ){
            
            int diff = countB-countA;    
            
            while(diff-->0){
                pB = pB.next;
            }
        }
        

            
        while(pA != pB){
            pA = pA.next;
            pB = pB.next;
        }
            
        return pA;
            
        
        
    }
    
    
    private int getCount(ListNode headA){
        
        
        ListNode p = headA;
        int count = 0;
        
        while(p!=null){
            p=p.next;
            count++;
        }
        
        return count;
    }
    
    //Solution2
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        
        ListNode pA = headA;
        ListNode pB = headB;
        
        if(pA == null || pB == null){
            return null;    
        }
        
        while( pA!=pB ){
            
            pA = pA==null? headB:pA.next ;
            pB = pB==null? headA:pB.next ;            
        }
        
        return pA;
    }
        
    
    
    
	
}

