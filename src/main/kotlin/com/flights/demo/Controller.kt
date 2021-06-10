package com.flights.demo

import org.springframework.web.bind.annotation.*

@RestController
class Controller (val repo: FlightRepositories) {

    /* add a new flight */
    @PostMapping( "/flight")
    fun addFlights(@RequestBody flight: Flight) {
        repo.save(flight)
    }

    /* return all flights */
    @GetMapping("/flight")
    fun getAllFlights(): List<Flight> = repo.findAll().toList()

    /* return all flights by airline code */
    @GetMapping("/flight/{airlineCode}")
    fun getFlightsByAirlineCode(@PathVariable("airlineCode") airlineCode : String): List<Flight> = repo.findFlightsByAirlineCode(airlineCode).toList()

}