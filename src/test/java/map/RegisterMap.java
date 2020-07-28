package map;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	public Element firstName = new Element(ByValue.CSS, "input[ng-model=FirstName]");
	public Element lastName = new Element(ByValue.CSS, "input[ng-model=LastName]");
	public Element address = new Element(ByValue.CSS, "textarea");
	public Element email = new Element(ByValue.CSS, "input[type=email]");
	public Element phone = new Element(ByValue.CSS, "input[ng-model=Phone]");
	public Element upload = new Element(ByValue.ID, "imagesrc");
	public Element male = new Element(ByValue.CSS, "");
	public Element female = new Element(ByValue.CSS, "");
	public Element cricket = new Element(ByValue.CSS, "");
	public Element movies = new Element(ByValue.CSS, "");
	public Element hockey = new Element(ByValue.CSS, "");
	public Element languages = new Element(ByValue.CSS, "");
	public Element skills = new Element(ByValue.CSS, "");
	public Element country = new Element(ByValue.CSS, "");
	public Element countryDois = new Element(ByValue.CSS, "");
	public Element year = new Element(ByValue.CSS, "");
	public Element month = new Element(ByValue.CSS, "");
	public Element day = new Element(ByValue.CSS, "");
	public Element password = new Element(ByValue.CSS, "");
	public Element confirmPassword = new Element(ByValue.CSS, "");
	
}
