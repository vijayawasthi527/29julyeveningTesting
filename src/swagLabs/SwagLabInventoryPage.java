package swagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabInventoryPage 
{
	
	@FindBy(id = "shopping_cart_container")private WebElement cartButton;
	@FindBy(name = "add-to-cart-sauce-labs-backpack")private WebElement bagAddToCartButton;
	@FindBy(name = "add-to-cart-sauce-labs-bike-light")private WebElement bikeLightAddToCartButton;


	public SwagLabInventoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);	
		
	}
	
	public void addBagToCart()
	{
		bagAddToCartButton.click();
	}
	
	public void addBikeLightToCart()
	{
		bikeLightAddToCartButton.click();
	}
	
	public void clickOnCartButton()
	{
	cartButton.click();
	}

}	
