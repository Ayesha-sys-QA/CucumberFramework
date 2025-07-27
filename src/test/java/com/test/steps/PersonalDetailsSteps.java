package com.test.steps;

import org.openqa.selenium.WebElement;

import com.test.utils.CommonMethods;

import io.cucumber.java.en.Then;

public class PersonalDetailsSteps extends CommonMethods {
	@Then("I am able to modify Employee Details {string}, {string}, {string}, {string}, {string}")
	public void i_am_able_to_modify_employee_details(String driverLicense, String expirationDate, String smoker,
			String gender, String nationality) {

		// lets make sure we are on the Personal Details page
		waitForVisibility(personalDetailsPage.firstName);

		// enter the driver license
		sendText(personalDetailsPage.driverLicense, driverLicense);

		// click on the smoker checkbox if the value is "Yes"
		if (smoker.equalsIgnoreCase("Yes")) {
			click(personalDetailsPage.smokerCheckbox);
		}

		// 1st way: Wont work because the gender dropdown is not a standard select
		// element
		// select gender from the dropdown
		// selectDropdown(personalDetailsPage.genderDropdown, gender);

		// 2nd way:
		// loop over the items of gender dropdown and select the one that matches gender
		click(personalDetailsPage.genderInput);
		clickOnElement(personalDetailsPage.genderOptions, gender);

		// select nationality
		click(personalDetailsPage.nationalityInput);
		clickOnElement(personalDetailsPage.nationalityOptions, nationality);

		// enter the driver license expiration date
		// this wont work because of format issues
		// sendText(personalDetailsPage.driverLicenseExpirationDate, expirationDate);

		// click on the driver license expiration date icon to open the calendar
		click(personalDetailsPage.driverLicenseExpirationDateIcon);

		// i have to split the expiration date to get the month and year and day
		String[] dateParts = expirationDate.split("-");
		// dateParts = ["2023", "08", "07"]
		String year = dateParts[0];
		String month = dateParts[1];
		String day = dateParts[2];

		// select the month
		// months are displayed as month names, so we need to convert the month number
		// to a month name
		click(personalDetailsPage.monthInput);
		int monthIndex = Integer.parseInt(month) - 1; // convert to zero-based index
		WebElement monthToSelect = personalDetailsPage.monthOptions.get(monthIndex);
		click(monthToSelect);

		// select the year
		click(personalDetailsPage.yearInput);
		clickOnElement(personalDetailsPage.yearOptions, year);

		// select the day
		int dayValue = Integer.parseInt(day);
		selectCalendarDate(personalDetailsPage.calendarDays, dayValue + "");

		wait(5);
	}

	@Then("I click on Personal Details Save")
	public void i_click_on_personal_details_save() {
		jsClick(personalDetailsPage.personalDetailsSaveBtn);
	}
}