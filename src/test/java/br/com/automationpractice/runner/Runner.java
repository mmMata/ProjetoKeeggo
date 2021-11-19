package br.com.automationpractice.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/cadastroUsuario",
glue = "br.com.automationpractice.steps",
//tags = "@loginvalido",
plugin = {"pretty", "html:target/report/report.html", "json:target/report/report.json"},
monochrome = true)

public class Runner {

}


