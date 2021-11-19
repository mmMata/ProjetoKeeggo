package br.com.automationpractice.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastroPage {

	final WebDriver driver;

	@FindBy(how = How.XPATH, using = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")

	public WebElement buttonHomePage;

	@FindBy(how = How.ID, using = "email_create")

	private WebElement elementWriteEmailValid;

	@FindBy(how = How.ID, using = "SubmitCreate")

	private WebElement buttonCreate;

	@FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")

	private WebElement buttonTitle;

	@FindBy(how = How.ID, using = "customer_firstname")

	private WebElement elementWriteFirsttName;

	@FindBy(how = How.ID, using = "customer_lastname")

	private WebElement elementWriteLastName;;

	@FindBy(how = How.ID, using = "passwd")

	private WebElement elementWritePassword;

	@FindBy(how = How.ID, using = "days")

	private WebElement buttonDays;

	@FindBy(how = How.ID, using = "months")

	private WebElement buttonMonths;

	@FindBy(how = How.ID, using = "years")

	private WebElement buttonYears;

	@FindBy(how = How.ID, using = "company")

	private WebElement elementWriteCompany;

	@FindBy(how = How.ID, using = "address1")

	private WebElement elementWriteAddress;

	@FindBy(how = How.ID, using = "city")

	private WebElement elementWriteCity;

	@FindBy(how = How.ID, using = "id_state")

	private WebElement buttonState;

	@FindBy(how = How.ID, using = "postcode")

	private WebElement elementWriteZipPostalCode;

	@FindBy(how = How.ID, using = "phone_mobile")

	private WebElement elementWritePhone;

	@FindBy(how = How.ID, using = "submitAccount")

	private WebElement buttonSubmitAccount;

	public CadastroPage(WebDriver driver) {

		this.driver = driver;
	}

	public void clicaNoBotaoEntrarDaHomePage() {
		buttonHomePage.click();
	}

	public void digitarEmailValido(String email_create) {
		elementWriteEmailValid.sendKeys(email_create);
	}

	public void clicarNoBotaoCrieSuaContaAqui() {
		buttonCreate.click();
	}

	public void digitarPrimeiroNome(String customer_firstname) {
		elementWriteFirsttName.sendKeys(customer_firstname);
	}

	public void digitarSegundoNome(String customer_lastname) {
		elementWriteLastName.sendKeys(customer_lastname);
	}

	public void digitarSenha(String passwd) {
		elementWritePassword.sendKeys(passwd);
	}
	
	public void selecionoDiaDoNascimento() {
		buttonDays.sendKeys("2" + Keys.ENTER);
	}
	
	public void selecionaMesDoNascimento() {
		buttonMonths.sendKeys("fevereiro" + Keys.ENTER);
	}
	
	public void selecionoAnoDoNascimento() {
		buttonYears.sendKeys("1999" + Keys.ENTER);
	}

	public void digitarEmpresa(String company) {
		elementWriteCompany.sendKeys(company);
	}

	public void digitarEndereco(String address1) {
		elementWriteAddress.sendKeys(address1);
	}

	public void digitarCidade(String city) {
		elementWriteCity.sendKeys(city);
	}

	public void selecionarEstado() {
		buttonState.sendKeys("Alabama" + Keys.ENTER);
	}

	public void digitarCodigoPostal(String postcode) {
		elementWriteZipPostalCode.sendKeys(postcode);
	}

	public void digitarTelefoneCelular(String phone_mobile) {
		elementWritePhone.sendKeys(phone_mobile);
	}

	public void clicarNoBotaoRegistro() {
		buttonSubmitAccount.click();
	}

}
