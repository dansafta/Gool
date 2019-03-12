package org.fasttrackit.catel;
//definit clasa catel
public class Catel {
    // fielduri
    private String name;
    private int greutate;
    private int varsta;

    public void setName(String wantedName) {
        name = wantedName;
    }

    public int getVarsta() {
        return varsta;
    }

    // functii = medode
    public void latra() {

        System.out.print("Ham");
    }

        public void mananca () {
            greutate++;


            if (greutate > 10) {
                varsta++;

            }


        }

    public String getName() {
        return name;
    }
}





