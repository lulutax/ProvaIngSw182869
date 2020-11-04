package it.unical.ingsw.provaIngSw.prova182869;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	MyListUtil m = new MyListUtil();

	
	@BeforeClass
	public static void test() {
		
		
		System.out.println("Before class");
	}
	
	@Test 
	public void sortArrayWork() {
    	ArrayList l = new ArrayList(Arrays.asList(2,3,5,1,4,19,1,19,13));

		assertEquals(new ArrayList<Integer> (Arrays.asList(19,19,13,5,4,3,2,1,1)),m.sortArray(l, false));
		
	}
}
