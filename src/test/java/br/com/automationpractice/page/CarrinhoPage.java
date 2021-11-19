package br.com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarrinhoPage {

	final WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")

	public WebElement buttonHomePage;
	
	@FindBy(how = How.ID, using = "email")

	private WebElement elementWriteEmail;;

	@FindBy(how = How.ID, using = "passwd")

	private WebElement elementWritePassword;

	@FindBy(how = How.ID, using = "SubmitLogin")

	private WebElement buttonLogin;
	
	@FindBy(how = How.ID, using = "search_query_top")

	public WebElement elementWriteType;

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-default button-search']")

	public WebElement buttonMagnifyingGlass;

	@FindBy(how = How.XPATH, using = "//img[@class='replace-2x img-responsive']")

	public WebElement buttonDress;

	@FindBy(how = How.ID, using = "add_to_cart")

	public WebElement buttonCart;

	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-default button button-medium']")

	public WebElement buttonCheckOut;

	@FindBy(how = How.ID, using = "7_34_0_599616")

	public WebElement buttonBin;

	public CarrinhoPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public void clicaNoBotaoEntrarDaHomePage() {
		buttonHomePage.click();
	}

	public void digitaEmail(String email) {
		elementWriteEmail.sendKeys(email);
	}
	
	public void digitaSenha(String passwd) {
		elementWritePassword.sendKeys(passwd);
	}
	
	public void clicaNoBotaoEntrarDaPaginaDeLogin() {
		buttonLogin.click();
	}

	public void procurarTipoDeVestimenta(String search_query_top) {
		elementWriteType.sendKeys(search_query_top);
	}

	public void clicarNoBotaoLupa() {
		buttonMagnifyingGlass.click();
	}

	public void selecionarVestido() {
		buttonDress.click();
	}

	public void clicarNoBotaoCarrinho() {
		buttonCart.click();
	}

	public void clicarNoBotaoCheckOut() {
		buttonCheckOut.click();
	}

	public void clicarNoBotaoLixeira() {
		 buttonBin.click();
	}
	
	public void paginaCarrinhoVazio () {
		driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=order");
	
	}
}
