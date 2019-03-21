package org.fasttrackit.agenda;

public class Contact {


        private String firstName;
        private String lastName;
        private String phone;
        private String address;


        public Contact () {
            phone="";
        }


        public void setFirstName(String firstNameParam) {
            //validare

            if(firstNameParam.equals(""))
                throw new IllegalArgumentException("Firs Name cannot be empty ");
            this.firstName = firstNameParam;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String toString(){
            return "First name is: " + firstName +
                    " and last name is " + lastName;
        }

        //public boolean equals(Object o) {
        //Contact second = (Contact) o;
        // if (second.getFirstName().equals(this.firstName))&&
        //second.getLastName().equals(this.getLastName());
        //return true;
        //else {
        //return false;
    }

