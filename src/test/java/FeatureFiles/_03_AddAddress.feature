Feature: Sig In Functionality

  Scenario:Sig In

    Given Navigate to basqar
    And Click on the element in Buttons

      | signBtn |

    And User sending the keys in Dialog content

      | inputEmail2    | Medchno3645@gmail.com |
      | inputPassword2 | 12345678Techno        |

    And Click on the element in Buttons

      | signInBtn |
      | menuBar |
      | myAccountBtn |
      | manageAddressesBtn |
      | addNwwAdressBtn |

  Scenario Outline: Address create
    When User a Address name as "<contactInformation>" short name as "<shortName>"

    Examples:
      | contactInformation | shortName |
      | inputCompany | Adidas |
      | inputtelephone | 257244155 |
      | inputStreetAddress | harward |
      | city | california |
      | inputZip | 34415 |

    And  Click on the element in Buttons
      | saveAdressButn |

    And Success message should be displayed

      | verifyAcntThree | Welcome        |


#      And Click on the element in Buttons
#
#        | signBtn |
#
#      And User sending the keys in Dialog content
#
#        | inputEmail2    | Medchno3645@gmail.com |
#        | inputPassword2 | 12345678Techno        |
#
#      And Click on the element in Buttons
#
#        | signInBtn |
#        | menuBar |
#        | myAccountBtn |











