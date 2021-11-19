package br.com.automationpractice.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.automationpractice.page.CarrinhoPage;
import br.com.automationpractice.page.DriverElement;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CarrinhoSteps {

	private WebDriver driver;
	private CarrinhoPage carrinhoPage;
	

	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);

	}

	@Given("que eu esteja na pagina login")
	public void que_eu_esteja_na_pagina_de_login() throws IOException {
		driver = DriverElement.getChromeDriver();
		carrinhoPage = PageFactory.initElements(driver, CarrinhoPage.class);
		carrinhoPage.clicaNoBotaoEntrarDaHomePage();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image1.png"));
	}
	
	@And("coloco minhas credenciais")
	public void coloco_minhas_credenciais_validas() throws IOException {
		carrinhoPage.digitaEmail("mata71445@gmail.com");
		carrinhoPage.digitaSenha("123456");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image2.png"));
	}

	
	@And("entro no sistema com sucesso")
	public void entro_no_sistema_com_sucesso() throws IOException {
		carrinhoPage.clicaNoBotaoEntrarDaPaginaDeLogin();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image3.png"));
	}


	@And("procuro por um tipo de vestimenta")
	public void procuro_por_um_tipo_de_vestimenta() throws IOException {
		carrinhoPage.procurarTipoDeVestimenta("vestido");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image4.png"));
	}

	@And("clico em pesquisar")
	public void clico_em_pesquisar() throws IOException {
		carrinhoPage.clicarNoBotaoLupa();	
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image5.png"));
	}

	@And("seleciono uma roupa")
	public void seleciono_uma_roupa() throws IOException {
		carrinhoPage.selecionarVestido();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image6.png"));
	}

	@And("adiciono uma peca no carrinho")
	public void adiciono_uma_peca_no_carrinho() throws IOException {
		carrinhoPage.clicarNoBotaoCarrinho();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image7.png"));
	}

	@And("faco o check out")
	public void faco_o_check_out() throws IOException {
		carrinhoPage.clicarNoBotaoCheckOut();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image8.png"));
	}

	@And("removo uma peca do carrinho")
	public void removo_uma_peca_do_carrinho() throws IOException {
		carrinhoPage.clicarNoBotaoLixeira();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image9.png"));
	}

	@Then("vou para pagina com carrinho vazio")
	public void vou_para_pagina_com_carrinho_vazio() throws IOException {
		carrinhoPage.paginaCarrinhoVazio();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/carrinho/Image10.png"));
	}

	
}
