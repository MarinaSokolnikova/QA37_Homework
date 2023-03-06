import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start_HW {

    WebDriver wd;

    @Test
    public void start(){

        wd = new ChromeDriver();
        wd.navigate().to("https://ticket-service-69443.firebaseapp.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();

        wd.quit();
    }
}
