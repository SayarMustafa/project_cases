package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class HomePageSteps extends BaseSteps {

	@When("The user navigate on the navbar and sees the navbar buttons direct the user on correct page")
	public void theUserNavigateOnTheNavbarAndSeesTheNavbarButtonsDirectTheUserOnCorrectPage() {
		Assertions.assertThat(PAGES.getHomePage().navigateOnNvaBar()).isTrue();
	}

	@When("The user click on search icon and enter {string} on search box")
	public void theUserClickOnSearchIconAndEnterOnSearchBox(String inputText) {
		PAGES.getHomePage().clickOnSearchIcon();
		PAGES.getHomePage().enterSearchText(inputText);
	}

}
