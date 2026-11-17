package com.dest1.roblox.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Roblox {

    @Id
    private int id;
    private String nome;
    private String jogo;
    private String descricao;
    private double saldoRobux;
    private String status;
    private String plataforma;

    public Roblox(){
    }

    public Roblox(int id, String nome, String jogo, String descricao, double saldoRobux, String status, String plataforma) {
        this.id = id;
        this.nome = nome;
        this.jogo = jogo;
        this.descricao = descricao;
        this.saldoRobux = saldoRobux;
        this.status = status;
        this.plataforma = plataforma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJogo() {
        return jogo;
    }

    public void setJogo(String jogo) {
        this.jogo = jogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getSaldoRobux() {
        return saldoRobux;
    }

    public void setSaldoRobux(double saldoRobux) {
        this.saldoRobux = saldoRobux;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
