package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.Driver;

public class Hooks {
    @Before
    public void setUp(){
        Driver.getDriver();


    }
    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES),
                    "image/png","image");
        }


    }
}
