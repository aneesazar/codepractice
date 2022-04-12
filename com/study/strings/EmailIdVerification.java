package com.study.strings;

public class EmailIdVerification {
	
	public boolean isValidEmail(String s) {
	
		int atTheRateLoc = s.indexOf('@');
		int dotLoc = s.lastIndexOf('.');
		
		boolean isValid = false;
		
		if(s != null && s.length()>0) {
			if(atTheRateLoc <=0 || dotLoc <=0) { // Make sure it is availabel and not start with 
				isValid = false;
			} else if(atTheRateLoc > dotLoc) { // a dot must present after '@'
				isValid = false;
			} else {
				isValid = true;
			}
		}
		
		
		return isValid;
	
	}

}
