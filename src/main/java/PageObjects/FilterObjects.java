package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilterObjects {

	//SelectBackPack
	@FindBy(id = "item_4_title_link")
	public static WebElement SelectBackPack;
	
	//click the Cart
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	public static WebElement cart;
	
}
