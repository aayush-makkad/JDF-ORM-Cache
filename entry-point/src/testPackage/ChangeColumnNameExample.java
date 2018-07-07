
package testPackage;
import process.process;

public class ChangeColumnNameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Define the table name, current name of column and the name you want to change it to
		String _tableName = "test_table";
		String _oldName = "five_test";
		String _newName = "five_testt";
		
		
		// Call the function to change it
		process.ChangeColumnName(_tableName, _oldName, _newName);

	}

}
