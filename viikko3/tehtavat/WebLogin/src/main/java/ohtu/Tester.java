package ohtu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;

public class Tester {

    public static void main(String[] args) {

        /*WebDriver driver = new ChromeDriver();

        driver.get("http://localhost:4567");
        
        sleep(2);
        //Succesful login
        WebElement element = driver.findElement(By.linkText("login"));
        element.click();

        sleep(2);

        element = driver.findElement(By.name("username"));
        element.sendKeys("pekka");
        element = driver.findElement(By.name("password"));
        element.sendKeys("akkep");
        element = driver.findElement(By.name("login"));
        sleep(2);
        element.submit();

        driver.get("http://localhost:4567");
        sleep(2);
	//Unsuccesful login
        WebElement element2 = driver.findElement(By.linkText("login"));
        element2.click();

        sleep(2);

        element2 = driver.findElement(By.name("username"));
        element2.sendKeys("pekka");
        element2 = driver.findElement(By.name("password"));
        element2.sendKeys("pakkep"); //wrong password
        element2 = driver.findElement(By.name("login"));
        sleep(2);
        element2.submit();

        driver.get("http://localhost:4567");
        sleep(2);
        //New user registeration
        WebElement element3 = driver.findElement(By.linkText("register new user"));
        element3.click();

        sleep(2);

        element3 = driver.findElement(By.name("username"));
        element3.sendKeys("arto"+ new Random().nextInt(100000));
        element3 = driver.findElement(By.name("password"));
        element3.sendKeys("salasana123");
        element3 = driver.findElement(By.name("passwordConfirmation"));
        element3.sendKeys("salasana123");
        element3 = driver.findElement(By.name("signup"));
        sleep(2);
        element3.submit();
        sleep(3);
	//Navigate to logout
        WebElement element4 = driver.findElement(By.linkText("continue to application mainpage"));
        element4.click();

        sleep(2);

        element4 = driver.findElement(By.linkText("logout"));
        element4.click();

        sleep(2);
        
        
        driver.quit();*/
    }
    
    private static void sleep(int n){
        try{
            Thread.sleep(n*1000);
        } catch(Exception e){}
    }
}
