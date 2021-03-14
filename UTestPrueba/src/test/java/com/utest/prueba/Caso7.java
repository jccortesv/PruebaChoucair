package com.utest.prueba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso7 {
	private WebDriver driver;
	By signInBtn = By.linkText("Empleos");
	By bar1Btn = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/empleosazuleMesa-de-trabajo-1-nzblz96gbj5m8za4qlepxwrbxs2sdu9rv7asuvteco.png']");
	By keywordSrchLoc = By.id("search_keywords");
	By searchBtn = By.xpath("//input[@type='submit']");
	
	@Before
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");
	}
	
	@After
	public void tearDown() {
		System.out.println("Fin del caso.");
		driver.quit();
	}

	@Test
	public void btn1() throws InterruptedException {
		driver.findElement(signInBtn).click();
		driver.findElement(bar1Btn).click();
		Thread.sleep(5000);
		driver.findElement(keywordSrchLoc).sendKeys("Automatizador");
		Thread.sleep(5000);
		driver.findElement(searchBtn).click();
		Thread.sleep(5000);
	}
}
