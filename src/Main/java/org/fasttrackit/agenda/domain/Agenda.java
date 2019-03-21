package org.fasttrackit.agenda.domain;

import org.fasttrackit.agenda.Contact;


 import java.util.ArrayList;
import java.util.List;

    public class Agenda {

        private String nameAgenda;
        private String owner;


        private List<Contact> contactList = new ArrayList<Contact>();

        public static void main (String args[]) {

            Agenda agenda = new Agenda();

            Contact firstContact = new Contact();
            firstContact.setFirstName("Costel");
            firstContact.setLastName("Pop");
            System.out.println(firstContact.toString());

            agenda.getContactList().add(firstContact);


            Contact secondContact = new Contact();
            secondContact.setFirstName("Ana");
            secondContact.setLastName("Pop");
            System.out.println(secondContact.toString());

            agenda.getContactList().add(secondContact);



            System.out.println("check equals with == "+(secondContact==firstContact));

            System.out.println("check equals with equals "+(secondContact.equals(firstContact)));

        }

        public String getNameAgenda() {
            return nameAgenda;
        }

        public void setNameAgenda(String nameAgenda) {
            this.nameAgenda = nameAgenda;
        }

        public String getOwner() {
            return owner;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public List<Contact> getContactList() {
            return contactList;
        }

        public void setContactList(List<Contact> contactList) {
            this.contactList = contactList;
        }
    }
