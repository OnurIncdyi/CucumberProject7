Feature: Login Functionality

  Scenario:Create Account Functionality

    Given Navigate to basqar
    And Click on the element in Buttons

      | createAccount |

    And User sending the keys in Dialog content

      | firstname            | Techno               |
      | lastname             | Study                |
      | email_address        | Medchno3645@gmail.com |
      | password             | 12345678Techno       |
      | passwordConfirmation | 12345678Techno       |

    And Success message should be displayed

      | verifyOne            | Thank               |


