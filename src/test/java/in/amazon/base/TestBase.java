package in.amazon.base;

import amazon.config.EnvFactory;
import amazon.factories.DriverFactory;
import com.typesafe.config.Config;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class TestBase {
    protected Config config = EnvFactory.getInstance().getConfig();
    protected final String HOME_PAGE_URL = config.getString("HOME_PAGE_URL");
    protected WebDriver driver;

    @BeforeEach
    public void setupDriver() {
        driver = DriverFactory.getDriver();
        driver.get(HOME_PAGE_URL);
    }

    @AfterEach
    public void teardownDriver() {
        driver.quit();
    }
}
