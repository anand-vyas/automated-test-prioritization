# Test prioritization using Total and Additional strategies

This is a project taken from https://github.com/JodaOrg/joda-time for testing our test prioritization tool. 

Please Note:
The prioritized list of test classes used to create the test suites in this project have been derived from output files created in this project by me: https://github.com/anand-vyas/creating-prioritized-testclass-list

## To test this project please follow these steps:

1. Download the project to your local directory. 
2. Open your terminal window and using the "cd" command change your directory to this folder. 
3. To execute the test classes in this project using a certain prioritization strategy please see the commands listed below
  - mvn test -f pom.xml (Total Strategy of test prioritization)
  - mvn test -f pom-additional.xml (Additional Strategy of test prioritization)
  - mvn test -f pom-original.xml (No strategy - original order of execution)
4. You could introduce a bug in the project and re-run the commands given above. If there is/are test case failure(s), the console window will show the test case failures and the time taken to detect each failure from the time when the first test began executing. 
5. The time taken to detect the first test failure shows how much time it takes each strategy to detect a bug. 




The following files have been added by me to this project that makes the above execution possible:

- prioritization.java: Contains a test suite which contains the test classes in order of prioritization determined by the Total Strategy. "pom.xml" triggers execution of test classes as per this order. Location of this file: src/test/java/org/joda/time

- prioritizationAdditional.java: Contains a test suite which contains the test classes in order of prioritization determined by the Additonal Strategy. "pom-additional.xml" triggers execution of test classes as per this order. Location of this file: src/test/java/org/joda/time 

- JUnitExecutionListener.java: Customized JUnit Listener. It contains the code which tracks the time taken to detect each failure from the beginning to test execution. 

- pom.xml: Used for executing the test classes in prioritization order of Total Strategy and including the JUnit listener. 

- pom-additional.xml: Used for executing the test classes in prioritization order of Additional Strategy and including the JUnit listener.

- pom-original.xml: Used for executing the test classes in original order and including the JUnit listener. 

