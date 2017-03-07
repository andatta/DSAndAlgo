package com.anutosh.hourrank18;

import java.util.Scanner;

public class SuperSixSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        // your code goes here
        int superCount = 0;
        for(int i = 1; i <= s.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if((j + i) > s.length()){
                    break;
                }
                String substr = s.substring(j, j + i);
                
                if (substr.length() > 1 && substr.startsWith("0")){
                    continue;
                }
                
                if(substr.equals("0") || (Integer.valueOf(substr) % 6) == 0){
                    superCount++;
                }
            } 
        }
        System.out.print(superCount);

	}

}
