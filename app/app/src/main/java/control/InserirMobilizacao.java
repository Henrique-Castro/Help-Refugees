package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Mobilizacao;
import persistent.Conexao;
import java.sql.SQLException;


public class InserirMobilizacao {
    private Connection con;

    public InserirMobilizacao(){
        this.con = new Conexao().getConnection();
    }

    public void gravar(Mobilizacao mobilizacao)
    {
        String sql = "insert into tb_mobilizacoes (Nome_Mobilizacao,Local_Mobilizacao,Descricao_Mobilizacao,Data) values (?,?,?,?)";
        try
                (PreparedStatement stmt = con.prepareStatement(sql)) {
            stmt.setString(1,mobilizacao.getNomeMobilizacao());
            stmt.setString(2,mobilizacao.getLocal());
            stmt.setString(3,mobilizacao.getDescricao());
            stmt.setString(4,mobilizacao.getData());
            stmt.execute(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
