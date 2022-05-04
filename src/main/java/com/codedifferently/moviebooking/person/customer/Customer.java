package com.codedifferently.moviebooking.person.customer;

import com.codedifferently.moviebooking.cinema.Booking;
import com.codedifferently.moviebooking.person.Person;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer extends Person {
    private List <Booking> bookings;

    public Customer(String firstName, String lastName, Date dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.bookings = new ArrayList<>();
    }


    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }
}
