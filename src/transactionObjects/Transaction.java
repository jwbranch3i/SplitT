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

	public void setDate(String date)
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
	public double getDoubleGas()
	{
		return gas.get();
	}

	public String getGas()
	{
		if (gas.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", gas.get());
		}
	}

	public void setGas(double gas)
	{
		this.gas.set(gas);
		updateTotal();
	}

	// ----------------------------------------
	public double getDoubleService()
	{
		return service.get();
	}

	public String getService()
	{
		if (service.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", service.get());
		}
	}

	public void setService(double service)
	{
		this.service.set(service);
		updateTotal();
	}

	// ----------------------------------------
	public double getDoubleJohn()
	{
		return john.get();
	}

	public String getJohn()
	{
		if (john.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", john.get());
		}
	}

	public void setJohn(double john)
	{
		this.john.set(john);
		updateTotal();
	}


	// ----------------------------------------
	public double getDoubleMedical()
	{
		return medical.get();
	}

	public String getMedical()
	{
		if (medical.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", medical.get());
		}
	}

	public void setMedical(double med)
	{
		this.medical.set(med);
		updateTotal();
	}

	// ----------------------------------------
	public double getDoubleMisc()
	{
		return misc.get();
	}

	public String getMisc()
	{
		if (misc.get() == 0.)
		{
			return "";
		}
		else
		{
			return String.format("%.2f", misc.get());
		}
	}
	
	public void setMisc(double misc)
	{
		this.misc.set(misc);
		updateTotal();
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

	

	// ----------------------------------------
	protected void updateTotal()
	{
		setTotal(getDoubleGas() + getDoubleService() + getDoubleJohn() +
				getDoubleMedical() + getDoubleMisc());		
	}

	@Override
	public String toString()
	{
		return "Transaction [gas= " + getDoubleGas()
		                    + " service= " + getDoubleService()
		                    + " john= " + getDoubleJohn()
		                    + " medical= " + getDoubleMedical()
		                    + " misc= " + getDoubleMisc()
		                    + " total= " + getDoubleTotal() +"]";
	}

	
}
