package com.luxoft.jva007.exercise10;

/**
 * Created by ptcvas3 on 2/24/2017.
 */
public class iCalculator {
    private static char[] possiblesymbols = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '.', ','};

    private static boolean checkNum(String args) {
        int verLen = 0;

        for (int i = 0; i < args.length(); i++) {

            char c = args.charAt(i);
            for (char p : possiblesymbols) {
                if (c == p) {
                    verLen++;
                }
            }
        }

            if (verLen == args.length()) {
                return true;
            }
            return false;
        }


    public static void main(String args[]){
      double result;
      double  halfresult;
      double operand1 = 0;
      double operand2 = 0;
      double operand3 = 0;

        if((args[1].equals( '*') || args[1].equals( '/')))
        {
            halfresult = operand1*operand2;

        }

        if (args.length!=3){
            System.out.println("It should be 3 arguments");
        }
        if(!checkNum(args[0]) || !checkNum(args[2])) {
            System.out.println("First and third arguments should be numbers");
            return;
        }
        operand1 = Double.parseDouble(args[0]);
        operand2 = Double.parseDouble(args[2]);
        operand3 = Double.parseDouble(args[4]);



        switch (args[1]){
            case "+":
                result = operand1 + operand2 + operand3;
                break;
            case "-":
                result = operand1 - operand2 - operand3;
                break;
            case "x":
                result = operand1 * operand2;
                break;
            case ":" :
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.format("%.3f",result);

    }
}
