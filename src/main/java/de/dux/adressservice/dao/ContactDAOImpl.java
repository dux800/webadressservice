package de.dux.adressservice.dao;

import de.dux.adressservice.dao.mappers.ContactRowMapper;
import de.dux.adressservice.entity.Contact;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by doug on 31.03.17.
 */
public class ContactDAOImpl implements ContactDAO {
    public JdbcTemplate jdbcTemplate;


    @Override
    public void create(Contact contact) {
        //jdbcTemplate.update("INSERT INTO Contacts VALUE (" + contact.getId() + ",'" + contact.getName() + "');
        System.out.println("Invoke CREATE Contact");
    }

    @Override
    public void update(long id, String name, String surename, String foa, String telephone, String telefax, String mobilephone, String email) {
        //jdbcTemplate.update("update product set price=" + price + " where id=" + id);
        System.out.println("Invoke UPDATE Contact with id:" + id);
    }

    @Override
    public void delete(int id) {
        //jdbcTemplate.update("delete from product where id=" + id);
        System.out.println("Invoke DELETE Contact with id:" + id);
    }

    @Override
    public Contact find(int id) {
        //Contact contact = jdbcTemplate.queryForObject("select * from product where id=" + id, new ContactRowMapper());
        //return contact;

        System.out.println("Invoke GET Contact with id:" + id);
        return null;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    /*

    @Override
    void create(Contact contact) {

    }

    //Restlichen Attribute müssen noch ergänzt werder
    @Override
    void update(int id){
        jdbcTemplate.update("UPDATE contact set Name = .. WHERE id =" + id);
    }

    @Override
    void delete(int id){
        jdbcTemplate.update("DELETE from contact WHERE ID =" + id);
    }

    @Override
    Contact find(int id){
        Contact contact = jdbcTemplate.queryForObject("select * from contact where id = " + id, new ContactRowMapper());
        return contact;
    };
     */
}
