package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResultPage extends BasePage {

	@FindBy(css = ".cmsmasters-blog__posts article > div div[class='elementor-section-wrap']")
	private List<WebElement> searchResultList;

	@FindBy(css = "p[class='elementor-heading-title elementor-size-default']")
	private WebElement newsDetails;

	public void clickOnSearchResult(Integer searchResultNumber) {
		if (searchResultList.size() >= searchResultNumber) {
			searchResultList.get(searchResultNumber - 1).click();
		}
		else {
			System.out.println("Search result not found");
		}
	}

	public String getNewDetails() {
		return newsDetails.getText();
	}

}
