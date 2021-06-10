package com.flights.demo

import org.springframework.data.repository.CrudRepository

interface FlightRepositories : CrudRepository<Flight,String>{

    fun findFlightsByAirlineCode(airlineCode: String) : List<Flight>

}