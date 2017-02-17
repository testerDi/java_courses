package com.luxoft.jva007.exercise07;

public class StringWorker {
	public static void main (String[] args) {
        String s = "Hello World";
        String s1 = new String("Hello World");
        String s2 = "Hello World";
        System.out.println(s==s2);
        
        System.out.println("length: " + s.length());
        System.out.println("charAt: " + s.charAt(6));
        System.out.println("substring: " + s.substring(0,6));
        System.out.println(s==s1);
        
        System.out.println("equals: " + s.equals(s1));
        System.out.println("equalsIgnoreCase: " + s.equalsIgnoreCase(s1));
        System.out.println("startsWith: " + s.startsWith("Hello"));
        System.out.println("blank is: " + s.indexOf(" "));
        int blank = s.indexOf(" ");
        String secondWord = s.substring(blank, s.length());
        System.out.println("second word: " + secondWord);
        System.out.println("last index of l: " + s.lastIndexOf("l"));
        
        String s3 = s.replace("Hello", "Bye");
        System.out.println("s3 =" + s3);
        String[] sArray = s.split(" ");
        System.out.println("first Word: " + sArray[0]);
        System.out.println("second Word: " + sArray[1]);
        
        Object o = null;
        String sss = "it is: " + o; // "it is: null"
        System.out.println("sss: " + sss);
        
    }

}
