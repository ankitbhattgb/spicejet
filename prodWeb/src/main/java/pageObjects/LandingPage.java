package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LandingPage {
	@FindBy(how=How.ID, using="Login")
	public static WebElement login;

	@FindBy(how=How.LINK_TEXT, using="SpiceCash/SpiceClub Members")
	public static WebElement spiceMember;

	@FindBy(how=How.LINK_TEXT,using="Member Login")
	public static WebElement memberLogin;

	@FindBy(how=How.ID, using="highlight-addons")
	public static WebElement menu;
}
