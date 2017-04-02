package de.dux.adressservice.entity;

/**
 * Created by doug on 31.03.17.
 */
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

    public long getId() {
        return id;
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

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelefax() {
        return telefax;
    }

    public void setTelefax(String telefax) {
        this.telefax = telefax;
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
