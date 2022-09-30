package loging;

import org.openqa.selenium.By;

public class LoginWebManager implements loginManager {
    @Override
    public void userAcces(String user, String pass){
        //Dar clic login
        driver.findElement(By.xpath()).click
        //Dar clic en input usuario
        driver.findElement(By.xpath()).sendString(user);
        driver.findElement(By.xpath()).sendString(pass);
    }
    @Override
    public void clicBotton() {
        //Dar clic boton acceder
        driver.findElement(By.xpath()).click
    }

}
