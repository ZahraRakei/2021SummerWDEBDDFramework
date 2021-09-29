package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends BaseClass {

    @FindBy (css = "div.hl-cat-nav > ul > li:nth-child(12) > a")
    public WebElement dealsButton;

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    public DealsPage navigateToDealsPage() {
        clickOnElement(dealsButton);

        return new DealsPage();
    }


}
