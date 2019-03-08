package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Cadastro;
import model.Mobilizacao;
import persistent.Conexao;

public class Cadastrar {
    private Connection con;

    public Cadastrar(){
        this.con = new Conexao().getConnection();
    }

    public void gravar1(Cadastro cadastro)
    {
        String sql = "insert into tb_voluntarios (Id_Voluntario,Nome, Rg,Data_Nascimento,Sexo,Telefone,Celular,Cidade,Estado,Email,Senha) values (?,?,?,?,?,?,?,?,?,?)";
        try
                (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1,cadastro.getNome());
            stmt.setString(2,cadastro.getNascimento());
            stmt.setString(3,cadastro.getSexo());
            stmt.setString(4,cadastro.getTelefone());
            stmt.setString(5,cadastro.getCelular());
            stmt.setString(6,cadastro.getCidade());
            stmt.setString(7,cadastro.getEstado());
            stmt.setString(8,cadastro.getEmail());
            stmt.setString(9,cadastro.getSenha());

            stmt.execute(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}

