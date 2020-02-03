$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User Management",
  "description": "As a new user\r\nI want to login",
  "id": "user-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature-guru-01"
    },
    {
      "line": 1,
      "name": "@register"
    }
  ]
});
formatter.before({
  "duration": 12165727400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login User",
  "description": "",
  "id": "user-management;login-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@mc-0101"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I access to Login Function",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.goToLoginPage()"
});
formatter.result({
  "duration": 112817000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login()"
});
formatter.result({
  "duration": 46800,
  "status": "passed"
});
formatter.after({
  "duration": 1368282400,
  "status": "passed"
});
formatter.uri("Register.feature");
formatter.feature({
  "line": 2,
  "name": "User Management",
  "description": "As a user\r\nI want to register",
  "id": "user-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature-guru-02"
    }
  ]
});
formatter.before({
  "duration": 12969597000,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Register New User",
  "description": "",
  "id": "user-management;register-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@mc-0201"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I access to Register Function",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I register",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.gotoRegisterPage()"
});
formatter.result({
  "duration": 238532100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iRegister()"
});
formatter.result({
  "duration": 4792250500,
  "status": "passed"
});
formatter.after({
  "duration": 979053800,
  "status": "passed"
});
});