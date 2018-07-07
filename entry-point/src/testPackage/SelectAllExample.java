package testPackage;

import tables.testProcess;
import tables.test_table;

import java.util.ArrayList;

import process.process;

public class SelectAllExample {
	
	static boolean flag = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an arraylist to hold the returned obects
		ArrayList<Object> _tableData = new ArrayList<Object>();
		
		//get the returned objects
		
		
		long startTime = System.nanoTime();
	
		
		
		
		_tableData = process.SelectAll("test_table");
		
		
		long endTime   = System.nanoTime();
		long totalTime = endTime - startTime;
		
		
		
		for(Object o : _tableData){
			
			// CAST EACH AND EVERY OBJECT TO IT'S MAPPED CLASS
			test_table tp = test_table.class.cast(o);
			
			// Use getters to get the values
			//System.out.println("col_1 data : "+tp.getfirst_test());
			//System.out.println("col_2 data : "+tp.getfive_test());
			System.out.println("col_2 data : "+tp.getsix_test());
		}
		
		System.out.println("Total time taken : "+totalTime);
		
		long startTime1 = System.nanoTime();
		ArrayList<Object> tableData2 = process.SelectAll("test_table");
		
		
		long endTime2   = System.nanoTime();
		long totalTime3 = endTime2 - startTime1;
		
		
		
		for(Object o : _tableData){
			
			// CAST EACH AND EVERY OBJECT TO IT'S MAPPED CLASS
			test_table tp = test_table.class.cast(o);
			
			// Use getters to get the values
			//System.out.println("col_1 data : "+tp.getfirst_test());
			//System.out.println("col_2 data : "+tp.getfive_test());
			System.out.println("col_2 data : "+tp.getsix_test());
		}
		
		System.out.println("Total time taken after being cached : "+totalTime3);
		
		ChangeColumnNameExample.main(null);
		System.out.println("Cache evicted!!");
		
		if(flag){
			flag = false;
			SelectAllExample.main(null);
		}
		

	}

}
