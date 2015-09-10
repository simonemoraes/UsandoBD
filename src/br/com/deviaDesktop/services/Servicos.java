package br.com.deviaDesktop.services;

import br.com.deviaDesketop.dao.AlunoDao;
import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.util.Conexao;
import java.util.List;

public class Servicos {

    public List<Aluno> selecionaTodosAlunos(Conexao con) {
        AlunoDao alunoDao = new AlunoDao();
        List<Aluno> listaAlunosRetornada = alunoDao.listarAlunos(con);

        return listaAlunosRetornada;
    }

    public Aluno retornaAlunoPorId(int alunoId, Conexao con) {

        // Instanciando alunoDao
        AlunoDao alunoDao = new AlunoDao();
        Aluno aluno = alunoDao.buscaAlunoPorId(alunoId, con);

        if (aluno != null) {

            return aluno;
        } else {

            return null;
        }

    }

    //Class que faz atualização do registro no banco
    public int atualizaAluno(Aluno aluno, Conexao con) {

        int alunoRetornado = 0;
        AlunoDao alunoDao = new AlunoDao();
        alunoRetornado = alunoDao.atualizarAluno(aluno, con);

        return alunoRetornado;
    }

    public int insereAluno(Aluno aluno, Conexao con) {
        AlunoDao alunoDao = new AlunoDao();
        int recebeRetorno = alunoDao.inserirAluno(aluno, con);

        return recebeRetorno;

    }

    public int deletar(int idAluno, Conexao con) {
        AlunoDao alunoDao = new AlunoDao();
        int retorno = alunoDao.delete(idAluno, con);

        return retorno;

    }

    public Aluno primeiroRegistroRetornado() {
        Aluno aluno = new Aluno();
        AlunoDao alunoDao = new AlunoDao();
        aluno = alunoDao.retornaPrimeiroRegistro();

        return aluno;
    }

    public Aluno registroAnteriorRetornado() {
        Aluno aluno = new Aluno();
        AlunoDao alunoDao = new AlunoDao();
        aluno = alunoDao.retornaRegistroAnterior();

        return aluno;
    }

    public Aluno proximoRegistroRetornado() {
        Aluno aluno = new Aluno();
        AlunoDao alunoDao = new AlunoDao();
        aluno = alunoDao.retornaProximoRegistro();

        return aluno;
    }

    public Aluno ultimoRegistroRetornado() {
        Aluno aluno = new Aluno();
        AlunoDao alunoDao = new AlunoDao();
        aluno = alunoDao.retornaUltimoRegistro();

        return aluno;
    }

    public void nomeCidade(int cidadeId, Conexao con) {
        AlunoDao alunoDao = new AlunoDao();
        String cidadeRetornada = alunoDao.buscaCidadePorId(cidadeId, con);

        if (cidadeRetornada != null) {
            System.out.println("A cidade pesquisada: " + cidadeRetornada);
        } else {

            System.out.println("A cidade pesquisada não está cadastrada ");
        }
    }
}
