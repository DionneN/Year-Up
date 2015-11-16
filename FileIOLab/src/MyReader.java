import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.

public class MyReader {

	public static void main(String[] args) throws Exception
	{
		System.out.println("Hello World!");
		try
		{
			FileReader filereader = new FileReader("C:\\Users\\dnavarrete\\Documents\\OOP _week15.txt");
			String fileContents = "";
			while((i = fileReader.read())!=-1)
			{
				char ch = (char);
				
				fileContents = fileContents + ch;
			}
			fileReader.close();
			System.out.println(fileContents);
			String tmpStr = replaceMyString(fileContents);
			writeItBack(tmpStr);
			}
		catch (FileNotFoundException fnfe)
		{
			System.out.println(fnfe.getMessage());
			
		}

	}
	
	private static String replaceMyString(String fileContents)

}
