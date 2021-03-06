# Spring Boot Echo Demo

## Background

This application is a part of a series, which is aiming at writting a basic web application in different programming languages and frameworks. You send a HTTP POST request with a string body to the application, it will return you back the same body. 

## Tech Stack
### Basic
- Language: Java 11
- Framework: Spring Boot 2.5.9
- Dependency Management: Maven

### Advanced: Development tools
- Docker

## Application Functions
- Host a web server
- Expose RESTful APIs 
  - GET ("/health")
  - POST ("/service")
- Handle HTTP requests 
  - Distribute request to different services based on RESTful API
  - Fetch request body
- Handle HTTP responses 
  - Custom response body in string
  - Return 200
