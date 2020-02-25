$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 2,
  "name": "User Management",
  "description": "As a user\r\nI want to login",
  "id": "user-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature-guru-01"
    },
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 12999954600,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login with correct password only",
  "description": "",
  "id": "user-management;login-with-correct-password-only",
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
  "keyword": "Given "
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
  "duration": 901274600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.login()"
});
formatter.result({
  "duration": 35100,
  "status": "passed"
});
formatter.after({
  "duration": 639780200,
  "status": "passed"
});
formatter.uri("OrderAndReturn.feature");
formatter.feature({
  "line": 2,
  "name": "User Management",
  "description": "As a user\r\nI want to order and return",
  "id": "user-management",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@feature-guru-03"
    },
    {
      "line": 1,
      "name": "@order-and-return"
    }
  ]
});
formatter.before({
  "duration": 13333441400,
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
      "name": "@mc-0301"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I access to Orders and Returns page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I order and return by \"Email\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I order successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "OrdersAndReturnsSteps.accessToOrdersAndReturnsPage()"
});
formatter.result({
  "duration": 50548200,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"css selector\",\"selector\":\"#oar_order_id\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-AETF1CO\u0027, ip: \u0027192.168.1.57\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\ASUS\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:52503}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 3953b2b634481f58ef3d1392836f15fc\n*** Element info: {Using\u003did, value\u003doar_order_id}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat workflows.OrdersAndReturnsPage.\u003cinit\u003e(OrdersAndReturnsPage.java:24)\r\n\tat stepdefs.OrdersAndReturnsSteps.\u003cinit\u003e(OrdersAndReturnsSteps.java:16)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.picocontainer.injectors.AbstractInjector.newInstance(AbstractInjector.java:145)\r\n\tat org.picocontainer.injectors.ConstructorInjector$1.run(ConstructorInjector.java:342)\r\n\tat org.picocontainer.injectors.AbstractInjector$ThreadLocalCyclicDependencyGuard.observe(AbstractInjector.java:270)\r\n\tat org.picocontainer.injectors.ConstructorInjector.getComponentInstance(ConstructorInjector.java:364)\r\n\tat org.picocontainer.injectors.AbstractInjectionFactory$LifecycleAdapter.getComponentInstance(AbstractInjectionFactory.java:56)\r\n\tat org.picocontainer.behaviors.AbstractBehavior.getComponentInstance(AbstractBehavior.java:64)\r\n\tat org.picocontainer.behaviors.Stored.getComponentInstance(Stored.java:91)\r\n\tat org.picocontainer.DefaultPicoContainer.getInstance(DefaultPicoContainer.java:699)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:647)\r\n\tat org.picocontainer.DefaultPicoContainer.getComponent(DefaultPicoContainer.java:678)\r\n\tat cucumber.runtime.java.picocontainer.PicoFactory.getInstance(PicoFactory.java:40)\r\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:38)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.base/java.lang.reflect.Method.invoke(Method.java:566)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:133)\r\n\tat org.testng.internal.TestInvoker.invokeMethod(TestInvoker.java:584)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethod(TestInvoker.java:172)\r\n\tat org.testng.internal.MethodRunner.runInSequence(MethodRunner.java:46)\r\n\tat org.testng.internal.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:804)\r\n\tat org.testng.internal.TestInvoker.invokeTestMethods(TestInvoker.java:145)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:146)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:128)\r\n\tat java.base/java.util.ArrayList.forEach(ArrayList.java:1540)\r\n\tat org.testng.TestRunner.privateRun(TestRunner.java:770)\r\n\tat org.testng.TestRunner.run(TestRunner.java:591)\r\n\tat org.testng.SuiteRunner.runTest(SuiteRunner.java:402)\r\n\tat org.testng.SuiteRunner.access$000(SuiteRunner.java:41)\r\n\tat org.testng.SuiteRunner$SuiteWorker.run(SuiteRunner.java:443)\r\n\tat org.testng.internal.thread.ThreadUtil.lambda$execute$0(ThreadUtil.java:67)\r\n\tat java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)\r\n\tat java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)\r\n\tat java.base/java.lang.Thread.run(Thread.java:834)\r\n\tat ✽.Given I access to Orders and Returns page(OrderAndReturn.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Email",
      "offset": 23
    }
  ],
  "location": "OrdersAndReturnsSteps.orderAndReturn(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "OrdersAndReturnsSteps.assertOrderMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1636745800,
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
    },
    {
      "line": 1,
      "name": "@register"
    }
  ]
});
formatter.before({
  "duration": 12572698600,
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
  "duration": 1398656800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.iRegister()"
});
formatter.result({
  "duration": 33800,
  "status": "passed"
});
formatter.after({
  "duration": 603663700,
  "status": "passed"
});
});