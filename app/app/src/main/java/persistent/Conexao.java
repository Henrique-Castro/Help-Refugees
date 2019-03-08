package persistent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
        public Connection getConnection()
        {
            try
            {
                String servidor = "jdbc:mysql://localhost:3306/helprefugees";
                String server_user = "root";
                String server_senha="";
                return DriverManager.getConnection(servidor, server_user, server_senha);
            }
            catch(SQLException e)
            {
                throw new RuntimeException (e);
            }
        }
    }

