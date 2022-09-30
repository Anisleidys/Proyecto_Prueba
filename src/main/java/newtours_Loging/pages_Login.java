package newtours_Loging;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pages_Login {
    private WebDriver driver;
    public pages_Login (WebDriver driver){
        this.driver=driver;
    }
    private void login(String user, String pass){
        driver.findElement(By.name("userName")).sendKeys("user");
        driver.findElement(By.name("password")).sendKeys("user");
        driver.findElement(By.name("login")).click();

    }



}
