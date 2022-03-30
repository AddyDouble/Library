package com.library.models;


import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Librarian {
    final private IntegerProperty Id;
    final private StringProperty name, password, email, address, city, contact_no;

    public Librarian(Integer id, String name, String password, String email, String address, String city, String contact_no){
        this.Id = new SimpleIntegerProperty(id);
        this.name =  new SimpleStringProperty(name);
        this.password = new SimpleStringProperty(password);
        this.email = new SimpleStringProperty(email);
        this.address = new SimpleStringProperty(address);
        this.city = new SimpleStringProperty(city);
        this.contact_no = new SimpleStringProperty(contact_no);
    }

    public Integer getId() {
        return Id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getEmail() {
        return email.get();
    }

    public String getAddress() {
        return address.get();
    }

    public String getCity() {
        return city.get();
    }

    public String getContact_no() {
        return contact_no.get();
    }

}
