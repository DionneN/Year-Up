import.java.util.Scanner;

public class ToFindOutTheDayOfTheWeek 
{
	Scanner scanner = new Scanner(System.In);
	System.out.println("Enter a new day of week:ln");
	String day = scanner.next();

	public static void main(String[] args) 
	{
		Switch(day)
		{
			case 'monday':GotoYearUP; home; break;
			case 'tuesday':Gotoconcert; restuarant; break;
			case 'wednesday':Gotoconcert; home; break;
			case 'thursday':work; home; break;
			case 'friday':restuarant; work; break;
			case 'saturday':home; GotoYearUp; break;
			case 'sunday':home; work; break;
			
		}
		
		

	}

}
