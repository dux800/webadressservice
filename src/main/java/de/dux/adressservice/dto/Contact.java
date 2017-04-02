package de.dux.adressservice.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

/**
 * Created by doug on 30.03.17.
 */

@XmlRootElement(name = "Contact")
public class Contact {
    private long id;
    private String name;
    private String surename;
    private String foa;
    private String telephone;
    private String telefax;
    private String mobilephone;
    private String email;
    //private ArrayList<Address> addresses;

    public Contact() {
        //addresses = new ArrayList<Address>();
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getFoa() {
        return foa;
    }

    public void setFoa(String foa) {
        this.foa = foa;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getTelefax() {
        return telefax;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return id;

    }
}
