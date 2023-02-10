package com.engeto.hotel;

import java.math.BigDecimal;

/**
 * Class for description of a room.
 *
 * @author Miloslav Matulka
 * @version v1.0
 */
public class Room {
    //region Attributes
    private boolean hasBalcony;
    private boolean hasSeeView;
    private int id;
    private int numberOfBeds;
    // In this use case, int could be used for price per night.
    private BigDecimal pricePerNight;
    //endregion

    //region Constructors
    /**
     * Constructs a Room class.
     *
     * @param id Room ID.
     * @param numberOfBeds Number of beds in a room.
     * @param hasBalcony Info if a room has a balcony.
     * @param hasSeeView Info if a room has see view.
     * @param pricePerNight Price of a room per night.
     */
    public Room(int id, int numberOfBeds, boolean hasBalcony,
                boolean hasSeeView, BigDecimal pricePerNight) {
        this.id = id;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.hasSeeView = hasSeeView;
        this.pricePerNight = pricePerNight;
    }
    //endregion

    //region Getters and Setters
    /**
     * Gets if a room has a balcony.
     */
    public boolean hasBalcony() {
        return hasBalcony;
    }

    /**
     * Sets if a room has a balcony.
     *
     * @param hasBalcony Info if a room has a balkony.
     */
    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    /**
     * Gets if a room has see view.
     */
    public boolean hasSeeView() {
        return hasSeeView;
    }

    /**
     * Sets if a room has see view.
     *
     * @param hasSeeView Info if a room has see view.
     */
    public void setHasSeeView(boolean hasSeeView) {
        this.hasSeeView = hasSeeView;
    }

    /**
     * Gets room ID.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets room ID.
     *
     * @param id Room ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets number of beds in a room.
     */
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    /**
     * Sets number of beds in a room.
     *
     * @param numberOfBeds Number of beds in a room.
     */
    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    /**
     * Gets price of a room per night.
     */
    public BigDecimal getPricePerNight() {
        return pricePerNight;
    }

    /**
     * Sets price of a room per night.
     *
     * @param pricePerNight Price of a room per night.
     */
    public void setPricePerNight(BigDecimal pricePerNight) {
        this.pricePerNight = pricePerNight;
    }
    //endregion

    /**
     * Gets the description of a room.
     *
     * @return Name and date of birth.
     */
    public String getDescription() {
        String hasBalconyString;
        if (hasBalcony()) {
            hasBalconyString = "ano";
        } else {
            hasBalconyString = "ne";
        }

        String hasSeeViewString;
        if (hasSeeView()) {
            hasSeeViewString = "ano";
        } else {
            hasSeeViewString = "ne";
        }

        // Attributes could be used directly instead of methods.
        return "Pokoj číslo " + getId() + ": počet lůžek "
                + getNumberOfBeds() + ", cena " + getPricePerNight()
                + " Kč/noc, balkon " + hasBalconyString + ", výhled na moře "
                + hasSeeViewString;
    }
}
