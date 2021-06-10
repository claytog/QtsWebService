package com.flights.demo
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Flight(
    @Id var flightNumber: String,
    var airlineCode: String,
    var departurePort: String,
    var arrivalPort: String,
    var departureTime: String,
    var arrivalTime: String
)