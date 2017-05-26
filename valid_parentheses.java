package homework2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class valid_parentheses {

	public static void main(String[] args){
		
		valid_parentheses Solution = new valid_parentheses();
		
		String s = "()"; 
			
		System.out.println(Solution.isValid(s));

		
		String s2 = "(123)"; 
		
		System.out.println(Solution.isValid2(s2));
		
	}
	
    static final private Map<Character,Character> mapping = new HashMap<Character,Character>(){
        {
            put('(',')');
            put('{','}');
            put('[',']');
        }
    };
    
	
	
    public boolean isValid(String s) {

        if(s.length()==0 || s==null){
            return false;
        }
        
        
        Stack<Character> stack = new Stack<>();
        
        
        for(char c: s.toCharArray()){
            
            if(mapping.containsKey(c)){
                stack.push(c);
            }
            else if(stack.isEmpty() || c!=mapping.get(stack.pop())){
                return false;
            }  
            
        }
        
        
        return stack.isEmpty();
    	
    }
	
    //follow up
    
    
    public boolean isValid2(String s) {

        if(s.length()==0 || s==null){
            return false;
        }
        
        
        Stack<Character> stack = new Stack<>();
        
        
        
        for(char c: s.toCharArray()){
            
        	if(Character.isLetterOrDigit(c)){
        		continue;
        	}
        	
            if(mapping.containsKey(c)){
                stack.push(c);
            }
            else if(stack.isEmpty() || c!=mapping.get(stack.pop())){
                return false;
            }  
            
        }
        
        
        return stack.isEmpty();
    	
    }
    
    
    
}
