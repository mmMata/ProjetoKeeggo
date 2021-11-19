package br.com.automationpractice.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	final WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")

	public WebElement buttonHomePage;
	
	@FindBy(how = How.ID, using = "email")

	private WebElement elementWriteEmail;;

	@FindBy(how = How.ID, using = "passwd")

	private WebElement elementWritePassword;

	@FindBy(how = How.ID, using = "SubmitLogin")

	private WebElement buttonLogin;
	
	public LoginPage(WebDriver driver) {

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
	
	public void permanesseNaPaginaDeLogin () {
		driver.getCurrentUrl().equals("http://automationpractice.com/index.php?controller=authentication");
	
	}
	
	public CadastroPage navegarParaPaginaDeCadastro() {
		return new CadastroPage(driver);
	}
	
}

