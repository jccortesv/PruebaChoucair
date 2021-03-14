package com.utest.prueba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Caso11 {
	
	private WebDriver driver;
	By signInBtn = By.linkText("Empleos");
	By bar1Btn = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/empleosazulMesa-de-trabajo-1-nzblzb24p786w77efm7z2wa94jtit8h8jglrtfqm08.png']");
	By linksLoc = By.linkText("Modelo de calidad de software");
	
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
		Thread.sleep(2000);
		driver.findElement(bar1Btn).click();
		Thread.sleep(2000);
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.linkText("Diferencia entre calidad de software y pruebas");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='http://www.youtube.com/watch?v=bipTWWHya8A']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=EzVolGw-P3k']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='http://royal.pingdom.com/2009/03/19/10-historical-software-bugs-with-extreme-consequences/']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=Hf-47kSvkHc&t=12s']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.linkText("Marcos de trabajo de pruebas");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=yph3_90SNGM&feature=youtu.be']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=Uo2xvx7zhwo']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=RQRkRLYujWA']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.partialLinkText("Fundamentos ingeniería de software");
		System.out.println("linksLoc: " + linksLoc);
		driver.findElement(linksLoc).sendKeys(Keys.ENTER);
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=ZMFaUvJTW-4']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=AEiRa5xZaZw']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=mzI90pTT5PY']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=M_M8T8G4Og8']");
		driver.findElement(linksLoc).click();
		//Thread.sleep(2000);
		WebElement linksLoc2 = driver.findElement(By.linkText("Manual práctico de SQL"));
		Actions builder = new Actions(driver);
		builder.moveToElement(linksLoc2).click(linksLoc2);
		builder.perform();
		Thread.sleep(2000);
		//ESTE CARGA
		linksLoc = By.linkText("Fundamentos de la gerencia de proyectos en desarrollo de software");
		driver.findElement(linksLoc).click();
		Thread.sleep(2000);
		//
		linksLoc = By.xpath("//a[@href='https://www.youtube.com/watch?v=5ISd3NssJKs']");
		driver.findElement(linksLoc).click();
		Thread.sleep(2000);
	}

}
