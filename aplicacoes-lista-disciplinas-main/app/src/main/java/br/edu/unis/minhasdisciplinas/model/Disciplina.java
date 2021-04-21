package br.edu.unis.minhasdisciplinas.model;

import java.io.Serializable;

public class Disciplina implements Serializable {

    private final int id;
    private String titulo;
    private int crg_horaria;
    private String ementa;
    private static int contadorId = 1;

    public Disciplina(String titulo, int crg_horaria, String ementa){
        this.titulo = titulo;
        this.crg_horaria = crg_horaria;
        this.id = contadorId;
        this.ementa = ementa;
        contadorId++;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCarga() {
        return crg_horaria;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCarga(int crg_horaria) {
        this.crg_horaria = crg_horaria;
    }

    public void setEmenta(String ementa]) {
        this.ementa = ementa;
    }

}


