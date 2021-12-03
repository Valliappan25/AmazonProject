$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Amazon.feature");
formatter.feature({
  "name": "Select Product and check out in Amazon",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User Select Product from Amazon and Check out the Product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Visit amazon.in",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.visit_amazonin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click ALL categories in the left side",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.click_all_categories_in_the_left_side()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Men\u0027s fashion category and click TShirts and Polos",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.click_mens_fashion_category_and_click_tshirts_and_polos()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the left side option, choose \"2XL\" size",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_the_left_side_option_choose_something_size(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "In the left side option, mark eligible for Pay on delivery",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.in_the_left_side_option_mark_eligible_for_pay_on_delivery()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "From the results, scroll down and select AMERICAN CREW product and navigate to Product page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.from_the_results_scroll_down_and_select_american_crew_product_and_navigate_to_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select Royal Blue \u0026 Navy Melange color",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.select_royal_blue_navy_melange_color()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Open and see size chart link present in product page then close it",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.open_and_see_size_chart_link_present_in_product_page_then_close_it()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "After that, select any size from size dropdown in product page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.after_that_select_any_size_from_size_dropdown_in_product_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add that product to cart and verify whether it is reflected in cart or not with correct details",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.add_that_product_to_cart_and_verify_whether_it_is_reflected_in_cart_or_not_with_correct_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Print the verification message in console for cart validation is success or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.print_the_verification_message_in_console_for_cart_validation_is_success_or_not()"
});
formatter.result({
  "status": "passed"
});
});