package dataModel;

import java.sql.PreparedStatement;

import transactionObjects.Transaction;

public class WriteData
{

	
	/*******************************************************************/
	public static Boolean updateRecord(String cField, Transaction transaction)
	{
		String update_stmt;
		PreparedStatement ps_updateRecord;
		try
		{
			switch (cField)
			{
				case DB.COL_TRANSACTIONS_DATE:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setString(1, transaction.getTransDate());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;
					
				case DB.COL_TRANSACTIONS_DISCRIPTION:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setString(1, transaction.getDiscription());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;

				case DB.COL_TRANSACTIONS_GAS:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setDouble(1, transaction.getGas());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;
				case DB.COL_TRANSACTIONS_SERVICE:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setDouble(1, transaction.getService());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;

				case DB.COL_TRANSACTIONS_JOHN:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setDouble(1, transaction.getJohn());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;

				case DB.COL_TRANSACTIONS_MEDICAL:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setDouble(1, transaction.getMedical());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;

				case DB.COL_TRANSACTIONS_MISC:
					update_stmt = DB.sql_stmt_UPDATEFIELD_pt1 + cField + DB.sql_stmt_UPDATEFIELD_pt2;
					ps_updateRecord = DataSource.getConn().prepareStatement(update_stmt);
					ps_updateRecord.setDouble(1, transaction.getMisc());
					ps_updateRecord.setInt(2, transaction.get_id());
					
					ps_updateRecord.executeUpdate();
					
					if (ps_updateRecord != null)
					{
						ps_updateRecord.close();
					}
					break;
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






