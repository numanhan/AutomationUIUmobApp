# Android Automation Test Project with Gauge, Appium, and Java

This repository utilizes Gauge, Appium, and Java technologies to automate tests for Android applications. The project is designed to implement basic automation test scenarios.



## Table of Contents

- Requirements 
- Installation
- Project Structure
- Running Tests
- Contributing
- License

## Requirements


- #### Java SDK:
  Version 11 or above can be downloaded and installed from [Oracle's official website](https://www.oracle.com/java/technologies/downloads/).
- #### Gauge: 
  Use the following command to install:

```bash
npm install -g gauge
```
- ##### Appium: Required for mobile application automation.
- ##### Appium Server GUI: A GUI interface for managing the Appium server. You can download it from the [official GitHub page](https://github.com/appium/appium-desktop).
- ##### Appium Inspector: Tool for identifying mobile app elements and creating test scenarios.


## Project Structure
- specs/: Contains the Gauge test scenarios.
- src/test/java/base: Includes base helpers for test and pages.
- src/test/java/screen: This page includes mobile screens which automated.
- src/test/java/test: This page has all tests based on BaseTest class.
- src/test/resources: This page includes required resources for test.

## Running Tests
1. Start the Appium Server GUI and configure the necessary device settings.
2. Launch your Android device or emulator.
3. Open the terminal or command prompt and navigate to the project directory.
4. Run the tests by executing the following command:
```bash
mvn test
```
## Contributing
- If you have any questions or suggestions regarding the project, please share them in the [Issues](https://github.com/numanhan/AutomationUIUmobApp/issues) section.
- Feel free to contribute by creating a Pull Request.

## Additional
- Please check the articke which published on my medium account about Mobile Test Automation Introduction and don't hesitate to ask questions: [What We Need to Know for Mobile Application Tests](https://numanhanduran.medium.com/what-we-need-to-know-for-mobile-application-tests-84107f27eabb)
