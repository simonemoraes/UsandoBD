package br.com.deviaDesketop.dao;

import br.com.deviaDesktop.model.Aluno;
import br.com.deviaDesktop.model.Cidade;
import br.com.deviaDesktop.util.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class AlunoDao {

   
    ResultSet rs;


    public List<Aluno> listarAlunos ( Conexao con ) {
        
        
        String sql = "select * from aluno";
        PreparedStatement ps = (PreparedStatement) con.getPreparedStatement(sql);

        List<Aluno> listaAluno = new LinkedList<>();

        try {
            rs = ps.executeQuery();

            while (rs.next()) {
                Aluno aluno = new Aluno();
                
                aluno.setIdAluno(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobreNome(rs.getString("sobreNome"));
                aluno.setCidade(rs.getInt("codCidade"));

                listaAluno.add(aluno);
            }

        } catch (SQLException e) {
             JOptionPane.showMessageDialog( null, e.getMessage() ); 
        }

        return listaAluno;
    }

    public Aluno buscaAlunoPorId(int idAluno, Conexao con, Aluno aluno ) {

        PreparedStatement ps;
        String sql = "select * from aluno where id=?";

        try {
            ps = (PreparedStatement) con.getPreparedStatement(sql);
            ps.setInt(1, idAluno);

            rs = ps.executeQuery();

            //Aluno aluno = new Aluno();

            if (rs.next()) {

                aluno.setIdAluno(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setSobreNome(rs.getString("sobreNome"));
                aluno.setCidade(rs.getInt("codCidade"));

                return aluno;
            
            }

        } catch (SQLException e) {
             JOptionPane.showMessageDialog( null, e.getMessage() ); 
             return null;
        }

        return null;
    }

    public int atualizarAluno( Aluno aluno, Conexao con ) {

        PreparedStatement ps;
        String sql = "update aluno set nome = ?, sobreNome = ?, codCidade = ? where id = ?";
        int retorno = 0;

        try {

            ps = (PreparedStatement) con.getPreparedStatement(sql);
            ps.setString( 1, aluno.getNome() );
            ps.setString( 2, aluno.getSobreNome() );
            ps.setInt( 3, aluno.getCidade() );
            ps.setInt( 4, aluno.getIdAluno() );
            
            retorno = ps.executeUpdate();

        } catch (SQLException e) {
             JOptionPane.showMessageDialog( null, e.getMessage() ); 
        }

        return retorno;
    }

    public int inserirAluno( Aluno aluno, Conexao con ) {

        PreparedStatement ps;
        String sql = "insert into aluno(nome, sobreNome, codCidade) values(?,?,?)";
        int retorno = 0;

        try {

            ps = (PreparedStatement) con.getPreparedStatement(sql);
            ps.setString(1, aluno.getNome());
            ps.setString(2, aluno.getSobreNome());
            ps.setInt(3, aluno.getCidade());

            retorno = ps.executeUpdate();

        } catch (SQLException e) {
             JOptionPane.showMessageDialog( null, e.getMessage() ); 
        }

        return retorno;
    }

    public int delete( int id_aluno, Conexao con ) {

        PreparedStatement ps;
        int retorno = 0;
        String sql;

        sql = "delete from aluno where id = ?";

        ps = ( PreparedStatement ) con.getPreparedStatement( sql );
        try {
            ps.setInt(1, id_aluno);

            retorno = ps.executeUpdate();

        } catch ( SQLException e ) {
             JOptionPane.showMessageDialog( null, e.getMessage() ); 
        }

        return retorno;
    }

    
    
    

    public String buscaCidadePorId(int cidade, Conexao con) {

        PreparedStatement ps;
        String cidadeRetornada = null;
        String sql = "select nomeCidade from cidade where id = ?";

        Cidade recebeCidade = new Cidade();
        recebeCidade.setIdCidade(cidade);

        try {
            ps = (PreparedStatement) con.getPreparedStatement(sql);
            ps.setInt(1, recebeCidade.getIdCidade());

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                recebeCidade.setNomeCidade(rs.getString("nomeCidade"));

                cidadeRetornada = rs.getString("nomeCidade");
            }

        } catch ( SQLException e ) {
            JOptionPane.showMessageDialog( null, e.getMessage() );            
        }

        return cidadeRetornada;
    }
}
