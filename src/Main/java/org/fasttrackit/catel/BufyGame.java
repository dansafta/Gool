package org.fasttrackit.catel;

public class BufyGame {
    public static void main (String [] args) {
        Catel dog1 = new Catel();
        dog1.setName("Rex");
        Catel dog2 = new Catel();
        dog2.setName("Dog");

        dog2.mananca();

        System.out.println("Catelul 2 are varsta:" + dog2.getVarsta());

        for(int zi=0; zi<15; zi++) {
            System.out.println("zi" +zi);
            dog2.mananca();
            System.out.println(dog2.getVarsta());
            System.out.println( "--------------------------" );
        }

System.out.println("Catelul"+ dog2.getName()+ "are varsta"  + dog2.getVarsta());
    }
}
