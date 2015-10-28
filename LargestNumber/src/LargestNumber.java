
public class LargestNumber{

	public static void FindLargestNumberUsingWhileLoops(int[] numbers)
	{
		int[] numbersArray = new int[] {-1, 34, 57, 69, 72, -83};
		FindLargestNumbersUsingWhileLoop(numbersArray);
		LargestNumberUsingForLoops(numbersArray);
		if (numbers != null){
			if (numbers.length > 0) {
				int i = 1;
				int largestNumber = numbers[0];
				
				while (i < numbers.length)
				{
					if (largestNumber < numbers[i])
					{
						largestNumber = numbers[i];
						}
					i++;
					}
				}
			}
		}
	public static void LargestNumberUsingLoops(int[] numbers)
	{
		if (numbers != null)
		{
			if (numbers.length>0)
			{
				int i;
				int largestnumber=numbers[0];
				for (i=1; i<numbers.length; i++)
				{
				    if (largestnumber<numbers[i]);
				}
				
				{
					largestnumber = numbers[i];
					}
				}
			}
		}
	}
