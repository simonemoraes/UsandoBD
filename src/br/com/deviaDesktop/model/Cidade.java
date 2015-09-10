
package br.com.deviaDesktop.model;

public class Cidade {

    private int idCidade;
    private String nomeCidade;
    private char estado;

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public void setNomeCidade(String nomeCidade) {
        this.nomeCidade = nomeCidade;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
      @Override
    public String toString() {
        return "Cidade{" + "idCidade=" + idCidade + ", nomeCidade=" + nomeCidade + ", estado=" + estado + '}';
    }
    
    
}
