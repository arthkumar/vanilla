package amazon.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage extends PageBase {

    @FindBy(id = "nav-hamburger-menu")
    private WebElement hamburgerMenu;

    @FindBy(xpath = "//div[contains(text(),'TV, Appliances, Electronics')]")
    private WebElement tvAppliancesElectronicsCategory;

    @FindBy(linkText = "Televisions")
    private WebElement televisionSubcategory;

    @FindBy(xpath = "//span[./text()='Samsung']")
    private WebElement tvBrand;

    @FindBy(id = "a-autoid-0-announce")
    private WebElement filterDropDown;

    @FindBy(id = "s-result-sort-select_2")
    private WebElement sortByPrice;

    @FindBy(xpath = "(//span[@class='a-price-whole'])[2]")
    private WebElement secondHighestItem;

    @FindBy(xpath = "//h1[contains(text(),'About this item')]")
    private WebElement aboutTheProduct;

    public AmazonHomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public AmazonHomePage clickOnhamHurgerMenu() {
        clickOn(hamburgerMenu);
        return this;
    }

    public AmazonHomePage selectCategory() {
        clickOn(tvAppliancesElectronicsCategory);
        return this;
    }

    public AmazonHomePage selectSubCategory() {
        clickOn(televisionSubcategory);
        return this;
    }

    public AmazonHomePage selectBrand() {
        scrollDownUntilElementIsVisible(tvBrand);
        clickOn(tvBrand);
        return this;
    }

    public AmazonHomePage clickOnFilter() {
        clickOn(filterDropDown);
        return this;
    }

    public AmazonHomePage sortByPrice() {
        clickOn(sortByPrice);
        return this;
    }

    public AmazonHomePage selectSecondHighestItem() {
        clickOn(secondHighestItem);
        return this;
    }

    public String getAboutProductDetail() {
        switchTab();
        scrollDownUntilElementIsVisible(aboutTheProduct);
        return getText(aboutTheProduct);
    }
}
