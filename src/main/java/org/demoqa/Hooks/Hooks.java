package org.demoqa.Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks  {
	WebDriver driver;
@Before
public void launch(){
	System.setProperty("webdriver.chrome.driver", "I:\\Users\\Deepak\\workspace\\Amazon\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://demoqa.com/registration/");
}
@After
public void quit(){
	driver.close();
}

}
