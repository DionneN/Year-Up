
public class main {

	public static void main(String[] args) 
	{
		Person CFO = new Person("Dionne Navarrete", 21, "4048451261", "2345 Cobb Pkwy SE");
		System.out.println("CFO's name is" + CFO.GetName());
		System.out.println("CFO's age is" + CFO.GetAge());
		System.out.println("CFO's phone number is" + CFO.GetPhoneNumber());
		System.out.println("CFO's address is" + CFO.GetAddress());
		System.out.println("It is November 6, 2015 today");
		CFO.GrowOlder();
		System.out.println("CFO's age is now" + CFO.GetAGE());
				

	}

}
