package driver;

import interaction.*;

public class CMCDriver {

  
  public static void main(String[] args) {
	
	System.out.println("Login Section");
	
	
    StudentInteraction john = new StudentInteraction("juser", "12345");
    //System.out.println("its logged in");
    john.login("juser", "12345");
    
   
    System.out.println("Search citeria user enters.");
    System.out.println("Top 5 schools matching search:");
    john.search("BROWN","RHODEISLAND ","URBAN","PRIVATE","10000","50.0","625.0","650.0","36450.0","40.0","11500","20.0","50.0","5","4","5");
    
  

  
  
  }
}
