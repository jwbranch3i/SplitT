package dataModel;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.concurrent.Task;

public class WriteData
{

	public WriteData()
	{
	}
	
	/*******************************************************************/
	public static Boolean updateRecord(String val, int id)
	{
		Task<Boolean> task = new Task<Boolean>()
		{
			@Override
			protected Boolean call() throws Exception
			{
				return updateRecordTask(val, id);
			}
			return false;
		});
		
		new Thread(task).start();
	}

	

	public static boolean updateRecordTask(String val, int id)
	{
			PreparedStatement ps_updateFieldDate;
			try
			{
				ps_updateFieldDate = DataSource.getConn().prepareStatement(DB.SQL_STMT_UPDATE_FIELD_DATE);
				ps_updateFieldDate.setString(1, val);
				ps_updateFieldDate.setInt(2, id);
				int affectedRecords = ps_updateFieldDate.executeUpdate();
				
				if (ps_updateFieldDate != null)
				{
					ps_updateFieldDate.close();
				}
				
				return affectedRecords == 1;
			}
			catch (SQLException e)
			{
				System.out.println("Update failed: " + e.getMessage());
				e.printStackTrace();
				return false;
			}
							
	}
}






