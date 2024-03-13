package dataModel;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import transactionObjects.Transaction;

public class DataGet
{
	/* table - transactions */
	public static final String TABLE_TRANSACTIONS = "Transactions";
	public static final String COL_TRANSACTIONS_ID = "_ID";
	public static final String COL_TRANSACTIONS_DATE = "date";
	public static final String COL_TRANSACTIONS_DISCRIPTION = "discription";
	public static final String COL_TRANSACTIONS_GAS = "gas";
	public static final String COL_TRANSACTIONS_SERVICE = "service";
	public static final String COL_TRANSACTIONS_JOHN = "john";
	public static final String COL_TRANSACTIONS_MEDICAL = "medical";
	public static final String COL_TRANSACTIONS_MISC = "misc";
	public static final String COL_TRANSACTIONS_TAX = "tax";
	public static final String COL_TRANSACTIONS_SAVINGS = "savings";

	public static final int INDEX_TRANSACTIONS_ID = 1;
	public static final int INDEX_TRANSACTIONS_DATE = 2;
	public static final int INDEX_TRANSACTIONS_DISCRIPTION = 3;
	public static final int INDEX_TRANSACTIONS_GAS = 4;
	public static final int INDEX_TRANSACTIONS_SERVICE = 5;
	public static final int INDEX_TRANSACTIONS_JOHN = 6;
	public static final int INDEX_TRANSACTIONS_MEDICAL = 7;
	public static final int INDEX_TRANSACTIONS_MISC = 8;
	public static final int INDEX_TRANSACTIONS_TAX = 9;
	public static final int INDEX_TRANSACTIONS_SAVINGS = 10;

	public static final int ORDER_BY_NONE = 1;
	public static final int ORDER_BY_ASC = 2;
	public static final int ORDER_BY_DESC = 3;

	/**********************************************************************/
	public static ArrayList<Transaction> getTransactions(int sortOrder)
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(COL_TRANSACTIONS_ID + ", ");
		sb.append(COL_TRANSACTIONS_DATE + ", ");
		sb.append(COL_TRANSACTIONS_DISCRIPTION + ", ");
		sb.append(COL_TRANSACTIONS_GAS + ", ");
		sb.append(COL_TRANSACTIONS_SERVICE + ", ");
		sb.append(COL_TRANSACTIONS_JOHN + ", ");
		sb.append(COL_TRANSACTIONS_MEDICAL + ", ");
		sb.append(COL_TRANSACTIONS_MISC + " ");
		sb.append("FROM " + TABLE_TRANSACTIONS);

		if (sortOrder != ORDER_BY_NONE)
		{
			sb.append(" ORDER BY ");
			sb.append(COL_TRANSACTIONS_DATE);
			if (sortOrder == ORDER_BY_DESC)
			{
				sb.append(" DESC");
			}
			else
			{
				sb.append(" ASC");
			}
		}
		
		System.out.println(sb.toString());
		ArrayList<Transaction> transactionList = new ArrayList<Transaction>();

		try (
			Statement statement = DataSource.getConn().createStatement();
			ResultSet results = statement.executeQuery(sb.toString())
		)
		{
			while (results.next())
			{
				Transaction transaction = new Transaction();
				transaction.set_id(results.getInt(INDEX_TRANSACTIONS_ID));
				transaction.setTransDate(results.getString(INDEX_TRANSACTIONS_DATE));
				transaction.setDiscription(results.getString(INDEX_TRANSACTIONS_DISCRIPTION));
				transaction.setGas(results.getDouble(INDEX_TRANSACTIONS_GAS));
				transaction.setService(results.getDouble(INDEX_TRANSACTIONS_SERVICE));
				transaction.setJohn(results.getDouble(INDEX_TRANSACTIONS_JOHN));
				transaction.setMedical(results.getDouble(INDEX_TRANSACTIONS_MEDICAL));
				transaction.setMisc(results.getDouble(INDEX_TRANSACTIONS_MISC));

				transactionList.add(transaction);
			}

			return transactionList;

		}
		catch (SQLException e)
		{
			System.out.println("Querey to get Transactions failed: " + e.getMessage());
			return null;
		}
	}
}
