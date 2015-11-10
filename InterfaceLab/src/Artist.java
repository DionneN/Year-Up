
public class Artist implements ITaxPayer
{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	Artist (double income)
	{
		SetIncome (income);
		
	}
	
	public double GetIncome()
	{
		return m_income;
	}
	
	private void SetIncome(double income)
	{
		m_income = income;
	}

	
	public void PayTaxes(double taxRate) 
	{
		if (m_donePayingTaxes ==false)
		{
			double taxAmount = GetIncome() * taxRate;
			System.out.println("Artist is paying the following as tax " + taxAmount);
			SetIncome(GetIncome() - taxAmount);
			System.out.println("My income after paying taxes is: " + GetIncome());
			m_donePayingTaxes = true;
		}
		

}

	public void FileTaxReturn() 
	{
		if (m_donePayingTaxes)
		{
			System.out.println("Artist is filling his tax returns");
		}
	
		
	}

}