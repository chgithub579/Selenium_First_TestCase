package Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 TestCase
 1.Launch the Browser
 2.open the URL "https://www.opencart.com/"
 3.check title of the "OpenCart - Open Source Shopping Cart Solution"
 4.close browser
 */
public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		if(title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("TestCase Passed");
		}
		else {
			System.out.println("TestCase Failed");
		}
		
		driver.close();
	}

}
