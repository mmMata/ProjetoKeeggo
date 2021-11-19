package br.com.automationpractice.steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.automationpractice.page.CadastroPage;
import br.com.automationpractice.page.DriverElement;
//import br.com.automationpractice.page.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CadastroSteps {

	private WebDriver driver;
	private CadastroPage cadastroPage;
	

	@After
	public void finaliza() {
		DriverElement.quitDriver(driver);
	}

	@When("clico no botao entrar na homePage")
	public void cliclo_no_botao_entrar_na_homePage() throws IOException {
		driver = DriverElement.getChromeDriver();
		cadastroPage = PageFactory.initElements(driver, CadastroPage.class);
		cadastroPage.clicaNoBotaoEntrarDaHomePage();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image1.png"));
		}

	@And("digito um email valido")
	public void digito_um_email_valido() throws IOException {
		cadastroPage.digitarEmailValido("slasbas@gmail.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image2.png"));
	}

	@And("clico para criar uma conta")
	public void clico_para_criar_uma_conta() throws IOException {
		cadastroPage.clicarNoBotaoCrieSuaContaAqui();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image3.png"));
	}
	
	
	@And("preencho o primeiro nome")
	public void preencho_o_primeiro_nome() throws IOException {
		cadastroPage.digitarPrimeiroNome("Slee");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image4.png"));
	}

	@And("preencho o segundo nome")
	public void preencho_o_segundo_nome() throws IOException {
		cadastroPage.digitarSegundoNome("Pachdecoe");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image5.png"));
	}

	@And("preencho a senha")
	public void preencho_a_senha() throws IOException {
		cadastroPage.digitarSenha("1234567");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image6.png"));
	}

	@And("seleciono dia de nascimento")
	public void selecino_dia_do_nascimento() throws IOException {
		cadastroPage.selecionoDiaDoNascimento();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image7.png"));
	}
	
	@And("seleciono mes de nascimento")
	public void seleciono_mes_de_nascimento() throws IOException {
		cadastroPage.selecionaMesDoNascimento();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image8.png"));
	}
	
	@And("selecino ano de nascimento")
	public void selecino_ano_de_nascimento() throws IOException {
		cadastroPage.selecionoAnoDoNascimento();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image9.png"));
	}
	
	@And("preencho o campo empresa")
	public void preencho_o_campo_empresa() throws IOException {
		cadastroPage.digitarEmpresa("Estudante");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image10.png"));
	}

	@And("preencho o campo endereco")
	public void preencho_o_campo_endereco() throws IOException {
		cadastroPage.digitarEndereco("250 ANNIE LEE");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image11.png"));
	}

	@And("preencho o campo cidade")
	public void preencho_o_campo_cidade() throws IOException {
		cadastroPage.digitarCidade("MODY AL");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image12.png"));
		}
	
	@And("seleciono estado")
	public void seleciono_estado() throws IOException {
		cadastroPage.selecionarEstado();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image13.png"));
	}
	
	@And("preencho o campo CEP")
	public void preencho_o_campo_CEP() throws IOException {
	cadastroPage.digitarCodigoPostal("35004");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	   File file=ts.getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image14.png"));
	}
	
	@And("preencho o campo telefone celular")
	public void preencho_o_campo_telefone_celular() throws IOException {
		cadastroPage.digitarTelefoneCelular("11959987172");
		
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image15.png"));
	}

	@Then("clico no campo registrar")
	public void clico_no_campo_registrar() throws IOException {
		cadastroPage.clicarNoBotaoRegistro();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		   File file=ts.getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(file, new File("./Screenshots/cadastroUsuario/Image16.png"));
	}

}
