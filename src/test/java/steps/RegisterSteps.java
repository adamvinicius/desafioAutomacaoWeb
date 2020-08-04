package steps;

import static org.junit.Assert.assertEquals;

import core.Driver;
import enums.Hobbie;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.RegisterPage;

public class RegisterSteps {
	RegisterPage registerPage = new RegisterPage();
	@Dado("que estou na pagina Register com o titulo {string}")
	public void queEstouNaPaginaRegisterComOTitulo(String titulo) {
	    Driver.setUrl("http://demo.automationtesting.in/Register.html");
	    assertEquals(titulo, registerPage.getTitulo());
	}

	@Quando("o campo firstName esta preenchido com {string}")
	public void oCampoFirstNameEstaPreenchidoCom(String firstName) {
	    registerPage.setFirstName(firstName);
	}

	@Quando("o campo lastName esta preenchido com {string}")
	public void oCampoLastNameEstaPreenchidoCom(String lastName) {
	    registerPage.setLastName(lastName);
	}

	@Quando("os campos do formulario estao preenchidos com dados validos")
	public void osCamposDoFormularioEstaoPreenchidosComDadosValidos() throws Exception {
	    registerPage.setAddres("rua mauro")
	    .setEmail("adamvinicius@gmail.com")
	    .setPhone("454215451")
	    .clickMale()
	    .clickHobbies(Hobbie.MOVIES)
	    .clickHobbies(Hobbie.HOCKEY)
	    .selectLanguages("English")
	    .selectSkills("Java")
	    .selectCountry("Brazil")
	    .selectCountryDois("Australia")
	    .selectYear("1988")
	    .selectMonth("October")
	    .selectDay("12")
	    .setPassword("senha")
	    .setConfirmPassword("senha");
	    
	    registerPage.setUpload(System.getProperty("user.dir")+"/lib/imagem.jpg");
	   
	    
	}
}
