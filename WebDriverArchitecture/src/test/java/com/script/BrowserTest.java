package com.script;




import com.vervesquare.firefox.FirefoxDriver;
import com.vervesquare.ie.InternetExplorer;
import com.vervesquare.webDriver.IwebDriver;
import com.vervesqure.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	public static IwebDriver driver = null;
	public static String strbrowser = "chrome";

	public static void main(String[] args) {
		if (strbrowser.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
			// System.setProperty("webdriver.chrome.driver","chromedriver85.exe");
			driver = new ChromeDriver();
		} else if (strbrowser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			// System.setProperty("webdriver.chrome.driver","geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (strbrowser.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			// System.setProperty("webdriver.chrome.driver","geckodriver.exe");
			driver = new InternetExplorer();
	   }

		driver.get("https://www.facebook.com/");
		String strTitle = driver.getTitle();
		System.out.println("Title is.....>" + strTitle);
		driver.click();
		driver.sendkeys("pratiksha");
		driver.getTitle();
		driver.getwindowhandle();
		driver.findElement();
		driver.close();
		driver.quit();
		driver.isEnabled();
		driver.getcurrentUrl();
		driver.navigate();
	}
}
