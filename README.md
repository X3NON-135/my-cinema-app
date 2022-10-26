<h1 align="center">
  <br>
  <a href="https://github.com/X3NON-135/my-cinema-app"> 
    <img src="https://media1.giphy.com/media/hTOvfENbKS9B576w60/giphy.gif?cid=ecf05e47al2jmp2m3c2xh3xzy62mr651vov4k5g2cceoklfm&rid=giphy.gif&ct=g" alt="Cinema app" width="150">
  </a>
  <br>
  <i> Cinema app </i>
  <br>
</h1>

<h4 align="center">Compact and simple management system to buy tickets, making an order and various things to make your experience easier.</h4>

<p align="center">
  <a href="#key-features">Key Features</a> •
  <a href="#app-structure">App structure</a> •
  <a href="#technologies">Technologies</a> •
  <a href="#how-to-use">How to use</a> •
</p>

## Key Features
* Authentication and registration
* Managing users, cinema-halls and movies as an Admin
* Make order to specific movie session
* Find available movie sessions
* Put your order in shopping cart

## App Structure
### _N-tier architecture which allows working with layers separately_
* Layer of controllers - allows the user to work with this application.
* Layer of DAOs - execute communication and retrieving info from database.
* Layer of services - responsible for processing the data received from the DAO level.

## Technologies
1. Java 11
2. Frameworks: Spring Web/Security, JPA ORM (Hibernate)
3. Tools: Apache Maven, Apache Tomcat (v. 9.0.66), IntelliJ IDEA, Postman
4. Database: MySQL 8

## How to use
1. Fork this repo
2. Copy link of project
3. Create new project via `File -> Project from Version Control...`
4. Edit resources (db.properties) - set the necessary parameters for connecting to your DB

```
db.driver=YOUR_DRIVER
db.url=YOUR_URL
db.user=USERNAME
db.password=PASSWORD
```
if some problems with time zone add this `?serverTimezone=UTC` at the end to your URL

5. Install [Tomcat](https://tomcat.apache.org/download-90.cgi)
6. Add Tomcat server to configuration
7. Run application