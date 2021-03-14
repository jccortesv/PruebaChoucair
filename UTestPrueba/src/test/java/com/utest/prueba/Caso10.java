package com.utest.prueba;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Caso10 {
	private WebDriver driver;
	By signInBtn = By.linkText("Empleos");
	By bar1Btn = By.xpath("//img[@src='https://www.choucairtesting.com/wp-content/uploads/elementor/thumbs/empleosazuleMesa-de-trabajo-1-nzblz96gbj5m8za4qlepxwrbxs2sdu9rv7asuvteco.png']");
	By keywordSrchLoc = By.id("search_keywords");
	By locationSrchLoc = By.id("search_location");
	By searchBtn = By.xpath("//input[@type='submit']");
	By selectJobBtn = By.xpath("//a[@href='https://www.choucairtesting.com/job/automatizador-choucair/']");
	By applyBtn = By.xpath("//input[@type='button']");
	By formularioLoc = By.id("nombre-completo");
	
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
		driver.findElement(locationSrchLoc).sendKeys("Bogotá");
		Thread.sleep(5000);
		driver.findElement(searchBtn).click();
		Thread.sleep(5000);
		driver.findElement(selectJobBtn).click();
		
		selectJobBtn = By.xpath("//input[@type='button']");
		
		
		driver.findElement(selectJobBtn).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.findElement(formularioLoc).sendKeys("Julio César Cortés Vivas");
		Thread.sleep(5000);
		formularioLoc = By.id("correo-electronico");
		driver.findElement(formularioLoc).sendKeys("julio.cesar.cortes.v@gmail.com");
		Thread.sleep(5000);
		formularioLoc = By.id("celular-o-telefono-de-contacto");
		driver.findElement(formularioLoc).sendKeys("319 304 9166");
		Thread.sleep(5000);
		formularioLoc = By.id("que-estudios-formales-tienes-o-en-que-semestre-te-encuentras-actualmente");
		driver.findElement(formularioLoc).sendKeys("Ingeniero de sistemas");
		Thread.sleep(5000);
		formularioLoc = By.id("que-tiempo-de-experiencia-certificada-tienes-en-pruebas-o-en-desarrollo-de-softwaresi-aplica");
		driver.findElement(formularioLoc).sendKeys("1 año");
		Thread.sleep(5000);
		formularioLoc = By.id("conoces-de-automatizacion-de-pruebas-te-gustaria-aprendersi-aplica");
		driver.findElement(formularioLoc).sendKeys("Me gustaría aprender");
		Thread.sleep(5000);
		formularioLoc = By.id("cual-es-tu-aspiracion-salarial");
		driver.findElement(formularioLoc).sendKeys("1.900.000");
		Thread.sleep(5000);
		formularioLoc = By.id("si-eres-seleccionado-que-disponibilidad-de-tiempo-para-ingresar-tendrias");
		driver.findElement(formularioLoc).sendKeys("Inmediata");
	}
}
