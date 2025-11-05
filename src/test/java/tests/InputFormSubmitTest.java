package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputFormSubmitTest extends BaseTest {

    @Test
    public void verifyInputFormSubmit() throws InterruptedException {
        // Step 1: Click “Input Form Submit”
        driver.findElement(By.linkText("Input Form Submit")).click();

        // Step 2: Click “Submit” without filling anything
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();

        // Step 3: Assert "Please fill out this field." (Browser-level validation)
        WebElement nameField = driver.findElement(By.name("name"));
        String validationMsg = nameField.getAttribute("validationMessage");
        Assert.assertTrue(validationMsg.contains("Please fill out this field"), 
                "Validation message not displayed as expected.");

        // Step 4–6: Fill in all form details
        driver.findElement(By.name("name")).sendKeys("John Doe");
        driver.findElement(By.name("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("password")).sendKeys("password123");
        driver.findElement(By.name("company")).sendKeys("LambdaTest");
        driver.findElement(By.name("website")).sendKeys("https://www.lambdatest.com");
        driver.findElement(By.name("city")).sendKeys("New York");
        driver.findElement(By.name("address_line1")).sendKeys("123 Main Street");
        driver.findElement(By.name("address_line2")).sendKeys("Suite 100");
        driver.findElement(By.name("state")).sendKeys("NY");
        driver.findElement(By.name("zip")).sendKeys("10001");

        // Step 5: Select “United States” from country dropdown
        Select country = new Select(driver.findElement(By.name("country")));
        country.selectByVisibleText("United States");

        // Step 6: Submit form
        submitButton.click();

        // Step 7: Validate success message
        WebElement successMsg = driver.findElement(By.cssSelector(".success-msg"));
        Assert.assertTrue(successMsg.getText().contains("Thanks for contacting us, we will get back to you shortly."),
                "Success message not displayed.");
    }
}
