package pom;

import baseAPI.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class DealsPage extends BaseClass {

    public DealsPage() {
        PageFactory.initElements(driver, this);
    }
}
