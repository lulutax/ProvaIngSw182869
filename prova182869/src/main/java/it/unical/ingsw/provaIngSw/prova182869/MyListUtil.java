package it.unical.ingsw.provaIngSw.prova182869;

import java.util.ArrayList;

public class MyListUtil {

	
	
	
	public ArrayList<Integer> sortArray(ArrayList<Integer> l, boolean t){
	
		
		//se è true ordinamento crescente
		if(t== true) {
			int index=0;
			int min=0;
			for( int i =0; i< l.size();i++) {
				min = l.get(i);
				for (int j=i+1; j< l.size();j++) {
					
					if(min >l.get(j)) {
						
						
						min= l.get(j);
						index = j;
						l.set(index, l.get(i));

						l.set(i, min);
					}
					
				}
				
				
				
			}
			
		}else {
			
			int index=0;
			int max=0;
			for( int i =0; i< l.size();i++) {
				max = l.get(i);
				for (int j=i+1; j< l.size();j++) {
					
					if(max <l.get(j)) {
						
						
						max= l.get(j);
						index = j;
						
						l.set(index, l.get(i));

						l.set(i, max);
					}
					
				}
				
				
				
			}
			
		}
		
		
		return l;
		
		
		
	}
}
