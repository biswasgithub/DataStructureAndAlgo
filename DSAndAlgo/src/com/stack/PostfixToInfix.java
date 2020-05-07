package com.stack;

import java.util.Stack;

public class PostfixToInfix {
	
	public static boolean isOperand(char x) 
	{ 
	    return (x >= 'a' && x <= 'z') || 
	            (x >= 'A' && x <= 'Z'); 
	} 
	
	public static String getInfix(String exp) {
		Stack<String> s = new Stack<String>(); 
		  
	    for (int i = 0; i < exp.length(); i++) 
	    {
	    	if(isOperand(exp.charAt(i))) {
	    		s.push(exp.charAt(i) +"");
	    	}
	    	
	    	else {
	    		String op1=s.peek();  // peek 1st element without removing
	    		s.pop(); // removing 1st element from stack
	    		String op2=s.peek();
	    		s.pop();
	    		//String temp= "(" + op1 + exp.charAt(i) + op2 +")";
	    		//s.push(temp);
	    		s.push("(" + op2 + exp.charAt(i) + op1 +")");
	    	}
	    } 
	  return s.peek();

	}
	
	public static void main(String[] args) {
		
		String exp = "AB-CD+F*/"; 
	    System.out.println( getInfix(exp));
	}

}
