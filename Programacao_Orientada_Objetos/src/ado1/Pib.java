/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ado1;

/**
 *
 * @author Deise
 */
public class Pib {

    String estado;
    double pib;

    public Pib(String estado, double pib) {
        this.estado = estado;
        this.pib = pib;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    public double totalpib(double pib) {
        double soma = 0;
        soma = soma + pib;
        return soma;
    }

    public double porcentagem(double soma) {
        double porcentagem = (pib / soma) * 100;
        return porcentagem;
    }

}
