package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;
import java.util.List;

public class TwoNHomePage extends BasePage {

	@FindBy(css = "nav[class='elementor-widget-cmsmasters-nav-menu__main elementor-widget-cmsmasters-nav-menu__container cmsmasters-layout-horizontal'] > ul > li")
	private List<WebElement> navBarItemlist;

	@FindBy(css = "h1")
	private WebElement header;

	@FindBy(css = "svg[class='e-font-icon-svg e-fas-search']")
	private WebElement searchIcon;

	@FindBy(css = "input[type='search']")
	private WebElement searchInputBox;

	public boolean navigateOnNvaBar() {
		for (int i = 0; i < navBarItemlist.size(); i++) {
			BrowserUtils.moveToElement(navBarItemlist.get(i));
			List<WebElement> subList = navBarItemlist.get(i).findElements(By.cssSelector("ul > li"));
			for (int y = 0; y < subList.size(); y++) {
				String text = subList.get(y).findElement(By.cssSelector("a")).getText();
				BrowserUtils.clickOnElement(subList.get(y));
				BrowserUtils.moveToElement(navBarItemlist.get(i));
				subList = navBarItemlist.get(i).findElements(By.cssSelector("ul > li"));
				if (!text.equals(header.getText())) {
					return false;
				}
			}
		}
		return true;
	}

	public void clickOnSearchIcon() {
		BrowserUtils.clickOnElement(searchIcon);
	}

	public void enterSearchText(String searchText) {
		searchInputBox.sendKeys(searchText);
		searchInputBox.sendKeys(Keys.ENTER);
	}

}
