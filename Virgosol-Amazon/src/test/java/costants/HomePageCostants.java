package costants;

import org.openqa.selenium.By;

public class HomePageCostants {
    public static final By LOGIN_BUTTON = By.xpath("//a[@id='nav-link-accountList']");
    public static final By ACCOUNT_BUTTON = By.xpath("//a[@id='nav-link-accountList']");
    public static final By MYLIST = By.xpath("//img[@alt='Listeleriniz']");
    public static final By MAKEALIST = By.xpath("//span[@id='createList']");
    public static final By LISTNAME = By.xpath("//input[@id='list-name']");
    public static final String LISTNAME_WORD = "Virgosol Listem";
    public static final By MAKEALIST_BUTTON = By.xpath("//span[@id='wl-redesigned-create-list']");
    public static final By COOKIE_SUBMIT_BUTTON = By.xpath("//input[@id='sp-cc-accept']");
    public static final By DROPDOWNBOX_COMPUTERS = By.xpath("//select[@id='searchDropdownBox']/option[text()='Bilgisayarlar']");
    public static final By SEARCH_BAR = By.xpath("//input[@id='twotabsearchtextbox']");
    public static final String SEARCHWORD = "msi";
    public static final By SEARCH_BUTTON = By.xpath("//input[@id='nav-search-submit-button']");
    public static final By PAGE_2 = By.xpath("//a[text()='2']");
    public static final By SECOND_PRODUCT = By.xpath("//div[@class='s-main-slot s-result-list s-search-results sg-row']/div[@data-index='4']");
    public static final By MY_LISTNAME_BEFORE = By.xpath("//input[@id='add-to-wishlist-button']");
    public static final By MY_LISTNAME = By.xpath("//ul[@id='atwl-dd-ul']");
    public static final By CONTINUE_SHOPPING = By.xpath("//span[@id='continue-shopping']");
    public static final By DELETE_PRODUCT = By.xpath("//input[@name='submit.deleteItem']");
    public static final By EXIT_BUTTON = By.xpath("//a[@id='nav-item-signout']");

}
