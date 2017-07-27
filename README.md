This is my backend repository


DB Connection info

# check status
$ service mysql status

# start server
$ service mysql start

# access mysql CLI
$ mysql -uroot

# in mysql cli, creating a database
$ create database fyp;

# in mysql cli, list databases
$ show databases;


To Test: 

$ cd ~/workspace
$ test/run.sh

To Run: 

$ cd ~/workspace
$ ./gradlew bootRun


or
$ cd ~/workspace/complete
$ mvn spring-boot:run

Access at: https://fyp-backend-bizzzz25191.c9users.io/

Install Steps, make important scripts executable:

# get java 8 jdk for Spring
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk

chmod +x test/run.sh
chmod +x initial/gradlew
chmod +x complete/gradlew

