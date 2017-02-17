package com.luxoft.jva007.exercise10;

public class Calculator {
	
	private static char[] possibleSymbols = 
        {'1','2','3','4','5','6','7','8','9','0','.'};
   
	private static boolean checkNumber(String arg) {
		int verifiedLength = 0;
	    for (int i=0; i<arg.length(); i++) {
	        char c = arg.charAt(i);
	        for (char p : possibleSymbols) {
	            if (c == p) {
	            	verifiedLength++;
	            }
	        }
	    }
	    if (verifiedLength == arg.length()) {
	    	return true;
	    }
	    
	    return false;
    }
	
	public static void main(String[] args) {
		double result;
		double operand1 = 0;
		double operand2 = 0;
		
		if (args.length != 3) {
			System.out.println("Program should have exactly 3 arguments");
			return;
		}
		
		if(!checkNumber(args[0]) || !checkNumber(args[2])) {
			System.out.println("First and third arguments should be numbers");
			return;
		}
		
	    operand1 = Double.parseDouble(args[0]);
	    operand2 = Double.parseDouble(args[2]);
		
		switch (args[1]) {
		    case "+" : 
		    	result = operand1 + operand2;
		    	break;
		    case "-" : 
		    	result = operand1 - operand2;
		    	break;
		    case "*" : 
		    	result = operand1 * operand2;
		    	break;
		    case "/" : 
		    	result = operand1 / operand2;
		    	break;
		    default:
		    	System.out.println("Invalid operand");
		    	return;
		}
		System.out.format("Result: %.2f", result);

    }

}
