package com.engeto.hotel;

import java.util.ArrayList;
import java.util.List;

/**
 * Repository for bookings.
 *
 * @author Miloslav Matulka
 * @version v1.1
 */
public class BookingsHistory {
    private final List<Booking> listOfBookings = new ArrayList<>();

    /**
     * Adds a booking into repository.
     */
    public void addBooking(Booking booking) {
        listOfBookings.add(booking);
    }

    /**
     * Prints the whole history of bookings.
     */
    public void printBookings() {
        for (Booking booking : listOfBookings) {
            System.out.println(booking.getDescription());
        }
    }
}
