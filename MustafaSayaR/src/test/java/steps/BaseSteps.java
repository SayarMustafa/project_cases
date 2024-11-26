package steps;

import org.openqa.selenium.WebDriver;
import utils.DriverManager;
import utils.Pages;

public abstract class BaseSteps {

	protected final Pages PAGES = new Pages();

	protected final WebDriver DRIVER = DriverManager.getDriver();

}
