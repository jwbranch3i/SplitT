package dataModel;

public class DB
{
	/* table - transactions */
	public static final String TABLE_TRANSACTIONS = "Transactions";
	public static final String COL_TRANSACTIONS_ID = "_id";
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
	
	public static final String SQL_STMT_UPDATE_FIELD_DATE =
					"UPDATE " + TABLE_TRANSACTIONS + " SET DATE = ? WHERE "
					+ COL_TRANSACTIONS_ID + " = ?";
	
	public static String getTransactionsStmt(int sortOrder)
	{
		StringBuilder sb = new StringBuilder("SELECT ");
		sb.append(DB.COL_TRANSACTIONS_ID + ", ");
		sb.append(DB.COL_TRANSACTIONS_DATE + ", ");
		sb.append(DB.COL_TRANSACTIONS_DISCRIPTION + ", ");
		sb.append(DB.COL_TRANSACTIONS_GAS + ", ");
		sb.append(DB.COL_TRANSACTIONS_SERVICE + ", ");
		sb.append(DB.COL_TRANSACTIONS_JOHN + ", ");
		sb.append(DB.COL_TRANSACTIONS_MEDICAL + ", ");
		sb.append(DB.COL_TRANSACTIONS_MISC + " ");
		sb.append("FROM " + DB.TABLE_TRANSACTIONS);

		if (sortOrder != DB.ORDER_BY_NONE)
		{
			sb.append(" ORDER BY ");
			sb.append(DB.COL_TRANSACTIONS_DATE);
			if (sortOrder == DB.ORDER_BY_DESC)
			{
				sb.append(" DESC");
			}
			else
			{
				sb.append(" ASC");
			}
		}
		
		return sb.toString();
	}
	
}
