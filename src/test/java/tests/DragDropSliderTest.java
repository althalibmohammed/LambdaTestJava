package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragDropSliderTest extends BaseTest {

    @Test
    public void verifySliderMovesTo95() {
        // Step 1: Open playground and click "Drag & Drop Sliders"
        driver.findElement(By.linkText("Drag & Drop Sliders")).click();

        // Step 2: Identify the slider with "Default value 15"
        WebElement slider = driver.findElement(By.xpath("//input[@value='15']"));
        WebElement rangeValue = driver.findElement(By.id("rangeSuccess"));

        // Drag slider using Actions class
        Actions action = new Actions(driver);
        action.dragAndDropBy(slider, 215, 0).perform(); // drag right

        // Validate that range value shows 95
        String finalValue = rangeValue.getText();
        Assert.assertEquals(finalValue, "95", "Slider value did not reach 95");
    }
}
