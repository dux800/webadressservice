package de.dux.adressservice;

import de.dux.adressservice.dao.ContactDAO;
import de.dux.adressservice.dto.Contact;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by doug on 30.03.17:
 *
 */

public class AdressServiceImpl implements AddressService {
    private ContactDAO dao;

    //Eindeutige Nummer Datenbank oder im Programm?
    //private long currentId = 1;

    @Override
    public Response addContact (Contact contact) {
        de.dux.adressservice.entity.Contact contactEntity = mapWStoDAO(contact);
        dao.create(contactEntity);
        return Response.ok(contact).build();
    }

    private de.dux.adressservice.entity.Contact mapWStoDAO(Contact contact) {
        de.dux.adressservice.entity.Contact contactEntity = new de.dux.adressservice.entity.Contact();

        contactEntity.setId(contact.getId());
        contactEntity.setName(contact.getName());
        contactEntity.setSurename(contact.getSurename());
        contactEntity.setFoa(contact.getFoa());
        contactEntity.setTelephone(contact.getTelephone());
        contactEntity.setTelefax(contact.getTelefax());
        contactEntity.setMobilephone(contact.getMobilephone());
        contactEntity.setEmail(contact.getEmail());

        return contactEntity;
    }

    @Override
    public Contact getContact(int id) {
        de.dux.adressservice.entity.Contact contactEntity = dao.find(id);
        Contact contact = mapDAOtoWS(contactEntity);
        return contact;
    }

    private Contact mapDAOtoWS(de.dux.adressservice.entity.Contact contactEntity) {
        Contact contact = new Contact();

        contact.setId(contactEntity.getId());
        contact.setName(contactEntity.getName());
        contact.setSurename(contactEntity.getSurename());
        contact.setFoa(contactEntity.getFoa());
        contact.setTelephone(contactEntity.getTelephone());
        contact.setTelefax(contactEntity.getTelefax());
        contact.setMobilephone(contactEntity.getMobilephone());
        contact.setEmail(contactEntity.getEmail());

        return contact;
    }

    @Override
    public Response updateContact(Contact updatedContact) {
        //int id, String name, String surename, String foa, String telephone, String telefax, String mobilephone, String email
        dao.update(updatedContact.getId(), updatedContact.getName(), updatedContact.getSurename(), updatedContact.getFoa(),
                updatedContact.getTelephone(), updatedContact.getTelefax(), updatedContact.getMobilephone(), updatedContact.getEmail());

        return Response.ok().build();
    }

    @Override
    public Response deleteContact(int id) {
        dao.delete(id);
        return Response.ok().build();
    }

    public ContactDAO getDao() {
        return dao;
    }

    public void setDao(ContactDAO dao) {
        this.dao = dao;
    }

    /*public Prescription getPrescription(String prescriptionId) {
        long id = Long.parseLong(prescriptionId);
        Prescription prescription = prescriptions.get(id);
        return prescription;
    }*/

    /*public Patients getAllPationts(){
        System.out.println("...invoking getAllPatient, Get all Patient");
        Patients myPatients  = new Patients();

        for (Patient currentPatient: patients.values()
                ) {
            myPatients.setPatient2Patients(currentPatient);
        }

        //patients
        //Long patientId = Long.parseLong(id);
        //Patient patient = patients.get(patientId);
        return myPatients;
    }*/

}
