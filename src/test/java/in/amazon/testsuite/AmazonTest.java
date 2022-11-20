package in.amazon.testsuite;

import amazon.page.AmazonHomePage;
import in.amazon.base.TestBase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmazonTest extends TestBase {

    @DisplayName("Verify that the about this item section is visible in the product detail page")
    @Test
    void assertThatAboutThisPageIsCorrect() {
        String expected = "About this item";
        String actual = new AmazonHomePage(driver)
                .clickOnhamHurgerMenu()
                .selectCategory()
                .selectSubCategory()
                .selectBrand()
                .clickOnFilter()
                .sortByPrice()
                .selectSecondHighestItem()
                .getAboutProductDetail();

        assertEquals(actual, expected, "Please check, about this item section is not present in product detail page");
    }
}
