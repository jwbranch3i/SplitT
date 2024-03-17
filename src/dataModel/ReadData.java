package dataModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import transactionObjects.Transaction;

public class ReadData
{
	/**********************************************************************/
	public static List<Transaction> getTransactions(int sortOrder)
	{
		String quaryStmt = DB.getTransactionsStmt(sortOrder);
		System.out.println(quaryStmt);

		try (
			Statement statement = DataSource.getConn().createStatement();
			ResultSet results = statement.executeQuery(DB.getTransactionsStmt(sortOrder))
		)
		{
			List<Transaction> list = new ArrayList<Transaction>();
			while (results.next())
			{
				Transaction transaction = new Transaction();
				transaction.set_id(results.getInt(DB.INDEX_TRANSACTIONS_ID));
				transaction.setTransDate(results.getString(DB.INDEX_TRANSACTIONS_DATE));
				transaction.setDiscription(results.getString(DB.INDEX_TRANSACTIONS_DISCRIPTION));
				transaction.setGas(results.getDouble(DB.INDEX_TRANSACTIONS_GAS));
				transaction.setService(results.getDouble(DB.INDEX_TRANSACTIONS_SERVICE));
				transaction.setJohn(results.getDouble(DB.INDEX_TRANSACTIONS_JOHN));
				transaction.setMedical(results.getDouble(DB.INDEX_TRANSACTIONS_MEDICAL));
				transaction.setMisc(results.getDouble(DB.INDEX_TRANSACTIONS_MISC));

				list.add(transaction);
			}

			return list;

		}
		catch (SQLException e)
		{
			System.out.println("Querey to get Transactions failed: " + e.getMessage());
			return null;
		}
	}
}
