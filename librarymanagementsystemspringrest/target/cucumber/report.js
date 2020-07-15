$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("admin.feature");
formatter.feature({
  "line": 1,
  "name": "Admin Book Services",
  "description": "",
  "id": "admin-book-services",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Admin is able to add the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Admin is adding book",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Admin enters  \u003cbookName\u003e,\u003cauthor\u003e,\u003ccategory\u003e,\u003cpublisher\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book should be added",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book;",
  "rows": [
    {
      "cells": [
        "bookName",
        "author",
        "category",
        "publisher"
      ],
      "line": 14,
      "id": "admin-book-services;admin-is-able-to-add-the-book;;1"
    },
    {
      "cells": [
        "\"English\"",
        "\"Sharma\"",
        "\"Language\"",
        "\"karan\""
      ],
      "line": 15,
      "id": "admin-book-services;admin-is-able-to-add-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"shailu@gmail.com\", \"Shailaja@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 143237000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shailu@gmail.com",
      "offset": 13
    },
    {
      "val": "Shailaja@1",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 3380446300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 4367400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Admin is able to add the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-add-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Admin is adding book",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Admin enters  \"English\",\"Sharma\",\"Language\",\"karan\"",
  "matchedColumns": [
    0,
    1,
    2,
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book should be added",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_adding_book()"
});
formatter.result({
  "duration": 36700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "English",
      "offset": 15
    },
    {
      "val": "Sharma",
      "offset": 25
    },
    {
      "val": "Language",
      "offset": 34
    },
    {
      "val": "karan",
      "offset": 45
    }
  ],
  "location": "AdminSteps.admin_enters(String,String,String,String)"
});
formatter.result({
  "duration": 380538100,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_should_be_added()"
});
formatter.result({
  "duration": 602200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Admin is able to update the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Admin is updating book",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Admin enters updated values \u003cbId\u003e, \u003cbookName\u003e,\u003cauthor\u003e,\u003ccategory\u003e,\u003cpublisher\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book will be updated",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "2",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book;2",
  "rows": [
    {
      "cells": [
        "bId",
        "bookName",
        "author",
        "category",
        "publisher"
      ],
      "line": 23,
      "id": "admin-book-services;admin-is-able-to-update-the-book;2;1"
    },
    {
      "cells": [
        "1002",
        "\"Java8\"",
        "\"James\"",
        "\"programming\"",
        "\"sharma\""
      ],
      "line": 24,
      "id": "admin-book-services;admin-is-able-to-update-the-book;2;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"shailu@gmail.com\", \"Shailaja@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 42800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shailu@gmail.com",
      "offset": 13
    },
    {
      "val": "Shailaja@1",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 179098800,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 19800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Admin is able to update the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-update-the-book;2;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Admin is updating book",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Admin enters updated values 1002, \"Java8\",\"James\",\"programming\",\"sharma\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book will be updated",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_updating_book()"
});
formatter.result({
  "duration": 24800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1002",
      "offset": 28
    },
    {
      "val": "Java8",
      "offset": 35
    },
    {
      "val": "James",
      "offset": 43
    },
    {
      "val": "programming",
      "offset": 51
    },
    {
      "val": "sharma",
      "offset": 65
    }
  ],
  "location": "AdminSteps.admin_enters_updated_values(int,String,String,String,String)"
});
formatter.result({
  "duration": 297491900,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_will_be_updated()"
});
formatter.result({
  "duration": 7146400,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepdefinitions.AdminSteps.book_will_be_updated(AdminSteps.java:79)\r\n\tat ✽.Then Book will be updated(admin.feature:20)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 26,
  "name": "Admin is able to remove the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "Admin is deleting book",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "BookId is given \u003cbId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Book is deleted",
  "keyword": "Then "
});
formatter.examples({
  "line": 31,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book;",
  "rows": [
    {
      "cells": [
        "bId"
      ],
      "line": 32,
      "id": "admin-book-services;admin-is-able-to-remove-the-book;;1"
    },
    {
      "cells": [
        "1002"
      ],
      "line": 33,
      "id": "admin-book-services;admin-is-able-to-remove-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"shailu@gmail.com\", \"Shailaja@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 65800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shailu@gmail.com",
      "offset": 13
    },
    {
      "val": "Shailaja@1",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 295804300,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 45800,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "Admin is able to remove the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-remove-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 27,
  "name": "Admin is deleting book",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "BookId is given 1002",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Book is deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_deleting_book()"
});
formatter.result({
  "duration": 39200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1002",
      "offset": 16
    }
  ],
  "location": "AdminSteps.bookid_is_given(int)"
});
formatter.result({
  "duration": 303524000,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_is_deleted()"
});
formatter.result({
  "duration": 543300,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepdefinitions.AdminSteps.book_is_deleted(AdminSteps.java:95)\r\n\tat ✽.Then Book is deleted(admin.feature:29)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 35,
  "name": "Admin is able to issue the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "Admin is in issue page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Bid and Uid are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Book is issued successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 40,
  "name": "",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 41,
      "id": "admin-book-services;admin-is-able-to-issue-the-book;;1"
    },
    {
      "cells": [
        "1002",
        "100602"
      ],
      "line": 42,
      "id": "admin-book-services;admin-is-able-to-issue-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Admin is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Admin gives \"shailu@gmail.com\", \"Shailaja@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Admin is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_on_login_page()"
});
formatter.result({
  "duration": 31200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shailu@gmail.com",
      "offset": 13
    },
    {
      "val": "Shailaja@1",
      "offset": 33
    }
  ],
  "location": "AdminSteps.admin_gives(String,String)"
});
formatter.result({
  "duration": 132647200,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.admin_is_logged_in()"
});
formatter.result({
  "duration": 27600,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Admin is able to issue the book",
  "description": "",
  "id": "admin-book-services;admin-is-able-to-issue-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 36,
  "name": "Admin is in issue page",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "Bid and Uid are given 1002, 100602",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "Book is issued successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "AdminSteps.admin_is_in_issue_page()"
});
formatter.result({
  "duration": 51200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1002",
      "offset": 22
    },
    {
      "val": "100602",
      "offset": 28
    }
  ],
  "location": "AdminSteps.bid_and_Uid_are_given(int,int)"
});
formatter.result({
  "duration": 164462500,
  "status": "passed"
});
formatter.match({
  "location": "AdminSteps.book_is_issued_successfully()"
});
formatter.result({
  "duration": 250600,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepdefinitions.AdminSteps.book_is_issued_successfully(AdminSteps.java:110)\r\n\tat ✽.Then Book is issued successfully(admin.feature:38)\r\n",
  "status": "failed"
});
formatter.uri("student.feature");
formatter.feature({
  "line": 1,
  "name": "Student Book Services",
  "description": "",
  "id": "student-book-services",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User is able to request the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Student is on request page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "BookId and UserId are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book is Requested successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 14,
      "id": "student-book-services;user-is-able-to-request-the-book;;1"
    },
    {
      "cells": [
        "1102",
        "100603"
      ],
      "line": 15,
      "id": "student-book-services;user-is-able-to-request-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Student is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Student gives \"pranu@gmail.com\", \"Pranath@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Student is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_login_page()"
});
formatter.result({
  "duration": 967000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pranu@gmail.com",
      "offset": 15
    },
    {
      "val": "Pranath@1",
      "offset": 34
    }
  ],
  "location": "StudentSteps.student_gives(String,String)"
});
formatter.result({
  "duration": 265959000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_is_logged_in()"
});
formatter.result({
  "duration": 155600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User is able to request the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-request-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "Student is on request page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "BookId and UserId are given 1102, 100603",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Book is Requested successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_request_page()"
});
formatter.result({
  "duration": 132700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1102",
      "offset": 28
    },
    {
      "val": "100603",
      "offset": 34
    }
  ],
  "location": "StudentSteps.bookid_and_UserId_are_given(int,int)"
});
formatter.result({
  "duration": 292150500,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_is_Requested_successfully()"
});
formatter.result({
  "duration": 697100,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepdefinitions.StudentSteps.book_is_Requested_successfully(StudentSteps.java:54)\r\n\tat ✽.Then Book is Requested successfully(student.feature:11)\r\n",
  "status": "failed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "User is able to return the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Student is on return page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "bookId and userId are given \u003cbId\u003e, \u003cuId\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book is returned successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book;",
  "rows": [
    {
      "cells": [
        "bId",
        "uId"
      ],
      "line": 23,
      "id": "student-book-services;user-is-able-to-return-the-book;;1"
    },
    {
      "cells": [
        "1102",
        "100603"
      ],
      "line": 24,
      "id": "student-book-services;user-is-able-to-return-the-book;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "Student is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Student gives \"pranu@gmail.com\", \"Pranath@1\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Student is logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_login_page()"
});
formatter.result({
  "duration": 262000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pranu@gmail.com",
      "offset": 15
    },
    {
      "val": "Pranath@1",
      "offset": 34
    }
  ],
  "location": "StudentSteps.student_gives(String,String)"
});
formatter.result({
  "duration": 318644000,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.student_is_logged_in()"
});
formatter.result({
  "duration": 71400,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User is able to return the book",
  "description": "",
  "id": "student-book-services;user-is-able-to-return-the-book;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 18,
  "name": "Student is on return page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "bookId and userId are given 1102, 100603",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Book is returned successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StudentSteps.student_is_on_return_page()"
});
formatter.result({
  "duration": 143600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1102",
      "offset": 28
    },
    {
      "val": "100603",
      "offset": 34
    }
  ],
  "location": "StudentSteps.bookid_and_userId_are_given(int,int)"
});
formatter.result({
  "duration": 401272300,
  "status": "passed"
});
formatter.match({
  "location": "StudentSteps.book_is_returned_successfully()"
});
formatter.result({
  "duration": 360200,
  "error_message": "org.opentest4j.AssertionFailedError: expected: \u003ctrue\u003e but was: \u003cfalse\u003e\r\n\tat org.junit.jupiter.api.AssertionUtils.fail(AssertionUtils.java:55)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:40)\r\n\tat org.junit.jupiter.api.AssertTrue.assertTrue(AssertTrue.java:35)\r\n\tat org.junit.jupiter.api.Assertions.assertTrue(Assertions.java:162)\r\n\tat com.capgemini.librarymanagementsystemspringrest.stepdefinitions.StudentSteps.book_is_returned_successfully(StudentSteps.java:69)\r\n\tat ✽.Then Book is returned successfully(student.feature:20)\r\n",
  "status": "failed"
});
});