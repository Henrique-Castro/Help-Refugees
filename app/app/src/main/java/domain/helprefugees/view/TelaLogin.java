package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import model.Usuario;
import control.VerificarLogin;

import domain.helprefugees.R;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login);
        Button btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        Button btnEntrar = (Button) findViewById(R.id.btnEntrar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaLogin.this,TelaRegistro.class);
                startActivity(intent);
            }
        });
        btnEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText txtLogin = (EditText) findViewById(R.id.txtLogin);
                EditText txtSenha = (EditText) findViewById(R.id.txtSenha);

                Usuario user = new Usuario();
                user.setLogin(String.valueOf(txtLogin.getText()));
                user.setSenha(String.valueOf(txtSenha.getText()));
                VerificarLogin dao = new VerificarLogin();
                dao.verificarLogin(user);

            }

        });
    }
}
