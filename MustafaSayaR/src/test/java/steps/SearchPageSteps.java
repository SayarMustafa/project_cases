package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.Assertions;

public class SearchPageSteps extends BaseSteps {

	@And("The user click for the #{int} new")
	public void theUserClickForTheNew(int searchNumber) {
		PAGES.getSearchResultPage().clickOnSearchResult(searchNumber);
	}

	@Then("The user sees the correct new")
	public void theUserSeesTheCorrectNew() {
		String textDetail = "Adres: Kemankeş Cd. Fransız Geçidi İş Merkezi, No: 53, C Blok, İç Kapı No:23, Beyoğlu / İstanbul E-posta: info@2nnews.com";
		Assertions.assertThat(PAGES.getSearchResultPage().getNewDetails().contains(textDetail)).isTrue();
	}

}
