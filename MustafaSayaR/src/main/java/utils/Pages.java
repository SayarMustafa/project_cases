package utils;

import lombok.Data;
import pages.*;

@Data
public class Pages {

	private TwoNHomePage homePage;

	private SearchResultPage searchResultPage;

	private HrPage hrPage;

	public Pages() {
		homePage = new TwoNHomePage();
		searchResultPage = new SearchResultPage();
		hrPage = new HrPage();
	}

}
