package br.com.automationpractice.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import br.com.automationpractice.page.DriverElement;
import br.com.automationpractice.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	private WebDriver driver;
	private LoginPage loginPage;

	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@Given("que eu esteja na pagina de login")
	public void que_eu_esteja_na_pagina_de_login() throws IOException {
		driver = DriverElement.getChromeDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.clicaNoBotaoEntrarDaHomePage();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/loginUsuario/Image1.png"));
	}

	@Then("coloco minhas credenciais validas")
	public void coloco_minhas_credenciais_validas() throws IOException {
		loginPage.digitaEmail("mata71445@gmail.com");
		loginPage.digitaSenha("123456");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/loginUsuario/Image2.png"));
	}

	@When("entro com sucesso")
	public void entro_com_sucesso() throws IOException {
		loginPage.clicaNoBotaoEntrarDaPaginaDeLogin();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/loginUsuario/Image3.png"));
	}

	@When("coloco minhas credenciais invalidas")
	public void coloco_minhas_credenciais_invalidas() throws IOException {
		loginPage.digitaEmail("mata7145@gmail.com");
		loginPage.digitaSenha("1234567");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/loginUsuario/Image4.png"));
	}

	@Then("continuo na pagina de login")
	public void continuo_na_pagina_de_login() throws IOException {
		loginPage.permanesseNaPaginaDeLogin();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File file = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./Screenshots/loginUsuario/Image5.png"));
	}

}
