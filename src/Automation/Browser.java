

package Automation;

import org.openqa.selenium.WebDriver;


public class Browser {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\java mallu\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://vctcpune.com/");
	}

}
