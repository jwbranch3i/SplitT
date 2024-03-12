package dataModel;

abstract class TransactionParent
{
	private int _id;
	private String transDate;
	private String discription;
	private double total;
	
	public TransactionParent()
	{
		_id = 0;
		transDate = "";
		discription = "";
		total = 0.0;
	}
	
	/*******************************************************************/
	abstract void updateTotal();
	
	
	/******************************************************************/
	public int get_id()
	{
		return _id;
	}

	public void set_id(int _id)
	{
		this._id = _id;
	}

	public String getTransDate()
	{
		return transDate;
	}

	public void setTransDate(String transDate)
	{
		this.transDate = transDate;
	}

	public String getDiscription()
	{
		return discription;
	}

	public void setDiscription(String discription)
	{
		this.discription = discription;
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}
	
					
}
