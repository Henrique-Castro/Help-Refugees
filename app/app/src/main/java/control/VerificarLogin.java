package control;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import model.Usuario;
import persistent.Conexao;
import domain.helprefugees.view.TelaPrincipal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class VerificarLogin extends AppCompatActivity {
    private final Connection con;

    public VerificarLogin()
    {
        this.con = new Conexao().getConnection();
    }
    public void verificarLogin (Usuario u)
    {
        try
        {


            Statement stmt = con.createStatement();
            String sql = "Where Exists Select Email_Voluntario from TB_Voluntarios where login ='" +u.getLogin()+"'"+
            "and Senha from TB_Voluntarios where Senha ='"+u.getSenha()+"'";
            ResultSet rs = stmt.executeQuery(sql);

            if(rs.next())
            {
                Intent intent = new Intent(this,TelaPrincipal.class);
                startActivity(intent);
            }
            else
            {
                System.out.print("Email e senha não correspondem ou não estão cadastrados");
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
