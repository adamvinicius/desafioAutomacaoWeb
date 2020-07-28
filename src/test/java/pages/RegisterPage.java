package pages;

import java.util.LinkedHashMap;

import core.Element;
import map.RegisterMap;

public class RegisterPage {
	RegisterMap registerMap = new RegisterMap();
	
	public void setFirstName(CharSequence... value) {
		registerMap.firstName.sendKeys(value);
	}
	
	public void setLastName(CharSequence... value) {
		registerMap.lastName.sendKeys(value);
	}
	
	public void setAddres(CharSequence... value ) {
		registerMap.address.sendKeys(value);
	}
	
	public void setEmail(CharSequence... value) {
		registerMap.email.sendKeys(value);
	}
	
	public void setPhone(CharSequence... value) {
		registerMap.phone.sendKeys(value);
	}
	
	public void clickMale() {
		registerMap.male.click();
	}
	
	public void clickFemale() {
		registerMap.female.click();
	}
	
	public void clickHobbies(String hobbie) {
		LinkedHashMap<String, Element> hobbies = new LinkedHashMap<>();
		hobbies.put("cricket", registerMap.cricket);
		hobbies.put("movies", registerMap.movies);
		hobbies.put("hockey", registerMap.hockey);
		
		hobbies.get(hobbie).click();
				
	}
	
	public void selectLanguages(String value) {
		registerMap.languages.select(value);
	}
	
	public void selectSkills(String value) {
		registerMap.skills.select(value);
	}
	
	public void selectCountry(String value) {
		registerMap.country.select(value);
	}
	
	public void selectCountryDois(String value) {
		registerMap.countryDois.select(value);
	}
	
	public void selectYear(String value) {
		registerMap.year.select(value);
	}
	
	public void selectMonth(String value) {
		registerMap.month.select(value);
	}
	
	public void selectDay(String value) {
		registerMap.day.select(value);
	}
	
	public void setPassword(CharSequence... value) {
		registerMap.password.sendKeys(value);
	}
	
	public void setConfirmPassword(CharSequence... value) {
		registerMap.confirmPassword.sendKeys(value);
	}
	
	public void setUpload(CharSequence... value) {
		registerMap.upload.sendKeys(value);
	}
	
	
}
