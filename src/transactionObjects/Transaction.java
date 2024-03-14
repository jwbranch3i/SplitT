package transactionObjects;

import javafx.beans.property.SimpleDoubleProperty;

public class Transaction extends TransactionParent
{
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
		addTotal();
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
		addTotal();
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
		addTotal();
	}


	// ----------------------------------------
	public double getDoubleMed()
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

	public void setMed(double med)
	{
		this.medical.set(med);
		addTotal();
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
		addTotal();
	}

	// ----------------------------------------
	Todo
	function add total

	@Override
	public String toString()
	{
		return "Transaction [gas="
						+ gas + ", service=" + service + ", john=" + john + ", medical="
						+ medical + ", misc=" + misc + "]";
	}

	
}
