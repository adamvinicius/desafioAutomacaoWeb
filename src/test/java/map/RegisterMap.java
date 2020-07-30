package map;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	public Element titulo = new Element(ByValue.CSS, "h1");
	public Element firstName = new Element(ByValue.CSS, "input[ng-model=FirstName]");
	public Element lastName = new Element(ByValue.CSS, "input[ng-model=LastName]");
	public Element address = new Element(ByValue.CSS, "textarea");
	public Element email = new Element(ByValue.CSS, "input[type=email]");
	public Element phone = new Element(ByValue.CSS, "input[ng-model=Phone]");
	public Element upload = new Element(ByValue.ID, "imagesrc");
	public Element male = new Element(ByValue.CSS, "input[value=Male]");
	public Element female = new Element(ByValue.CSS, "input[value=FeMale]");
	public Element cricket = new Element(ByValue.CSS, "input[value=Cricket]");
	public Element movies = new Element(ByValue.CSS, "input[value=Movies]");
	public Element hockey = new Element(ByValue.CSS, "input[value=Hockey]");
	public Element inpLanguages = new Element(ByValue.CSS, "#msdd");
	
	public Element languages = new Element(ByValue.CSS, "a.ui-corner-all");
	public Element skills = new Element(ByValue.CSS, "#Skills");
	public Element country = new Element(ByValue.CSS, "#countries");
	public Element countryDois = new Element(ByValue.ID, "country");
	public Element year = new Element(ByValue.CSS, "#yearbox");
	public Element month = new Element(ByValue.CSS, "select[ng-model=monthbox]");
	public Element day = new Element(ByValue.CSS, "#daybox");
	public Element password = new Element(ByValue.CSS, "#firstpassword");
	public Element confirmPassword = new Element(ByValue.CSS, "#secondpassword");
	
}
