package dataModel;

import java.sql.PreparedStatement;

import transactionObjects.Transaction;

public class WriteData
{

	
	/*******************************************************************/
	public static Boolean updateRecord(String cField, Transaction transaction)
	{
		PreparedStatement ps_updateRecord;
		try
		{
			String update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
			ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
			switch (cField)
			{
				case DB.COL_TRANSACTIONS_DATE:
					ps_updateRecord.setString(1, transaction.getTransDate());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					break;
			}
			if (ps_updateRecord != null)
			{
				ps_updateRecord.close();
			}
			return true;
		}
		catch (Exception e)
		{
			System.out.println("Update transactions exception: " + e.getMessage());
			return false;
		}
	}
}






