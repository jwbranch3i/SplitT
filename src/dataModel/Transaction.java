package dataModel;

public class Transaction extends TransactionParent
{
	private double gas;
	private double service;
	private double john;
	private double medical;
	private double misc;

	/*********************************************************/
	public Transaction()
	{
		gas = 0.0;
		service = 0.0;
		john = 0.0;
		medical = 0.0;
		misc = 0.0;
	}
	
	void updateTotal()
	{
		setTotal(gas + service + john + medical + misc);
	}

	public double getGas()
	{
		return gas;
	}

	public void setGas(double gas)
	{
		this.gas = gas;
		updateTotal();
	}

	public double getService()
	{
		return service;
	}

	public void setService(double service)
	{
		this.service = service;
		updateTotal();
	}

	public double getJohn()
	{
		return john;
	}

	public void setJohn(double john)
	{
		this.john = john;
		updateTotal();
	}

	public double getMedical()
	{
		return medical;
	}

	public void setMedical(double medical)
	{
		this.medical = medical;
		updateTotal();
	}

	public double getMisc()
	{
		return misc;
	}

	public void setMisc(double misc)
	{
		this.misc = misc;
		updateTotal();
	}

	@Override
	public String toString()
	{
		return "Transaction [gas="
						+ gas + ", service=" + service + ", john=" + john + ", medical="
						+ medical + ", misc=" + misc + "]";
	}

	
}
