package VM;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class elements {
	
	@FindBy(xpath="/html/body/div/div/button")
	public static WebElement chat;
	@FindBy(xpath="//*[@id=\"eu22o1rla0t1675160966604\"]")
	public static WebElement name;
	@FindBy(xpath="//*[@id=\"l934njvment81675148707707\"]")
	public static WebElement email;
	@FindBy(xpath="//*[@id=\"tawk-prechat-form\"]/div[3]/fieldset/div/textarea")
	public static WebElement message;
	@FindBy(xpath="//*[@id=\"tawk-form-container\"]/div/div/button")
	public static WebElement submit;
	@FindBy(xpath="/html/body/div/div/button")
	public static WebElement close;
	
	
	@FindBy(xpath="//*[@id=\"react-tabs-10\"]")
	public static WebElement Aus;
	@FindBy(xpath="//*[@id=\"react-tabs-8\"]")
	public static WebElement SA;
	@FindBy(xpath="//*[@id=\"react-tabs-6\"]")
	public static WebElement NA;
	@FindBy(xpath="//*[@id=\"react-tabs-7\"]/div/ul/li[5]/div/a")
	public static WebElement US;
	
	@FindBy(xpath="//*[@id=\"responsive-navbar-nav\"]/div[2]/ul/li[2]/a")
	public static WebElement map;
	@FindBy(xpath="//*[@id=\"menu-search-location-optionsMenu-icon\"]")
	public static WebElement dir;
	@FindBy(xpath="//*[@id=\"searchinput1\"]")
	public static WebElement from;
	@FindBy(xpath="//*[@id=\"searchinput2\"]")
	public static WebElement to;
	
	@FindBy(xpath="//*[@id=\"dropdown-basic\"]")
	public static WebElement prod;
	@FindBy(xpath="//*[@id=\"responsive-navbar-nav\"]/div[2]/ul/li[5]/div/div/a[1]/a")
	public static WebElement navi;
	@FindBy(xpath="//*[@id=\"root\"]/div[2]/footer/div/div/div[2]/div[4]/ul[2]/li[1]/a/img")
	public static WebElement fb;
}
