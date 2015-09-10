
package br.com.deviaDesktop.model;
// Ateração feita pelo Rui e revisada pela simone
public class Aluno {
    
    //declaração de variaveis
    private int idAluno;
    private String nome;
    private String sobreNome;
    private int cidade;
    
    // metodos acessores
    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int id) {
        this.idAluno = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getCidade() {
        return cidade;
    }

    public void setCidade(int cidade) {
        this.cidade = cidade;
    }
    
      @Override
    public String toString() {
        return "Aluno{" + "id=" + idAluno + ", nome=" + nome + ", sobreNome=" + sobreNome + ", cidade=" + cidade + '}';
    }
    
    
}
