package app;

import java.util.ArrayList;

import dataModel.DataGet;
import dataModel.DataSource;
import dataModel.Transaction;

public class SplitT
{

	public static void main(String[] args)
	{
		
		DataSource dSource = DataSource.getInstance();
		dSource.open();
		
		DataGet dataGet = new DataGet();
		
		ArrayList<Transaction> transList = dataGet.getTransactions(1);
		
		for (int i=0; i<transList.size(); i++)
		{
			System.out.println(transList.get(i).toString());
		}
		
		
		
		dSource.close();
		System.out.println("*** Finish ***");
	}

}
