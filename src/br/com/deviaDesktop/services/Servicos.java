package br.com.deviaDesktop.services;

import br.com.deviaDesketop.dao.AlunoDao;
import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.model.Cidade;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class Servicos {

    private AlunoDao alunoDao;
    private Cidade cidade;
    private Aluno aluno;

    public Servicos() {

        alunoDao = new AlunoDao();
        cidade = new Cidade();
        aluno = new Aluno();
        //opcaoAlteracao();
        //retornaAlunoPorId(3);
        //atualizaAluno();
    }

   

    public void opcaoAlteracao() {

        int selecao = 0;

        do {

            selecao = Integer.parseInt(JOptionPane.showInputDialog("Escolhar a opção desejada:"
                    + "\n1 - Selecionar todos os alunos"
                    + "\n2 - Seleciona nome da Cidade"
                    + "\n3 - Insere novo aluno"
                    + "\n4 - Deleta Aluno"
                    + "\n5 - Retorno o primeiro registro"
                    + "\n6- sair\n\n"));

            switch (selecao) {

                case 1:
                    selecionaTodosAlunos();
                    break;

                case 2:
                    int idCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite um Id a ser pesquizado "));
                    nomeCidade(idCidade);
                    break;

                case 3:
                    //insereAluno();
                    break;

                case 4:
                    //deletar();
                    break;

                case 5:
                    primeiroRegistroRetornado();
                    break;

                case 6:
                    System.exit(0);
            }
        } while (selecao != 6);
    }

    public List<Aluno> selecionaTodosAlunos() {

        List<Aluno> listaAlunosRetornada = alunoDao.listarAlunos();

        return listaAlunosRetornada;
    }

    public Aluno retornaAlunoPorId(int alunoId) {

        aluno = alunoDao.buscaAlunoPorId(alunoId);

        if (aluno != null) {
            
            return aluno;
        } else {

            return null;
        }

    }

    public int atualizaAluno( Aluno aluno ) {

        int alunoRetornado = 0;

        alunoRetornado = alunoDao.atualizarAluno( aluno );

        return alunoRetornado;
    }

    public int insereAluno(Aluno aluno) {

        int recebeRetorno = alunoDao.inserirAluno(aluno);

        return recebeRetorno;

    }

    public int deletar(int idAluno) {

        int retorno = alunoDao.delete(idAluno);

        return retorno;

    }

    public Aluno primeiroRegistroRetornado() {

        aluno = alunoDao.retornaPrimeiroRegistro();

        return aluno;
    }

    public Aluno registroAnteriorRetornado() {

        aluno = alunoDao.retornaRegistroAnterior();

        return aluno;
    }

    public Aluno proximoRegistroRetornado() {

        aluno = alunoDao.retornaProximoRegistro();

        return aluno;
    }

    public Aluno ultimoRegistroRetornado() {

        aluno = alunoDao.retornaUltimoRegistro();

        return aluno;
    }
    
    
    
    
    
    
    

    public void nomeCidade(int cidadeId) {

        String cidadeRetornada = alunoDao.buscaCidadePorId(cidadeId);

        if (cidadeRetornada != null) {
            System.out.println("A cidade pesquisada: " + cidadeRetornada);
        } else {

            System.out.println("A cidade pesquisada não está cadastrada ");
        }
    }
}
