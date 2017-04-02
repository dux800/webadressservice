package de.dux.adressservice.dao.mappers;

import de.dux.adressservice.entity.Contact;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by doug on 31.03.17.
 */
public class ContactRowMapper implements RowMapper <Contact> {
    @Override
    public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {

        Contact contact = new Contact();
        contact.setId(rs.getInt(1));
        contact.setName(rs.getString(2));

        return contact;
    }
}
