package transactionObjects;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

abstract class TransactionParent
{
	private int _id;
	private SimpleStringProperty transDate = new SimpleStringProperty("");
	private SimpleStringProperty discription = new SimpleStringProperty("");
	private SimpleDoubleProperty total = new SimpleDoubleProperty(0.0);
	
	public TransactionParent()
	{
	}
	
	/*******************************************************************/
	abstract protected void updateTotal();
	
	
	/******************************************************************/
	public int get_id()
	{
		return _id;
	}

	public void set_id(int _id)
	{
		this._id = _id;
	}

	// ----------------------------------------
	public String getTransDate()
	{
		return transDate.get();
	}

	public void setTransDate(String date)
	{
		this.transDate.set(date);
	}

	// ----------------------------------------
	public void setDiscription(String disc)
	{
		this.discription.set(disc);
	}

	public String getDiscription()
	{
		return discription.get();
	}

	// ----------------------------------------
	public double getDoubleTotal()
	{
		return total.get();
	}

	public String getTotal()
	{
		if (total.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", total.get());
		}
	}

	protected void setTotal(double total)
	{
		this.total.set(total);
	}
					
}
