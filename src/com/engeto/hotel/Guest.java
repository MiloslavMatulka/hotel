package com.engeto.hotel;

import java.time.LocalDate;

/**
 * Class for collecting info about a guest.
 *
 * @author Miloslav Matulka
 * @version v1.0
 */
public class Guest {
    //region Attributes
    private LocalDate birthDate;
    private String firstName;
    private String lastName;
    //endregion

    //region Constructors
    /**
     * Constructs Guest class
     *
     * @param firstName First name of a guest.
     * @param lastName Last name of a guest.
     * @param birthDate Date of birth of a guest.
     */
    public Guest(String firstName, String lastName, LocalDate birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }
    //endregion

    //region Getters and Setters
    /**
     * Gets date of birth.
     */
    public LocalDate getBirthDate() {
        return birthDate;
    }

    /**
     * Sets date of birth.
     *
     * @param birthDate Date of birth.
     */
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * Gets the first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name.
     *
     * @param firstName First name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name.
     *
     * @param lastName Last name.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //endregion

    /**
     * Gets the description of a guest.
     *
     * @return Name and date of birth.
     */
    public String getDescription() {
        // Attributes could be used directly instead of methods
        return getFirstName() + " " + getLastName()
                + " (narozen/a " + getBirthDate().getDayOfMonth() + "."
                + getBirthDate().getMonthValue() + "."
                + getBirthDate().getYear() + ")";
    }
}
