package framework.core.jdbc;

import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.Iterator;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import xml.processing.*;

public class jdbcCore {
	
	private static ArrayList<XMLDataStorageClass> data = XMLStorageListCreator.getFinalData();
	
	public static boolean coreProcess(){
		
		XMLDataStorageClass xss = new XMLDataStorageClass();
		Connection con = null;
		String tableName = data.get(0).getSchema();
		StringBuffer sqlbuff = new StringBuffer();
				sqlbuff.append("create table "+tableName+" ( ");
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			 con = (Connection) DriverManager.getConnection(data.get(0).getConnectionString(),data.get(0).getUsername(),data.get(0).getPassword());
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			Iterator<XMLDataStorageClass> it = data.iterator();
			String prime = null;
			if(data.size()>1){
			while(it.hasNext()){
				xss = (XMLDataStorageClass) it.next();
				if(xss.getPrime()){
					prime = "PRIMARY KEY";
				}
				
				if(!it.hasNext()){
					//last iteration
					
					sqlbuff.append(xss.getColumnName()+" "+xss.getDataType()+" "+prime+")" );
					
				}else
				{
					sqlbuff.append(xss.getColumnName()+" "+xss.getDataType()+" "+prime+" , ");
				}
			}
				 
			}
			else
			{
				String primeOne = null;
				if(data.get(0).getPrime()){
					primeOne = "PRIMARY KEY";
					
				}
				sqlbuff.append(data.get(0).getColumnName()+" "+data.get(0).getDataType()+" "+primeOne+") ");
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		System.out.println(sqlbuff);
		return true;
		
	}

}