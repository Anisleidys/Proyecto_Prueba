package loging;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class Feature_Login {
  @Autowired
  LoginFacade loginFacade;

    @Given("Me logueo con usuario {string} y contrasena {string}")
    public void meLogueoConUsuarioYContrasena(String user, String pass) {
        loginFacade.userAcces(user, pass);
        
    }

    @When("Doy clic en boton accder")
    public void doyClicEnBotonAccder() {
      loginFacade.clicBotton();

        
    }

    @Then("Valido se loguea correctamente")
    public void validoSeLogueaCorrectamente() {
      Assert.assertEquals("El usuario no se logueo", "logout", driver.findElement(By.xpath()));
    }
}
