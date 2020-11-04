package it.unical.ingsw.provaIngSw.prova182869;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
	

    public static void main( String[] args )
    
    {
        MyListUtil m = new  MyListUtil();
    	ArrayList l = new ArrayList(Arrays.asList(2,3,5,1,4));
    	
    	
    	System.out.println(l);
    	ArrayList<Integer> prova = m.sortArray(l, false);

    
        System.out.println( prova );
    }
}
