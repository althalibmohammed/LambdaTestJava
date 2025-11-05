package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleFormDemoTest extends BaseTest {

    @Test
    public void verifySimpleFormDemoMessage() {
        // Step 2: Click “Simple Form Demo”
        driver.findElement(By.linkText("Simple Form Demo")).click();

        // Step 3: Validate that the URL contains “simple-form-demo”
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("simple-form-demo"), "URL does not contain 'simple-form-demo'.");

        // Step 4: Create a variable for message
        String message = "Welcome to LambdaTest";

        // Step 5: Enter message in the text box
        driver.findElement(By.id("user-message")).sendKeys(message);

        // Step 6: Click “Get Checked Value”
        driver.findElement(By.id("showInput")).click();

        // Step 7: Validate the message displayed
        String displayedMessage = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(displayedMessage, message, "Displayed message does not match input message.");
    }
    
    
    
}
