package br.com.deviaDesktop.services;

import br.com.deviaDesketop.dao.AlunoDao;
import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.util.Conexao;
import java.util.List;

public class Servicos {
   

    public  List<Aluno> selecionaTodosAlunos( Conexao con ) {
        AlunoDao alunoDao = new AlunoDao();
        List<Aluno> listaAlunosRetornada = alunoDao.listarAlunos( con);

        return listaAlunosRetornada;
    }

    public Aluno retornaAlunoPorId(int alunoId, Conexao con, Aluno aluno, AlunoDao alunoDao  ) {

        // Instanciando alunoDao
        //AlunoDao alunoDao = new AlunoDao();
        Aluno alunoRetornado = alunoDao.buscaAlunoPorId(alunoId, con, aluno);

        if (alunoRetornado != null) {

            return alunoRetornado;
        } else {

            return null;
        }

    }
    
     public int salvarAluno(Aluno aluno, Conexao con) {
         
         int alunoRetornado = 0;
       
         
         if(aluno.getIdAluno() == 0){
             
            alunoRetornado = insereAluno(aluno, con);
             
         }else{
             
            alunoRetornado = atualizaAluno(aluno, con);
             
         }
         
         
          return alunoRetornado;
     }
    

    //Class que faz atualização do registro no banco
    public int atualizaAluno( Aluno aluno, Conexao con ) {

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

    public int deletar(int idAluno, Conexao con, AlunoDao alunoDao ) {
        // = new AlunoDao();
        int retorno = alunoDao.delete(idAluno, con);

        return retorno;

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
