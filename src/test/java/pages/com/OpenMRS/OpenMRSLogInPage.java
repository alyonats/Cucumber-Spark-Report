package pages.com.OpenMRS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenMRSLogInPage {
    public OpenMRSLogInPage(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "authUser")
    public WebElement userNameInput  ;

    @FindBy(id = "clearPass")
    public WebElement passwordInput   ;

    @FindBy(id = "login-button")
    public WebElement loginButton  ;


    /**
     * Method is used to log in to open MRS.
     * It takes String username and String password.
     * @param username
     * @param password
     */
   public  void logIn(String username,String password){
       userNameInput.sendKeys(username);
       passwordInput.sendKeys(password);
       loginButton.click();

   }
}
