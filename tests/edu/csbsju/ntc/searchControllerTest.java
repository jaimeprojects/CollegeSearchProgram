package edu.csbsju.ntc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.*;
import org.junit.jupiter.api.Test;
import java.util.*;

import controller.SearchController;
import controller.UniversityController;
import interaction.StudentInteraction;

class searchControllerTest {
	SearchController sc;

	boolean temp1, temp2,temp3,temp4,temp5,temp6,temp7,temp8,temp9,temp10,temp11,temp12,temp13,temp14,temp15,temp16,temp17,temp18,temp19
	,temp20,temp21,temp22,temp23,temp24,temp25,temp26,temp27,temp28,temp29,temp30,temp31,temp32,temp33,temp34,temp35,temp36,temp37,temp38,temp39
	,temp40,temp41,temp42,temp43,temp44,temp45,temp46,temp47, temp48;
	
	@Before
	  public void setUp() throws Exception {
		sc = new SearchController();
		
	  }
	

	@Test
	void testSearch() {
		/**result = john.search("", "", "", "", "", "", "", "", "","", "", "", "", "", "", "");*/
		StudentInteraction john = new StudentInteraction("juser", "12345");
	    
		temp1 = john.search(null, "", "", "", "", "", "", "", "","", "", "", "", "", "", "");
		temp2 = john.search(""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp3 = john.search("BROWN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp4 = john.search("BROWN"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp5 = john.search("BROWN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp6 = john.search("BROWN"	,"RHODEISLAND "	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp7 = john.search("BROWN"	,"RHODEISLAND "	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp8 = john.search(	"BROWN"	,"RHODEISLAND "	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp9 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp10 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp11 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp12 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp13 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp14 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE",	""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp15 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp16 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp17 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp18 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp19 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,null	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp20 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0",	""	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp21 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp22 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,null	,""	,""	,""	,""	,""	,""	,""	,"");
		temp23 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,""	,""	,""	,""	,""	,""	,""	,""	,"");
		temp24 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,""	,""	,""	,""	,""	,""	,""	,"");
		temp25 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,null	,""	,""	,""	,""	,""	,""	,"");
		temp26 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,""	,""	,""	,""	,""	,""	,""	,"");
		temp27 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,""	,""	,""	,""	,""	,""	,"");
		temp28 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,null	,""	,""	,""	,""	,""	,"");
		temp29 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0",""	,""	,""	,""	,""	,""	,"");
		temp30 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,""	,""	,""	,""	,""	,"");
		temp31 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,null	,""	,""	,""	,""	,"");
		temp32 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,""	,"",	""	,""	,""	,"");
		temp33 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,""	,""	,""	,""	,"");
		temp34 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,null	,""	,""	,""	,"");
		temp35 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,""	,""	,""	,""	,"");
		temp36 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,""	,""	,""	,"");
		temp37 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,null	,""	,""	,"");
		temp38 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,""	,""	,""	,"");
		temp39 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,""	,""	,"");
		temp40 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,null	,""	,"");
		temp41 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,""	,""	,"");
		temp42 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,""	,"");
		temp43 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,null	,"");
		temp44 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,""	,"");
		temp45 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4"	,"");
		temp46 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4"	,null);
		
		temp47 = john.search(	"BROWN"	,"RHODEISLAND "	,"URBAN"	,"PRIVATE"	,"10000"	,"50.0"	,"625.0"	,"650.0"	,"36450.0"	,"40.0"	,"11500"	,"20.0"	,"50.0"	,"5"	,"4",	"");
		
		temp48 = john.search(	"BROWN","RHODEISLAND ","URBAN","PRIVATE","10000","50.0","625.0","650.0","36450.0","40.0","11500","20.0","50.0","5","4","5");

		
	    
	 
		boolean[] arrOfVal = new boolean[]{temp1, temp2,temp3,temp4,temp5,temp6,temp7,temp8,temp9,temp10,temp11,temp12,temp13,temp14,temp15,temp16,temp17,temp18,temp19
				,temp20,temp21,temp22,temp23,temp24,temp25,temp26,temp27,temp28,temp29,temp30,temp31,temp32,temp33,temp34,temp35,temp36,temp37,temp38,temp39
				,temp40,temp41,temp42,temp43,temp44,temp45,temp46,temp47, temp48};
		
		for(boolean  n: arrOfVal) {
			
			assertNotNull("Expected values" , n );}
		}
		
}
