# Fivium Recruitment Development Task

Thank you for your interest in the Java developer position. As part of the recruitment process, we are asking all 
candidates to complete this programming task.

The task should take no more than one hour to complete.

Before you start, you will need to be using a computer with the following tools installed and configured:

* JDK (version 8 or above)
* Git
* IDE or text editor of your choice

## Setup and background

This is a simple Spring Boot application which currently exposes a single REST endpoint.

Before starting the task, make sure you can run the application:

* Clone the Git repository to your local machine
* Start the application: `./gradlew bootRun`
* Go to http://localhost:8080/reverse?input=abc in your web browser

The application has a single REST endpoint which takes a string parameter and responds with the reversed string.
This is implemented in the `StringController` class. 

A simple unit test and a MockMvc test have also been implemented. To run the tests, use `./gradlew test`.

## Task

Your task is to implement a new REST endpoint which can count the unique words in a string. 

The endpoint should take a single string input parameter and return a JSON object of key-value pairs. 
Each key should be a unique word from the input string. The value should be the number of times that word occurs in the
input string. The order of the keys must match the order that the words first occur in the input string.

### Example 1

For the input string:

`banana frog banana`

The output should be:

```json
{
  "banana": 2,
  "frog": 1
}
```
 banana  frog     dog  cricket  person        banana                
### Example 2

For the input string:

`banana frog dog cricket person banana leaf cat drink red red wallet dog cat leave drink banana dog banana cat`

The output should be:

```json
{
  "banana": 4,
  "frog": 1,
  "dog": 3,
  "cricket": 1,
  "person": 1,
  "leaf": 1,
  "cat": 3,
  "drink": 2,
  "red": 2,
  "wallet": 1,
  "leave": 1
}
```

## Assessment criteria

Your task will be assessed on the following criteria:

* Does the code meet all the requirements?
* Is the code concise and easy to understand?
* Is the code written according to best practices (i.e. variable naming, formatting, etc)?
* Does the new code follow the same conventions as the existing code?
* Have appropriate tests been added and are they implemented sensibly?
* Was the code submitted correctly as a Git branch? 

You will be given an opportunity to discuss any design decisions you have taken at the interview stage. Feel free to
add comments to the code explaining any assumptions you have made.

The task can be completed without any additional dependencies, but you may add dependencies to `build.gradle` if you wish.

## Submission

When you are done, push your work to a new branch called `submission` and create a pull request in GitHub. Please add fivium-recruitment as a reviewer.
