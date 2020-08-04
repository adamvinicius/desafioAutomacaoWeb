package pages;

import java.util.LinkedHashMap;

import core.Element;
import enums.Hobbie;
import map.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	public String getTitulo() {
		return registerMap.titulo.getText().trim();
	}
	
	public RegisterPage setFirstName(CharSequence... value) {
		registerMap.firstName.sendKeys(value);
		return this;
	}
	
	public RegisterPage setLastName(CharSequence... value) {
		registerMap.lastName.sendKeys(value);
		return this;
	}
	
	public RegisterPage setAddres(CharSequence... value ) {
		registerMap.address.sendKeys(value);
		return this;
	}
	
	public RegisterPage setEmail(CharSequence... value) {
		registerMap.email.sendKeys(value);
		return this;
	}
	
	public RegisterPage setPhone(CharSequence... value) {
		registerMap.phone.sendKeys(value);
		return this;
	}
	
	public RegisterPage clickMale() {
		registerMap.male.click();
		return this;
	}
	
	public RegisterPage clickFemale() {
		registerMap.female.click();
		return this;
	}
	
	public RegisterPage clickHobbies(Hobbie hobbie) {
		LinkedHashMap<Hobbie, Element> hobbies = new LinkedHashMap<>();
		hobbies.put(Hobbie.CRICKET, registerMap.cricket);
		hobbies.put(Hobbie.MOVIES, registerMap.movies);
		hobbies.put(Hobbie.HOCKEY, registerMap.hockey);
		
		hobbies.get(hobbie).click();
		return this;
				
	}
	
	public RegisterPage selectLanguages(String value) throws Exception {
		registerMap.inpLanguages.click();
		registerMap.languages.selectLista(value);
		return this;
	}
	
	public RegisterPage selectSkills(String value) {
		registerMap.skills.select(value);
		return this;
	}
	
	public RegisterPage selectCountry(String value) {
		registerMap.country.select(value);
		return this;
	}
	
	public RegisterPage selectCountryDois(String value) {
		registerMap.countryDois.select(value);
		return this;
	}
	
	public RegisterPage selectYear(String value) {
		registerMap.year.select(value);
		return this;
	}
	
	public RegisterPage selectMonth(String value) {
		registerMap.month.select(value);
		return this;
	}
	
	public RegisterPage selectDay(String value) {
		registerMap.day.select(value);
		return this;
	}
	
	public RegisterPage setPassword(CharSequence... value) {
		registerMap.password.sendKeys(value);
		return this;
	}
	
	public RegisterPage setConfirmPassword(CharSequence... value) {
		registerMap.confirmPassword.sendKeys(value);
		return this;
	}
	
	public RegisterPage setUpload(CharSequence... value) {
		registerMap.upload.sendKeys(value);
		return this;
	}
	
	
	
}
