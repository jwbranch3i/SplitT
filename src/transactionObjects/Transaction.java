package transactionObjects;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

public class Transaction
{
	private int _id;
	private SimpleStringProperty transDate = new SimpleStringProperty("");
	private SimpleStringProperty discription = new SimpleStringProperty("");
	private SimpleDoubleProperty gas = new SimpleDoubleProperty(0.0);
	private SimpleDoubleProperty service = new SimpleDoubleProperty(0.0);
	private SimpleDoubleProperty john = new SimpleDoubleProperty(0.0);
	private SimpleDoubleProperty medical = new SimpleDoubleProperty(0.0);
	private SimpleDoubleProperty misc = new SimpleDoubleProperty(0.0);
	private SimpleDoubleProperty total = new SimpleDoubleProperty(0.0);

	/*********************************************************/
	public Transaction()
	{
	}
	
	// ----------------------------------------
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
	public double getGas()
	{
		return gas.get();
	}

	public void setGas(double gas)
	{
		this.gas.set(gas);
		updateTotal();
	}

	// ----------------------------------------
	public double getService()
	{
		return service.get();
	}

	public void setService(double service)
	{
		this.service.set(service);
		updateTotal();
	}

	// ----------------------------------------
	public double getJohn()
	{
		return john.get();
	}

	public void setJohn(double john)
	{
		this.john.set(john);
		updateTotal();
	}


	// ----------------------------------------
	public double getMedical()
	{
		return medical.get();
	}

	public void setMedical(double med)
	{
		this.medical.set(med);
		updateTotal();
	}

	// ----------------------------------------
	public double getMisc()
	{
		return misc.get();
	}
	
	public void setMisc(double misc)
	{
		this.misc.set(misc);
		updateTotal();
	}

	// ----------------------------------------
	public double getTotal()
	{
		return total.get();
	}
	
	

	// ----------------------------------------
	protected void updateTotal()
	{
		total.set(getGas() + getService() + getJohn() +
				getMedical() + getMisc());		
	}

	@Override
	public String toString()
	{
		return "Transaction [gas= " + getGas()
		                    + " service= " + getService()
		                    + " john= " + getJohn()
		                    + " medical= " + getMedical()
		                    + " misc= " + getMisc()
		                    + " total= " + getTotal() +"]";
	}

	
}
