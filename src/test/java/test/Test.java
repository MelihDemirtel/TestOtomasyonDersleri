package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class Test {
    public static void main(String[] args) throws InterruptedException {

        //Chrome browserın driverını kurar
        WebDriver driver = new ChromeDriver();

        //Bekleme işlemleri için wait nesnesi oluşturduk
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //Yazılan URL e gider
        driver.get("https://demoqa.com/");

        //Ekranı tam ekran yapar
        driver.manage().window().maximize();

        //driver.findelement ile elementi buluyoruz ve elementButton adında bir WebElemente tanımladık.
        WebElement elementButton = driver.findElement(By.xpath("//h5[text()='Elements']"));

        //Elemente tıklar
        elementButton.click();

        /*
        //Get gibi url çağırır ama farkı browser da ileri geri gezinme imkanı sağlar
        driver.navigate().to("https://demoqa.com/");

        //1 saniye kodu bekletiyoruz
        Thread.sleep(1000);
        //Browser da geri gider
        driver.navigate().back();
        //1 saniye kodu bekletiyoruz
        Thread.sleep(1000);
        //Browserda ileri gider
        driver.navigate().forward();
        //1 saniye kodu bekletiyoruz
        Thread.sleep(1000);
        //Browserı yeniler
        driver.navigate().refresh();
        //1 saniye kodu bekletiyoruz
        Thread.sleep(1000);
        */

        WebElement textBoxButton = driver.findElement(By.xpath("//span[text()='Text Box']"));
        textBoxButton.click();

        String actualUrl = driver.getCurrentUrl();
        System.out.println("actual url: " + actualUrl);
        String expectedUrl = "https://demoqa.com/text-box";

        Assert.assertEquals(actualUrl,expectedUrl);

        //Sayfadaki Text Box yazısını bir weblemente atadık
        WebElement textBoxTitle = driver.findElement(By.cssSelector(".text-center"));

        //Sayfadaki Text Box yazısı görünene kadar bekle
        wait.until(ExpectedConditions.visibilityOf(textBoxTitle));

        //Sayfadaki Text Box yazısı görünüyormu bir boolean değişkene True or False durumunu atadık
        boolean isDisplayed = driver.findElement(By.cssSelector(".text-center")).isDisplayed();

        //Görünüyorsa Ok dir
        Assert.assertTrue(isDisplayed);

        WebElement fullNameInput = driver.findElement(By.id("userName"));
        //Input bir alana değer göndermek için
        fullNameInput.sendKeys("Testçi");



        WebElement userEmailInput = driver.findElement(By.id("userEmail"));
        userEmailInput.sendKeys("test@test.com");



        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        currentAddressInput.sendKeys("My Test Adress");



        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        permanentAddressInput.sendKeys("My Test Permanent Address");



        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();



        driver.quit();
    }
}
