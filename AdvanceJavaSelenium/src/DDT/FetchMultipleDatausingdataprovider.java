package DDT;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchMultipleDatausingdataprovider {
	@DataProvider
	public String[][] getData()
	{
		String[][] data=new String[2][4];
		data[0][0]="pooja";
		data[0][1]="sanjay";
		data[0][2]="A+";
		data[0][3]="poojadhamale@gmail.com";
		
		data[1][0]="satish";
		data[1][1]="kumar";
		data[1][2]="o+";
		data[1][3]="satish@gmail.com";
		return data;
	}

	@Test(dataProvider="getData")
	public void demo(String firstName, String lastName, String bloodgroup, String email)
	{
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(bloodgroup);
		System.out.println(email);
	}
}
