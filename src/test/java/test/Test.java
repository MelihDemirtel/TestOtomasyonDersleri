package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));


        driver.get("https://demoqa.com/");

        driver.manage().window().maximize();

        WebElement elementButton = driver.findElement(By.xpath("//h5[text()='Elements']"));

        elementButton.click();
    }
}
