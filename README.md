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

### Chapter 4.4—Write First Test for Built-in Android App
In this exercise, the test opens the calculator and then makes a sum.
We have a problem because we can't open it from the start.
So 
to work, we should have the calculator previously open in the emulator.
The test does the following:
The calculator apk used is located in [apps](src/main/resources/apps)
1. Click button 1
2. Click button 0
3. Click button 0
4. Click button sum
5. Click button 2
6. Click button 3
7. Click button 4
8. Click button equal
9. Compare the result with the expected result 234