**SENG 438 - Software Testing, Reliability, and Quality**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group \#:      |     |
| -------------- | --- |
| Student Names: | Krishna Shah |
|                | Nour Ajami |
|                | Mohamed Amara |
|                | Zuhaer Rahman |

# 1 Introduction

The purpose of this lab is to familiarize and introduce us to the principles of white-box testing and using code coverage tools (EclEmma) to determine the effectiveness of our unit tests. We will be building upon the unit tests for the Range and DataUtilities classes (created in assignment 2) and adding tests for any methods that were not covered previously.

# 2 Manual data-flow coverage calculations for X and Y methods

## Range.contains 
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/ef4ced1f-7176-4669-a3a0-c67a834ea25c)

Def-path set:

du(1,value) = {[1],[1,3],[1,3,5]}

Def-pair set:

du(1,3,value) = {[1,3]}

du(1,5,value) = {[1,3,5]}

![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/717b04f0-b187-4808-8a2b-caa683f9dfa7)

![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/05a987e2-9288-40e8-94da-a1fca89a184d)

DU-Pair coverage:

CU = 4

PU = 7

## DataUtilities.calculateColumnTotal
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/7e1fb27e-725e-48fd-acf4-a5e127e8d872)

Def-Path Set:

du(1, data) = {[1], [1,2,3], [1,2,3,4,5], [1,2,3,4,5,6,7,8,4,5]}

du(1, column) = {[1,2,3,4,5], [1,2,3,4,5,6,7,8,4,5]}

du(2,total) = {[2,3,4,9], [2,3,4,5,6,7,8,4,9], [2,3,4,5,6,8,4,9]}

du(3, rowCount) = {[3,4] [3,4,5,6,7,8,4], [3,4,5,6,8,4]}

du(4, r = {[4], [4,5,6,7,8,4], [4,5,6,8,4]}

du(5, n) = {[5,6], [5,6,7]}

Def-pair Set:

du(1, 1, data) = {[1]}

du(1, 3, data) = {[1,2,3]}

du(1, 5, data) = {[1,2,3,4,5], [1,2,3,4,5,6,7,8,4,5]}

du(1, 5, column) = {[1,2,3,4,5], [1,2,3,4,5,6,7,8,4,5],}

du(2, 7, total) = {[2,3,4,5,6,7]}

du(2, 9, total) = {[2,3,4,9], [2,3,4,5,6,7,8,4,9], [2,3,4,5,6,8,4,9]}

du(3, 4, rowCount) = {[3,4], [3,4,5,6,7,8,4], [3,4,5,6,8,4]}

du(4, 4, r) = {[4], [4,5,6,7,8,4], [4,5,6,8,4]}

du(4, 5, r) = {[4, 5]}

du(4, 8, r) = {[4,5,6,7,8], [4,5,6,8]}

du(5, 6, n) = {[5,6]}

du(5, 7, n) = {[5,6,7]}

![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/7045db98-de75-47f9-9ce1-98e3952aa00e)

![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/391494e2-9154-4f84-b7eb-f204e60ae6cd)

DU-Pair coverage:

CU = 8

PU = 8

# 3 A detailed description of the testing strategy for the new unit test

Prior to writing any tests, we worked together as a group to decide on the strategy we would use to achieve the best code coverage possible. We decided that we would first review the code coverage obtained from our initial tests to determine which methods would need a lot of tests and what was previously missed. Then, we came up with a rough plan to achieve line, branch, and method coverage for each of these methods. Finally, we split up the work evenly and created test cases for both the Range and DataUtilities classes.

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

DataUtilities - calculateColumnTotal:

- In our initial implementation of unit tests for the calculateColumnTotal method, we only accounted for the version of the method with two parameters. After reviewing our code coverage, we realized that we hadn't tested the version of the method with three parameters. We applied our knowledge of equivalence classes and boundary value testing to create test cases that would cover inputs at or on the boundary of previous equivalence classes.

DataUtilities - Equal and Clone :

- The Equal and Clone methods in the DataUtilities class had not been tested in our initial iteration of tests. To create meaningful tests, we first analyzed the methods to determine how to achieve both line and branch coverage. We then created test cases that followed different paths in the method, thereby covering all if statements and for loops. Additionally, we created tests that would achieve maximum line coverage.

Range - Equals and Scale

- The Equals and Scale method in the Range class were methods that not been previously tested in our initial iteration of tests. We started by determine the equivalence classes for this method and then created tests for inputs at each equivalence class and at the boundaries of these equivalence classes. After these intital tests we looked at the code coverage and created test cases for any line/branch statements missed.


# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

## Line/Statement Coverage

DataUtilities: 88.5%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/8aab4204-dc1b-4f83-afb3-31713b042a37)
Range: 89.9%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/a96ecfb7-3006-4e04-ae60-634cafb23581)

## Branch/Decision Coverage

DataUtilities: 70.3%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/bc8998ac-9193-43ee-bb7d-4461e92f4623)
Range: 84.1%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/9f730335-9e35-4746-ac60-2d59f964d07a)

## Method/Condition Coverage

DataUtilities: 100%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/e3bbe60e-40a2-4a75-a04d-a368199a5eab)
Range: 100%
![image](https://github.com/seng438-winter-2024/seng438-a3-mhabibamara/assets/103873879/7e67c7ba-fe14-4f4e-bff2-517d4fdd1290)

# 6 Pros and Cons of coverage tools used and Metrics you report

The testing tool that we decided to use was EclEmma.

Pros: 
- Easy to install/update
- Easy to use and understand
- Code coverage had plenty of useful information

Cons:
- Was a very tedious process to run the code coverage tool after every change and navigate to the DataUtilities/Range Class

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.


Some advantages of a requirements-based testing approach were that it was easy to determine the expected output of major functionality and write test cases to ensure that this was fulfilled. Some disadvantages of the requirements-based approach were that it was harder to test for edge cases, and identifying obscure inputs was challenging. The advantages of coverage-based testing allowed us to take a more systematic approach and create more specific unit tests that were previously missing. Some disadvantages of coverage-based testing were that it occasionally led us to create redundant test cases.

# 8 A discussion on how the team work/effort was divided and managed

We decided to work on the test planning, manual data-flow coverage and final report as a team, and decided to split up the methods that needed improvement/hadn't been tested evenly amongst all the group members.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Some difficulties that we encountered during the lab were regarding project setup and missing libraries for the DataUtilities class. Some challenges that we experienced during this lab included creating test cases that would handle edge cases in the methods and trying to achieve maximum code coverage for those specific methods. Some lessons learned after completing the lab were to properly read documentation when using a new tool and to take extra time to fully understand the methods being tested.

# 10 Comments/feedback on the lab itself

We believe that this lab was a good introduction to white-box testing coverage tools and how to improve unit tests using a coverage-based testing technique. It was interesting to learn about coverage tools and how to use them, as well as to see the information regarding code coverage. We also believe it would have been beneficial to learn how to set up this environment in other IDEs such as IntelliJ or VS Code. Overall, it was a great way to improve our knowledge of unit testing and code coverage techniques/tools.

