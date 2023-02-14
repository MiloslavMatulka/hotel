package com.engeto.hotel;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Hotel application for booking rooms.
 *
 * @author Miloslav Matulka
 * @version v1.1
 */
public class Hotel {
    /**
     * Entry method of the project.
     *
     * @param args Not used.
     */
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla", "Malíková",
                LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček",
                LocalDate.of(1995, 5, 5));
        System.out.println("Hosté:");
        System.out.println(guest1.getDescription());
        System.out.println(guest2.getDescription());
        System.out.println("---");

        Room room1 = new Room(1, 1, true,
                true, BigDecimal.valueOf(1000));
        Room room2 = new Room(2, 1, true,
                true, BigDecimal.valueOf(1000));
        Room room3 = new Room(3, 3, false,
                true, BigDecimal.valueOf(2400));
        System.out.println("Pokoje:");
        System.out.println(room1.getDescription());
        System.out.println(room2.getDescription());
        System.out.println(room3.getDescription());
        System.out.println("---");

        Booking booking1 = new Booking(room1, guest1,
                LocalDate.of(2021, 7, 19),
                LocalDate.of(2021, 7, 26),
                Booking.Type.PRACOVNÍ);
        Booking booking2 = new Booking(room3, guest1,
                LocalDate.of(2021, 9, 1),
                LocalDate.of(2021, 9, 14),
                Booking.Type.REKREAČNÍ);
        booking2.addOtherGuest(guest2);
        // Automatic check in and check out
        Booking booking3 = new Booking(room2, guest2, Booking.Type.PRACOVNÍ);

        BookingsHistory listOfBookings = new BookingsHistory();
        listOfBookings.addBooking(booking1);
        listOfBookings.addBooking(booking2);
        listOfBookings.addBooking(booking3);
        System.out.println("Všechny rezervace:");
        listOfBookings.printBookings();
    }
}
