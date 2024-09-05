package storytech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Read_Data_From_WebTable {
	 WebDriver driver ;
     String applicationURL = "https://www.timeanddate.com/worldclock/ ";
     public void Launch_Application()
     {
    	 System.setProperty("Webdriver.gecko.driver","C:\\Users\\pushpa\\Desktop\\java folder\\JavaNewProgramms\\browser files\\geckodriver.exe ");
    	 driver = new FirefoxDriver();
    	 driver.get(applicationURL);
    	 driver.manage().window().maximize();
     }


	
	public void Web_Table_getcityName()
	{
		By cityNamePropery=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a ");
		WebElement cityname= driver.findElement(cityNamePropery);
		String CityName=cityname.getText();
		System.out.println(CityName);
	}
	public void capturingCompleWebTableData()
	{

	for(int rowIndex=1;rowIndex<=36;rowIndex++)
	{
	// to goto every Row of all its Corresponding Cells
	for(int rowOfCellIndex=1;rowOfCellIndex<=8;rowOfCellIndex++)
	{
	By webTableDataProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowIndex+"]/td["+rowOfCellIndex+"]");
	WebElement webTableData=driver.findElement(webTableDataProperty);
	String webTableDataText=webTableData.getText();
	System.out.print(webTableDataText+" | ");
	}
	System.out.println();
	}
}

	public static void main(String[] args) {
		
		Read_Data_From_WebTable read = new Read_Data_From_WebTable();
		read.Launch_Application();
		read.Web_Table_getcityName();
		read.capturingCompleWebTableData();
	}

}
