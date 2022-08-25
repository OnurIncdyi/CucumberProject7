Feature: Sig In Functionality

  Scenario:Sig In  Functionality

    Given Navigate to basqar
    And Click on the element in Buttons

      | signBtn |

    And User sending the keys in Dialog content

      | inputEmail2    | Medchno3645@gmail.com |
      | inputPassword2 | 12345678Techno        |

    And Click on the element in Buttons

      | signInBtn |

    And Success message should be displayed

      | verifyTwo | Welcome        |

