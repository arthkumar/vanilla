import in.amazon.base.TestBase;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSandbox extends TestBase {

    @Tag("smokeTest")
    @DisplayName("This test is for demo purpose only to show that the basic code works." +
            "You have to use the best practices that you normally use to design your tests")
    @Test
    @Disabled
    void assertThatHomePageTitleIsCorrect() {
        assertEquals("Amazon.com. Spend less. Smile more.", driver.getTitle());
    }
}
