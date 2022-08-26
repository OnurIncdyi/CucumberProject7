Feature:  Product purchase Functionality

 Background:
    Given Navigate to basqar
    And Click on the element in Buttons

      | signBtn |

    And User sending the keys in Dialog content

      | inputEmail2    | Medchno3645@gmail.com |
      | inputPassword2 | 12345678Techno        |

    When Click on the element in Buttons

      | send2 |
    And waitText

    Then Success message should be displayed

      | verifyTwo | Welcome       |


    Scenario: product payment
      When Click on the element in Buttons
      |    backPack  |
      |       addtocrdBtn       |

      Then verifyThatYourAccount

        | addToCartConfirm | You added |

      When Click on the element in Buttons

        | showcart         |
        | prodecetCheckout |

      And VisibleLoading

      When Click on the element in Buttons

        | next |

      And VisibleLoading

      When Click on the element in Buttons
        | placeOrder |

      Then Success message should be displayed

        | thankYouOrder | Thank you |





