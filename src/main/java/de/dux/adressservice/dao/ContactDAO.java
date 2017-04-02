package de.dux.adressservice.dao;

import de.dux.adressservice.entity.Contact;

/**
 * Created by doug on 31.03.17.
 */

public interface ContactDAO {

    void create(Contact contact);

    void update(long id, String name, String surename, String foa, String telephone, String telefax, String mobilephone, String email);

    void delete(int id);

    Contact find(int id);

}
