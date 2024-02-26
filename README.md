# Carina Appium TAU university
This repository uses the basic structure of [Carina Framework](https://zebrunner.github.io/carina/) to test
all the exercises of the TAU university course:

[Mobile Testing with Appium and Java: From Setup to Execution](https://testautomationu.applitools.com/appium-java-tutorial-1/chapter4.1.html)


### Getting started
To run this project, you will need at least version 21 of Java.
First, clone this repository in a folder of your PC.
You have to put the following command in a terminal:

```bash
  git clone this-repo-url
```
Once copied, you must run the following command in the console:
```bash
  mvn clean install -D skipTests
```

### How to read it
In the main branch, we are going to save the same activities
done in the theoretical classes.
Each branch is going to have
the name of the class finished (available from chapter 4.1).
Due to the lack of IOS all the practice will be done in Android.
Finally, in the main branch you will find all exercises together

### Chapter 6.1 - Web Testing with Chrome on Android
In this exercise, we are going to practise how to use the web driver in the mobile device
To achieve this we are going to use the IAndroidUtils of carina framework

This test in MobileTest.java called `userLogin_theInternet()` does te following:
1. Open browser
2. Go to https://the-internet.herokuapp.com/login 
3. Fill the form
4. click login
5. It is important to use this to be able to use the method `isPageOpened()`
This is used in Carina Demo
``` 
    public SuccessLoginPage(WebDriver driver) {
        super(driver);
        setPageOpeningStrategy(PageOpeningStrategy.BY_ELEMENT);
        setUiLoadedMarker(successMessage);
    }
```
There is something wrong that doesn't work the following configuration (is not used in Carina Demo)
```
        setPageOpeningStrategy(PageOpeningStrategy.BY_URL);
        setPageAbsoluteURL("https://the-internet.herokuapp.com/login/secure");
```
6. Check if the message appeared in the new page.
