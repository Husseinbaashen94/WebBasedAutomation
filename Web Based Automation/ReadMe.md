#Automation Practice

#####READ THIS BEFORE RUNNING YOUR PROJECT

#####How to setup before running project:

1. Install HomeBrew

```bash
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
2. Install JDK [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

```bash
check JDK already installed :
$javac -version
```

3. Write on your .bash_profile

```bash
open your bash profile using nano or vim :
$nano .bash_profile
```

```bash
Copy to your bash profile :

export JAVA_HOME=$(/usr/libexec/java_home)
```

4. Install chromedriver
```bash
$brew install chromedriver
```
```bash
You can use Firefox and Safari.
if you want to use Safari, make sure use latest Safari or at least Safari 10.0
And enable "Allow Remote Automation" on develop bar
```
5. Create `.feature` under package `src/test/resources/features`
```java
+-- src
    +-- test
        +-- resources
            +-- features
                +-- yourfeature.feature //this is your feature files
```
6. Write your scenario on `yourfeature.feature` , check my example on `automationpractice.feature`

7. Create your steps definition under package `steps` using java class
```java
+--- src
     +--- test
          +--- java
               +-- steps
                   +--- yoursteps.java //this is your steps definition
```
8. Write your steps definition on `yoursteps.java` , check my example on `AutomationStep.java`
9. After all done then you can run project
```bash
if you only want to run scenario to check it work or not :
1. Go to your scenario
2. Run your Project
```
```bash
if you want to run all your scenario and generate Report :
1. Open your Terminal
2. Go to your directory
3. Type "mvn clean test" or "mvn test"

You can find your report on report directory and the filename is AutomationPracticeReport.html
```
```bash
Even Build Success or Build Failed it will generate report and show you where is the error happen
