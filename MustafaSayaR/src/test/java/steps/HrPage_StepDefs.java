package steps;

import config.ConfigurationManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;
import utils.BrowserUtils;
import utils.DriverManager;

public class HrPage_StepDefs extends BaseSteps {

	@When("the user is on HR Page")
	public void theUserIsOnHRPage() {
		DriverManager.getDriver().get(ConfigurationManager.getProperty("baseUrl_2"));
		String firstHrPageText = "Kişisel Bilgiler";
		Assertions.assertThat(PAGES.getHrPage().getFirstConfirmationHrPageText().contains(firstHrPageText)).isTrue();
	}

	@And("the user enters the name as {string}")
	public void theUserEntersTheNameAs(String nameSurname) {
		PAGES.getHrPage().fillNameSurnameBox(nameSurname);

	}

	@And("the user enters the birthdate as {string}")
	public void theUserEntersTheBirthdateAs(String birthDay) {
		PAGES.getHrPage().chooseBirthDate(birthDay);
	}

	@And("the user enters the identity number as {string}")
	public void theUserEntersTheIdentityNumberAs(String idNumber) {
		PAGES.getHrPage().fillIdentityNumber(idNumber);
	}

	@And("the user enters the phone number as {string}")
	public void theUserEntersThePhoneNumberAs(String phoneNumber) {
		PAGES.getHrPage().fillPhoneNumber(phoneNumber);
	}

	@And("the user enters the email as {string}")
	public void theUserEntersTheEmailAs(String eMail) {
		PAGES.getHrPage().fillEmailBox(eMail);
	}

	@And("the uploads the resume")
	public void theUploadsTheResume() {
		// Dosya yolunu güncellemek gerekir.
		PAGES.getHrPage()
			.uploadCV(
					"C:\\Users\\Mustafa Sayar\\Desktop\\last\\EnsonHali\\MustafaSayar\\src\\test\\resources\\testdata\\2N_TECH_Yazilim_Test_Vaka_Calismasi_2024_11_20.pdf");
	}

	@And("the user chooses the Education Level")
	public void theUserChoosesTheEducationLevel() {
		PAGES.getHrPage().chooseEducationLevel();
	}

	@And("the user marks the checkbox")
	public void theUserMarksTheCheckbox() {
		PAGES.getHrPage().markCheckBox();
	}

	@And("the user clicks on submit button")
	public void theUserClicksOnSubmitButton() {
		PAGES.getHrPage().clickOnSubmitButton();
	}

	@Then("the user sees the second page")
	public void theUserSeesTheSecondPage() {
		String secondHrPageText = "Diğer Bilgiler";
		Assertions.assertThat(PAGES.getHrPage().getSecondConfirmationHrPageText().contains(secondHrPageText)).isTrue();
	}

	@When("the user selects the position as Test Engineer")
	public void theUserSelectsThePositionAsTestEngineer() {
		PAGES.getHrPage().clickOnTestEngineerBox();
	}

	@And("the user clicks on Send button")
	public void theUserClicksOnSendButton() {
		PAGES.getHrPage().clickOnSendButton();
	}

	@Then("the user sees the confirmation Page")
	public void theUserSeesTheConfirmationPage() {
		String confirmationPageText = "Form Başarı ile gönderildi. Katıldığınız için teşekkür ederiz.";
		Assertions.assertThat(PAGES.getHrPage().getConfirmationHrPageText().contains(confirmationPageText)).isTrue();

	}

}
