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

### Chapter 5.2 - Mobile Gestures - Scroll Down
In this exercise, we are going to practise how to scroll down
To achieve this we are going to use the IAndroidUtils of carina framework
.The principal method is `swipe()`
This test in MobileTest.java called `scroll_test()` does te following:
1. Open the app
2. Click the view Option
3. Scroll down 
4. Check if the List button is present and compare it with the string "Lists"
5. If everything is ok the test pass otherwise it fails