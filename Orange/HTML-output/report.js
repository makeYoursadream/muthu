$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/src.feature");
formatter.feature({
  "name": "test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "test Orange",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login to url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.step({
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click login",
  "keyword": "And "
});
formatter.step({
  "name": "conform the login page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "test Orange",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Login to url \"https://opensource-demo.orangehrmlive.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "process.Orange.Login_to_url(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "process.Orange.enter_the_email_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login",
  "keyword": "And "
});
formatter.match({
  "location": "process.Orange.click_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "conform the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "process.Orange.conform_the_login_page()"
});
formatter.result({
  "status": "passed"
});
});