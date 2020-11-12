$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Webstaurant.feature");
formatter.feature({
  "name": "Assignment",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.scenario({
  "name": "Checking search results",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Go to \u0027webstaurantstore website\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "AssignmentSteps.go_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \u0027string\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "AssignmentSteps.search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Check the search result ensuring every product item has the word \u0027Table\u0027 its title.",
  "keyword": "Then "
});
formatter.match({
  "location": "AssignmentSteps.check_the_search_result_ensuring_every_product_item_has_the_word_its_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add the last of found items to Cart.",
  "keyword": "And "
});
formatter.match({
  "location": "AssignmentSteps.add_the_last_of_found_items_to_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Empty Cart.",
  "keyword": "Then "
});
formatter.match({
  "location": "AssignmentSteps.empty_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});