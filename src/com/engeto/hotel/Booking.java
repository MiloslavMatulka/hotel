package com.engeto.hotel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class for booking a room by guests.
 *
 * @author Miloslav Matulka
 * @version v1.0
 */
public class Booking {
    public enum Type {
        PRACOVNÍ, REKREAČNÍ
    }

    //region Attributes
    private LocalDate dateCheckIn;
    private LocalDate dateCheckOut;
    private Guest guest;
    private List<Guest> otherGuests;
    private Room room;
    private Type type;
    //endregion

    //region Constructors
    /**
     * Constructs a booking class.
     *
     * @param room Room to be booked.
     * @param guest Guest of the hotel.
     * @param dateCheckIn Check in date.
     * @param dateCheckOut Check out date.
     * @param type Type of stay.
     */
    public Booking(Room room, Guest guest, LocalDate dateCheckIn,
                   LocalDate dateCheckOut, Type type) {
        this.room = room;
        this.guest = guest;
        otherGuests = new ArrayList<>();
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.type = type;
    }

    /**
     * Constructs a booking class with automatic check in today and
     * check out +6 days.
     *
     * @param room Room to be booked.
     * @param guest Guest of the hotel.
     * @param type Type of stay.
     */
    public Booking(Room room, Guest guest, Type type) {
        this(room, guest, LocalDate.now(), LocalDate.now().plusDays(6), type);
    }
    //endregion

    //region Getters and Setters
    /**
     * Gets check in date of stay.
     */
    public LocalDate getDateCheckIn() {
        return dateCheckIn;
    }

    /**
     * Sets check in date of stay.
     *
     * @param dateCheckIn Check in date.
     */
    public void setDateCheckIn(LocalDate dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }
    /**
     * Gets check out date of stay.
     */
    public LocalDate getDateCheckOut() {
        return dateCheckOut;
    }

    /**
     * Sets check out date of stay.
     *
     * @param dateCheckOut Check out date of stay.
     */
    public void setDateCheckOut(LocalDate dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    /**
     * Gets a guest of the hotel.
     */
    public Guest getGuest() {
        return guest;
    }

    /**
     * Sets a guest of a hotel.
     *
     * @param guest Guest of the hotel.
     */
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    /**
     * Gets a copy of other guests list.
     */
    public List<Guest> getOtherGuests() {
        return new ArrayList<>(otherGuests);
    }

    /**
     * Sets a copy of other guests list.
     *
     * @param otherGuests Other guests list.
     */
    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = new ArrayList<>(otherGuests);
    }

    /**
     * Gets a room.
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Sets a room to be booked.
     *
     * @param room Room to be booked.
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * Gets enum type of stay.
     */
    public Type getType() {
        return type;
    }

    /**
     * Sets enum type of stay.
     *
     * @param type Type of stay.
     */
    public void setType(Type type) {
        this.type = type;
    }
    //endregion

    /**
     * Adds a guest to a list of other guests in a room.
     */
    public void addOtherGuest(Guest guest) {
        otherGuests.add(guest);
    }

    /**
     * Gets the description of a booking.
     *
     * @return Guest(s) name, room ID, check in and check out date.
     */
    public String getDescription() {
        String guestsDescription = getGuest().getFirstName() + " "
                + getGuest().getLastName();
        if (otherGuests.size() != 0) {
            for (Guest guest : otherGuests) {
                // StringBuilder would be better -> concatenation.
                guestsDescription += ", " + guest.getFirstName() + " "
                        + guest.getLastName();
            }
        }
        // Attributes could be used directly instead of methods.
        return guestsDescription + ": pokoj číslo "
                + getRoom().getId() + " od " + getDateCheckIn() + " do "
                + getDateCheckOut();
    }

    /**
     * Removes a guest from a list of other guests in a room.
     */
    public void removeOtherGuest(Guest guest) {
        otherGuests.remove(guest);
    }
}
