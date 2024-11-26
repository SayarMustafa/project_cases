package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BrowserUtils;

import java.util.List;

public class HrPage extends BasePage {

	@FindBy(xpath = "//span[contains(text(),'Kişisel Bilgiler')]")
	private WebElement firstConfirmationPageTextField;

	@FindBy(id = "name")
	private WebElement nameSurnameBox;

	@FindBy(id = "birth")
	private WebElement birthDateField;

	@FindBy(id = "tcKimlik")
	private WebElement identityNumberField;

	@FindBy(id = "phone")
	private WebElement phoneNumberField;

	@FindBy(id = "email")
	private WebElement emailField;

	@FindBy(xpath = "//label[contains(text(),'Dosya Yükleyiniz (.pdf)')]")
	private WebElement cvField;

	@FindBy(xpath = "//button[@type='button']")
	private List<WebElement> studyInfo;

	@FindBy(id = "pdp1")
	private WebElement checkBox;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;

	@FindBy(xpath = "//span[contains(text(),'Diğer Bilgiler')]")
	private WebElement secondConfirmationPageTextField;

	@FindBy(xpath = "//span[contains(text(),'Test Engineer')]")
	private WebElement testEngineerBox;

	@FindBy(xpath = " //div[contains(text(),'Gönder')]")
	private WebElement sendButton;

	@FindBy(css = "p[class='text-[16px] flex justify-start items-start leading-6']")
	private WebElement confirmationTextField;

	@FindBy(id = "cv_field")
	private WebElement cvFieldBox;

	public String getFirstConfirmationHrPageText() {
		return firstConfirmationPageTextField.getText();
	}

	public String getSecondConfirmationHrPageText() {
		return secondConfirmationPageTextField.getText();
	}

	public String getConfirmationHrPageText() {
		BrowserUtils.waitForElement(confirmationTextField);
		return confirmationTextField.getText();
	}

	public void fillNameSurnameBox(String nameSurname) {
		if (nameSurname == null || nameSurname.isEmpty()) {
			throw new IllegalArgumentException("Name and surname cannot be empty");
		}
		nameSurnameBox.click();
		nameSurnameBox.sendKeys(nameSurname);
	}

	public void chooseBirthDate(String birthDay) {
		birthDateField.click();
		birthDateField.sendKeys(birthDay);

		////////////////////////////////////////////
		////////////////////////////////////////////
	}

	public void fillIdentityNumber(String idNumber) {
		try {

			if (idNumber.length() > 11) {
				throw new IllegalArgumentException("Identity number must not exceed 11 digits.");
			}

			identityNumberField.click();
			identityNumberField.sendKeys(idNumber);
		}
		catch (IllegalArgumentException e) {

			System.out.println("Error: " + e.getMessage());

		}
	}

	public void fillPhoneNumber(String phoneNumber) {
		try {

			if (phoneNumber.length() > 11) {
				throw new IllegalArgumentException("Phone number must not exceed 11 digits.");
			}

			phoneNumberField.click();
			phoneNumberField.sendKeys(phoneNumber);
		}
		catch (IllegalArgumentException e) {

			System.out.println("Error: " + e.getMessage());

		}
	}

	public void fillEmailBox(String email) {
		try {

			if (!email.contains("@")) {
				throw new IllegalArgumentException("Email address must contain '@' symbol.");
			}

			emailField.click();
			emailField.sendKeys(email);
		}
		catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());

		}
	}

	public void uploadCV(String filePath) {
		cvFieldBox.sendKeys(filePath);
	}

	public void chooseEducationLevel() {
		studyInfo.get(1).click();
	}

	public void markCheckBox() {
		// BrowserUtils.clickOnElement(checkBox);
		BrowserUtils.changeValueWithJavaScript(checkBox, "true");
	}

	public void clickOnSubmitButton() {
		submitButton.click();
	}

	public void clickOnTestEngineerBox() {
		testEngineerBox.click();
	}

	public void clickOnSendButton() {
		sendButton.click();
	}

}
