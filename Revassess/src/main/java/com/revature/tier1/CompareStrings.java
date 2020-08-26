package com.revature.tier1;

public class CompareStrings {
	
	public static void main(String[] args) {
    	String s1 = "Are we equal to eachother?";
    	String s2 = "are we equal to eachother?";
    	boolean s3 = compareStrings(s1, s2);
	}

    public static boolean compareStrings(String s1, String s2){	
		if(s1 == s2) {
			System.out.println("We are equal");
			return true;
		}else
			System.out.println("We are not equal");
        return false;
    }
}
