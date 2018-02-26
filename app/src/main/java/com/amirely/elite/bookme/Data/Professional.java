package com.amirely.elite.bookme.Data;

import java.util.Date;

/**
 * Created by elite on 2/26/18.
 */

public class Professional extends Person {
    public Professional(String firstName, String lastName, Address address, Date dob, String email, String phoneNumber, String ID_) {
        super(firstName, lastName, address, dob, email, phoneNumber, ID_);
    }

    public Professional(String firstName, String lastName, Address address, String email) {
        super(firstName, lastName, address, email);
    }

    public Professional(String firstName, String lastName, String email) {
        super(firstName, lastName, email);
    }
}
