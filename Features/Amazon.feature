Feature: Select Product and check out in Amazon

  Scenario: User Select Product from Amazon and Check out the Product
    Given Visit amazon.in
    When Click ALL categories in the left side
    And Click Men's fashion category and click TShirts and Polos
    And In the left side option, choose "2XL" size
    And In the left side option, mark eligible for Pay on delivery
    And From the results, scroll down and select AMERICAN CREW product and navigate to Product page
    And Select Royal Blue & Navy Melange color
    And Open and see size chart link present in product page then close it
    And After that, select any size from size dropdown in product page
    And Add that product to cart and verify whether it is reflected in cart or not with correct details
    Then Print the verification message in console for cart validation is success or not
