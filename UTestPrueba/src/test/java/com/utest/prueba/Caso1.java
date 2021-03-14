package com.utest.prueba;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Caso1 {
	
	private WebDriver driver;
	By signInBtn = By.linkText("Empleos");
	//By locationBtn = By.linkText("Empleos");
	
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}
	
	@After
	public void tearDown() throws Exception{
		System.out.println("Fin del caso.");
		driver.quit();
	}
	
	@Test
	public void signIn() throws InterruptedException {
		driver.findElement(signInBtn).click();
		Thread.sleep(2000);
		
	}

}
