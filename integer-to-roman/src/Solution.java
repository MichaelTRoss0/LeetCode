class Solution {
    public String intToRoman(int num) {
        /* 
         * I   = 1
         * II  = 2
         * III = 3
         * IV  = 4
         * 
         * V   = 5
         * VI  = 6
         * VII = 7
         * VIII= 8
         * IX  = 9
         * 
         * X   = 10
         * XX  = 20
         * XXX = 30
         * XL  = 40
         * 
         * L   = 50
         * LX  = 60
         * LXX = 70
         * LXXX= 80
         * XC  = 90
         * 
         * C   = 100
         * CC  = 200
         * CCC = 300
         * CD  = 400
         * 
         * D   = 500
         * DC  = 600
         * DCC = 700
         * DCCC= 800
         * CM  = 900
         * 
         * M   = 1000
         */
    	
    	int n = num;
    	String roman = "";
    	
    	roman = roman.concat("M".repeat(n / 1000));
    	n = n % 1000;
    	
    	roman = roman.concat("CM".repeat(n / 900));
    	n = n % 900;
    	
    	roman = roman.concat("D".repeat(n / 500));
    	n = n % 500;
    	
    	roman = roman.concat("CD".repeat(n / 400));
    	n = n % 400;
    	
    	roman = roman.concat("C".repeat(n / 100));
    	n = n % 100;
    	
    	roman = roman.concat("XC".repeat(n / 90));
    	n = n % 90;
    	
    	roman = roman.concat("L".repeat(n / 50));
    	n = n % 50;
    	
    	roman = roman.concat("XL".repeat(n / 40));
    	n = n % 40;
    	
    	roman = roman.concat("X".repeat(n / 10));
    	n = n % 10;
    	
    	roman = roman.concat("IX".repeat(n / 9));
    	n = n % 9;
    	
    	roman = roman.concat("V".repeat(n / 5));
    	n = n % 5;
    	
    	roman = roman.concat("IV".repeat(n / 4));
    	n = n % 4;
    	
    	roman = roman.concat("I".repeat(n));
    	
    	return roman;
    }
}