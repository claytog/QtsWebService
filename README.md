# Qts Software Engineering Tech Task

This repository is a web service that will return flights matching the specified criteria.<br/>
The web service will return:
1) All flights
2) All flights by airline code
3) Provide the interface to create new flights


### Prerequisites

Software required to run this project is:
1) IntelliJ IDEA
2) Postman

## Getting Started

If downloading the zip from this repository, firstly unzip the file named "QtsWebService-main.zip".<br/>
Using IntelliJ IDEA, locate and open the directory named "QtsWebService-main".<br/>

### Installing

#### To compile and run the project:
1) From the left project structure, expand "src->main->kotlin->com.flights.demo"
2) Select "FlightsApplication.kt"
3) From the menu select "Run->Run"
4) Select "FlightsApplication.kt"

#### To post new flight data:
1) Open Postman
2) Import the following cURL statement:

curl --location --request POST 'http://localhost:8080/flight' \
--header 'Content-Type: application/json' \
--data-raw '<br/>{
    "flightNumber":"QF401",
    "airlineCode":"QF",
    "departurePort":"MEL",
    "arrivalPort":"SYD",
    "departureTime":"2020-06-12T09:30:23Z",
    "arrivalTime":"2020-06-12T10:25:23Z"
}<br/>'

The following data can be replaced and reposted within the previous cURL statement to provide more data.<br/><br/>
{
    "flightNumber":"EK555",
    "airlineCode":"EK",
    "departurePort":"BKB",
    "arrivalPort":"SYD",
    "departureTime":"2020-06-12T09:30:23Z",
    "arrivalTime":"2020-06-13T14:25:23Z"
}
<br/><br/>
{
    "flightNumber":"QF400",
    "airlineCode":"QF",
    "departurePort":"ADL",
    "arrivalPort":"SYD",
    "departureTime":"2020-06-12T09:30:23Z",
    "arrivalTime":"2020-06-12T11:30:23Z"
}
<br/><br/>
{
    "flightNumber":"QF401",
    "airlineCode":"QF",
    "departurePort":"MEL",
    "arrivalPort":"SYD",
    "departureTime":"2020-06-12T09:30:23Z",
    "arrivalTime":"2020-06-12T10:25:23Z"
}
<br/><br/>
{
    "flightNumber":"AA111",
    "airlineCode":"CX",
    "departurePort":"ZWA",
    "arrivalPort":"SYD",
    "departureTime":"2020-06-13T11:30:23Z",
    "arrivalTime":"2020-06-14T14:45:23Z"
}
<br/><br/>
{
    "flightNumber":"AA222",
    "airlineCode":"CX",
    "departurePort":"ZWS",
    "arrivalPort":"MEL",
    "departureTime":"2020-06-15T13:30:23Z",
    "arrivalTime":"2020-06-16T14:25:23Z"
}

3) Within the Postmane client, press "Send"

#### To view the imported data:
1) Import the following cURL statement:

curl --location --request GET 'http://localhost:8080/flight' \

#### To retrieve a list of flights by airline code, import the following cURL statement:

curl --location --request GET 'http://localhost:8080/flight/QF' \
--header 'Content-Type: application/json' \
