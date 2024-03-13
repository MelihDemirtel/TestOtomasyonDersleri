package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test {
    public static void main(String[] args){

        //Chrome browserın driverını kurar
        WebDriver driver = new ChromeDriver();

        //Bekleme işlemleri için wait nesnesi oluşturduk
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        //Yazılan URL e gider
        driver.get("https://demoqa.com/");

        //Ekranı tam ekran yapar
        driver.manage().window().maximize();

        //driver.findelement ile elementi buluyoruz ve elementButton adında bir WebElemente tanımladık.
        WebElement elementButton = driver.findElement(By.xpath("//h5[text()='Elements']"));

        //Elemente tıklar
        elementButton.click();
    }
}
