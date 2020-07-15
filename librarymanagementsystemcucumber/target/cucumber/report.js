$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin.feature");
formatter.feature({
  "line": 1,
  "name": "Admin can add,delete,update,issue books and able to view books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12555494300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters username and password",
  "rows": [
    {
      "cells": [
        "shailu@gmail.com",
        "Shailaja@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 5243374800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 376730000,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 7388500,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Admin should be able to add books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-add-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Admin is on adding book page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Admin enters book details",
  "rows": [
    {
      "cells": [
        "Biology",
        "Ratnakar",
        "Sm publications",
        "science",
        "Added Successfully"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Admin logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_adding_book_page()"
});
formatter.result({
  "duration": 5018631400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[contains(text(),\u0027Librarian\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-UICCFCB\u0027, ip: \u0027192.168.43.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\ankitha\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60546}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 435f511b4331774fa3fc3289f494e485\n*** Element info: {Using\u003dxpath, value\u003d//a[contains(text(),\u0027Librarian\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.capgemini.librarymanagementsystemcucumber.stepdefinitions.AdminSteps.admin_is_on_adding_book_page(AdminSteps.java:60)\r\n\tat ✽.Given Admin is on adding book page(admin.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdminSteps.admin_enters_book_details(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.admin_logout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 11263013300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters username and password",
  "rows": [
    {
      "cells": [
        "shailu@gmail.com",
        "Shailaja@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 5006683700,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 260023000,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 8786400,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Admin should be able to remove books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-remove-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "Admin is on removing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "Book deleted successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "Admin logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_removing_book_page()"
});
formatter.result({
  "duration": 182019400,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_deleted_successfully()"
});
formatter.result({
  "duration": 64193500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_logout_page()"
});
formatter.result({
  "duration": 2077834700,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "duration": 2272599800,
  "status": "passed"
});
formatter.before({
  "duration": 10493551400,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters username and password",
  "rows": [
    {
      "cells": [
        "shailu@gmail.com",
        "Shailaja@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 5006408800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 280281400,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 8412500,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Admin should be able to issue books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-able-to-issue-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 25,
  "name": "Admin is on issuing book page",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "Admin move hover on issuse",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "Book issued successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Admin logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_issuing_book_page()"
});
formatter.result({
  "duration": 160491800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_move_hover_on_issuse()"
});
formatter.result({
  "duration": 49200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_issued_successfully()"
});
formatter.result({
  "duration": 5056353100,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//button[contains(.,\u0027Issue\u0027)]\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-UICCFCB\u0027, ip: \u0027192.168.43.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\ankitha\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60609}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 323e46cd4052329aa86e6b9a258d88f7\n*** Element info: {Using\u003dxpath, value\u003d//button[contains(.,\u0027Issue\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:421)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:361)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.capgemini.librarymanagementsystemcucumber.stepdefinitions.AdminSteps.book_issued_successfully(AdminSteps.java:103)\r\n\tat ✽.Then Book issued successfully(admin.feature:27)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdminSteps.admin_logout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 11580535500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Admin is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Admin enters username and password",
  "rows": [
    {
      "cells": [
        "shailu@gmail.com",
        "Shailaja@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Admin should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_Login_page()"
});
formatter.result({
  "duration": 5007847900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 306956900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_should_be_logged_in()"
});
formatter.result({
  "duration": 6886900,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Admin should be to view books",
  "description": "",
  "id": "admin-can-add,delete,update,issue-books-and-able-to-view-books;admin-should-be-to-view-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 32,
  "name": "Admin is on view book page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "Admin clicks on show books",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Admin viewed booked sucessfully",
  "keyword": "Then "
});
formatter.step({
  "line": 35,
  "name": "Admin logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_view_book_page()"
});
formatter.result({
  "duration": 108618100,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_clicks_on_show_books()"
});
formatter.result({
  "duration": 40800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_viewed_booked_sucessfully()"
});
formatter.result({
  "duration": 112672200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_logout_page()"
});
formatter.result({
  "duration": 2070123200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "duration": 2073029900,
  "status": "passed"
});
formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "User Registration",
  "description": "",
  "id": "user-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12665914400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User Registration with given details",
  "description": "",
  "id": "user-registration;user-registration-with-given-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters firstName ,lastName,email,password,mobile,role,status",
  "rows": [
    {
      "cells": [
        "krish",
        "Emmula",
        "krish@gmail.com",
        "Krish@123",
        "8979399542",
        "student",
        "registered successfully"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.user_is_on_Login_page()"
});
formatter.result({
  "duration": 172517800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.student_enters_firstName_lastName_email_password_mobile_role_status(DataTable)"
});
formatter.result({
  "duration": 765644900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.user_should_be_logged_in()"
});
formatter.result({
  "duration": 75694800,
  "status": "passed"
});
formatter.uri("student.feature");
formatter.feature({
  "line": 1,
  "name": "Student can request,return and able to view books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14469567600,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters username and password",
  "rows": [
    {
      "cells": [
        "deepthi@gmail.com",
        "Deepthik@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 5107044300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.student_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 320055100,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 9729600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Student should be able to request books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-request-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Student is on request book page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Student clicks on request button",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Book Requested Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "student logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.student_is_on_request_book_page()"
});
formatter.result({
  "duration": 5198071400,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"RequestBook\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-UICCFCB\u0027, ip: \u0027192.168.43.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\ankitha\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60716}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ce9a7dc76dd6297148910be37debdbaf\n*** Element info: {Using\u003dlink text, value\u003dRequestBook}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:373)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.capgemini.librarymanagementsystemcucumber.stepdefinitions.AdminSteps.student_is_on_request_book_page(AdminSteps.java:171)\r\n\tat ✽.Given Student is on request book page(student.feature:11)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdminSteps.student_clicks_on_request_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.book_Requested_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.student_logout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.before({
  "duration": 13504973300,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Student is on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Student enters username and password",
  "rows": [
    {
      "cells": [
        "deepthi@gmail.com",
        "Deepthik@1"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Student should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.student_is_on_Login_page()"
});
formatter.result({
  "duration": 5108029100,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.student_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 619613900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.student_should_be_logged_in()"
});
formatter.result({
  "duration": 50043700,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Student should be able to return books",
  "description": "",
  "id": "student-can-request,return-and-able-to-view-books;student-should-be-able-to-return-books",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "Student is on returning book page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Student clicks on return button",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book Returned Successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "student logout page",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "close browser page",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.student_is_on_returning_book_page()"
});
formatter.result({
  "duration": 5187617000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"link text\",\"selector\":\"ReturnBook\"}\n  (Session info: chrome\u003d83.0.4103.97)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.11.0\u0027, revision: \u0027e59cfb3\u0027, time: \u00272018-03-11T20:26:55.152Z\u0027\nSystem info: host: \u0027DESKTOP-UICCFCB\u0027, ip: \u0027192.168.43.206\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.97, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: C:\\Users\\ankitha\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:60759}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 765e84f85a4c5e8c3914fdc441b37142\n*** Element info: {Using\u003dlink text, value\u003dReturnBook}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:545)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:319)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByLinkText(RemoteWebDriver.java:373)\r\n\tat org.openqa.selenium.By$ByLinkText.findElement(By.java:246)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:311)\r\n\tat com.capgemini.librarymanagementsystemcucumber.stepdefinitions.AdminSteps.student_is_on_returning_book_page(AdminSteps.java:193)\r\n\tat ✽.Given Student is on returning book page(student.feature:18)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "AdminSteps.student_clicks_on_return_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.book_Returned_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.student_logout_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "AdminSteps.close_browser_page()"
});
formatter.result({
  "status": "skipped"
});
});