@HrPageSteps
  Feature: HR Page Feature
    Scenario Outline: The user applies for a job on HR Page

      When the user is on HR Page

      And  the user enters the name as "<nameSurname>"

      And the user enters the birthdate as "<birthDate>"

      And the user enters the identity number as "<identityNumber>"

      And the user enters the phone number as "<phoneNumber>"

      And the user enters the email as "<email>"

      And the uploads the resume

      And the user chooses the Education Level

      And the user marks the checkbox

      And the user clicks on submit button

      Then the user sees the second page


      When the user selects the position as Test Engineer

      And the user clicks on Send button

      Then the user sees the confirmation Page

      Examples:

        | nameSurname    | birthDate  | identityNumber | phoneNumber | email                    |  |
        | Ahmere YILNAZA | 06/22/1996 | 12345678902    | 05555555908 | ahmereysilnaz@gmail.com  |  |
        | Mehmet YILNAZA | 06/22/1995 | 12345678954    | 05555555923 | mehmeteysilnaz@gmail.com |  |





