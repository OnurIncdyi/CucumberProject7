Feature: Sig In Functionality

  Scenario:Sig In

    Given Navigate to basqar
    And Click on the element in Buttons

      | signBtn |

    Then User sending the keys in Dialog content

      | inputEmail2    | Medchno3645@gmail.com |
      | inputPassword2 | 12345678Techno        |

  Scenario Outline: Address create

    When Click on the element in Buttons

      | signInBtn          |
      | menuBar            |
      | myAccountBtn       |
      | manageAddressesBtn |
      | addNwwAdressBtn    |

    And fill in the information
      | firstname          | <firstname>          |
      | lastname           | <lastname>           |
      | inputStreetAddress | <inputStreetAddress> |
      | city               | <city>               |
      | inputtelephone     | <inputtelephone>     |
      | inputZip           | <inputZip>           |

    When Click on the element in Buttons

      | country           |
      | <ulke>            |
      | saveAddressButton |

    Then verifyThatYourAccount

      | addressVerify | saved |


    Examples:
      | firstname | lastname | inputStreetAddress | city   | inputtelephone | inputZip | ulke    |
      | onur      | ncdyı    | leveny             | ordu   | 25864          | 34415    | turkey  |
      | alex     | souza    | besiktas           | fatsa  | 1569742        | 52341    | germany |
      | devid      | backham | sanayi             | kavraz | 369521         | 25639    | russia |










