package control;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Mobilizacao;
import persistent.Conexao;

public class ConsultarMobilização {
    private Connection con;

    public ConsultarMobilização(){
        this.con = new Conexao().getConnection();
    }

    public void mostrar(Mobilizacao m) throws SQLException {
        Statement stmt = con.createStatement();
        String sql = "Where exists select Nome_mobilizacao from TB_Mobilizacoes where Nome_mobilizacao = ' "+m.getNomeMobilizacao()+"'";
        ResultSet rs = stmt.executeQuery(sql);
        try
                (PreparedStatement stmt2 = con.prepareStatement(sql)) {
            stmt2.setString(1,m.getNomeMobilizacao());
            stmt2.setString(2,m.getLocal());
            stmt2.setString(3,m.getDescricao());
            stmt2.setString(4,m.getData());
            stmt2.execute(sql);
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
