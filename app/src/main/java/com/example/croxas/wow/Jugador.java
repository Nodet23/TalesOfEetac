package com.example.croxas.wow;

/**
 * Created by Croxas on 17/12/17.
 */

import java.util.ArrayList;

public class Jugador extends DAO_InterfaceUserImp{
    private String nom;
    private String email;
    private String contrasenya;
    private  ArrayList<Personaje> personajes; //etiqueta buida

    public Jugador(String nom, String contrasenya, String email) {
        this.nom = nom;
        this.contrasenya = contrasenya;
        this.email = email;
        this.personajes = new ArrayList<Personaje>();
        this.idAutogen = false;
        this.id = email.hashCode();
    }


    public Jugador() {
        this.nom = null;
        this.contrasenya = null;
        this.email = null;
        this.personajes = new ArrayList<Personaje>();
        this.idAutogen = false;
        this.id = 0;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public ArrayList<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(ArrayList<Personaje> personajes) {
        this.personajes = personajes;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        id = email.hashCode();
    }

    public String getNom() {

        return nom;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean isIdAutogen() {
        return idAutogen;
    }
    @Override
    public void setIdAutogen(boolean idAutogen) {
        this.idAutogen = idAutogen;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(this.id).append(" ").append(this.email).append(" ").append(contrasenya).append(" ").append(nom);

        return sb.toString();
    }

}

