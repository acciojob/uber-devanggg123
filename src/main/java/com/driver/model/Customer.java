package com.driver.model;
import javax.persistence.*;
import java.util.List;

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerid;

    private String mobile;

    private String password;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private List<TripBooking> tripBookingList;
}