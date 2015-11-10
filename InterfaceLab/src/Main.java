
public class Main {

	public static void main(String[] args) 
	{
		Banker dimon = new Banker(1000000);
		dimon.PayTaxes(.35);
		
		System.out.println();
		
		Doctor brown = new Doctor(120000);
		brown.PayTaxes(.20);
		
		System.out.println();
		
		Artist prince = new Artist(50000);
		prince.PayTaxes(.23);
		
		dimon.FileTaxReturn();
		brown.FileTaxReturn();
		prince.FileTaxReturn();
		
		System.out.println();
		
		TaxAuditor craig = new TaxAuditor();
		craig.Audit(dimon);
		craig.Audit(brown);
		craig.Audit(prince);

	}

}
