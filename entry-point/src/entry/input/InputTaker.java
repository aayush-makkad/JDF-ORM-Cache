package entry.input;

import java.util.ArrayList;

import java.util.Scanner;

public class InputTaker {
	
	 static String connectionString;
	  static String schemaName;
	  static String userName;
	  static String password;
	  static String tableName;
	
	
	
	
	public static void main(String args[]){
		
		 ArrayList<ColumnMetaData> columnMetaData = new ArrayList<ColumnMetaData>();
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter connection string");
		 connectionString = sc.nextLine();
		 System.out.println("Enter schema name");
		 schemaName = sc.nextLine();
		 System.out.println("Enter username");
		 userName = sc.nextLine();
		 System.out.println("Enter password");
		 password = sc.nextLine();
		 
		 boolean flag = true;
		 String col;
		 String colDataType;
		 String primarySetter;
		 String choice;
		 boolean primary;
		 while(flag){
			 
			 System.out.println("Enter Column name");
			 col = sc.nextLine();
			 System.out.println("Enter data type for "+col);
			 colDataType = sc.nextLine();
			 System.out.println("Is it a primary key?");
			 primarySetter = sc.nextLine();
			 	if(primarySetter.equalsIgnoreCase("yes")){
			 		
			 		primary = true;
			 		
			 	}
			 	else{
			 		primary = false;
			 	}
			 // preparing list
			 	
			 	columnMetaData.add(new ColumnMetaData(col,colDataType,primary));
			 	
			 System.out.println("Enter more columns?");
			 choice = sc.nextLine();
			 if(!choice.equalsIgnoreCase("yes")){
				 flag = false;
			 }
			 
		 }
		 
		 
		sc.close(); 
		
	}

}

 class ColumnMetaData{
	
	String name;
	String dataType;
	boolean isIdentity;
	ColumnMetaData(String cname,String dtype,boolean primary){
		
		this.name = cname;
		this.dataType = dtype;
		this.isIdentity = primary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public boolean isIdentity() {
		return isIdentity;
	}
	public void setIdentity(boolean isIdentity) {
		this.isIdentity = isIdentity;
	}
}