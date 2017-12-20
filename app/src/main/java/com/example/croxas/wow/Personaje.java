package com.example.croxas.wow;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Croxas on 17/12/17.
 */

public class Personaje extends DAO_InterfaceUserImp implements Serializable{
    //Cambiados a private...
    private String nombre;
    private int nivel;
    private int ataque;
    private int defensa;
    private int resistencia;
    private ArrayList<Objeto> arrMisObjetos;

    //Agregados por mi en android
    private int experiencia;


    public Personaje(String nombre, int n, int a, int d, int r, int exp)
    {
        this.nombre = nombre;
        this.nivel = n;
        this.ataque = a;
        this.resistencia = d;
        this.defensa = r;
        //añadido
        this.experiencia = exp;
        arrMisObjetos = new ArrayList<Objeto>();

    }

    public Personaje()
    {
        this.nombre = null;
        this.nivel = 0;
        this.ataque = 0;
        this.resistencia = 0;
        this.defensa = 0;
        arrMisObjetos = new ArrayList<Objeto>();

    }

    public ArrayList<Objeto> getArrMisObjetos() {return arrMisObjetos;}

    public void setArrMisObjetos(ArrayList<Objeto> arrMisObjetos) {this.arrMisObjetos = arrMisObjetos;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getExperiencia() {return experiencia;}

    public void setExperiencia(int experiencia) {this.experiencia = experiencia;}
}
