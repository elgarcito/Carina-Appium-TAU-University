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

### Chapter 4.1 Key Concepts for iOS and Android Apps
[Video link](https://www.youtube.com/watch?v=UwdUsemPnwM)

In this example we should open the apk (That previously should be 
downloaded and set the `capabilities.app=<path to file in computer or server>` in
the [_config.properties](src/main/resources/_config.properties) ) using the 
app.
Test steps:
1. Open the app
2. Click the app button
3. Get a list of all the option names.

There are not Asserts in this example.
In the future, we can compare
what we get with a predefined list. 