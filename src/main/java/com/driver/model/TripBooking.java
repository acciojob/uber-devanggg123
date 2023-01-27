package com.driver.model;
import javax.persistence.*;

@Entity

public class TripBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int tripBookingId;

    private String fromLocation;

    private String toLocation;

    private int bill;

    private int distanceInKm;

    @Enumerated(EnumType.STRING)
    private TripStatus tripStatus;

    @ManyToOne
    @JoinColumn
    private Driver driver;


    @ManyToOne
    @JoinColumn
    private Customer customer;

    public TripBooking(String fromLocation, String toLocation, int bill, int distanceInKm, TripStatus tripStatus, Driver driver, Customer customer) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.bill = bill;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
        this.driver = driver;
        this.customer = customer;
    }

    public TripBooking(String fromLocation, String toLocation, int distanceInKm, TripStatus tripStatus) {
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.tripStatus = tripStatus;
    }

    public int getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(int tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public TripStatus getStatus() {
        return tripStatus;
    }

    public void setStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}