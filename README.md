# ADS first laboratory

This repo contains solutions to all the ten problems for the assignment

## Getting Started
These instructions will get you a copy of the project.

### Prerequisites
- Java JDK 1.8 or above
- Maven 8 or above
- IntelliJ IDEA

### Installing (Mac/Linux)
A step by step guide that help you to get everything running.

1. **Go to the Idea working directory:**
```sh
cd ~/IdeaProjects
```

2. **Clone the repo**
```sh
git clone https://github.com/McNester/AlgoLabo.git
```

3. **Set up symlink for the script, so that you can run the program from your terminal!**
```sh
sudo ln -s ~/IdeaProjects/AlgoLabo/src/scripts/seraf.sh /usr/local/bin/seraf
```

4. **Check if the symlink created correctly**

```sh
ls -l /usr/local/bin/seraf
#Must show the location of the symlink, in case of success
```

### Running(Mac/Linux)
1. **First way to test out the problems is by using the terminal**

    If you forgot the commands simply type:
    ```sh
    seraf list
    ```
    If you want to test all 10 problems sequentially just run:
    ```sh
    seraf
    ```
    If you want to test each problem individually type:
    ```sh
    seraf firstProb # e.g. secondProb,thirdProb... 
    ```
    Just use ordinal number followed by Prob, and it will run the corresponding problem.
2. **Another way to test out the problems is simply by opening the project in IDE and running Main class**

### Running(Windows)

Use your IDE(I'm sorry)

### Running tests

To test how the algorithms that are solving the problems work:
Go to the test folder and there you can find each test for the
Corresponding problem, run the using your IDE.

