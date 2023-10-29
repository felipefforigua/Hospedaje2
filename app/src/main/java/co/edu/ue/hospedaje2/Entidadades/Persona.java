package co.edu.ue.hospedaje2.Entidadades;

import java.io.Serializable;
import java.util.ArrayList;


public class Persona  implements Serializable {
    private String name;
    private String lastname;
    private String document;
    private ArrayList<Transaccion> transaccions = new ArrayList<>();

    public Persona(String name, String lastname, String document) {
        this.name = name;
        this.lastname = lastname;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public ArrayList<Transaccion> getTransaccions() {
        return transaccions;
    }

    public void setTransaccions(ArrayList<Transaccion> transaccions) {
        this.transaccions = transaccions;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", document='" + document + '\'' +
                ", transaccions=" + transaccions +
                '}';
    }
}
