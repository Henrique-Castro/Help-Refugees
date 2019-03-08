package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import domain.helprefugees.R;
import model.Cadastro;

public class TelaRegistro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registro);

        Button btnCancelar = findViewById(R.id.btnVoltar);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaRegistro.this,TelaLogin.class);
                startActivity(intent);
            }
        });

        Button btnProximo = findViewById(R.id.btnProximo);

        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtNome = (EditText) findViewById(R.id.txtNome);
                EditText txtEmail = (EditText) findViewById(R.id.txtEmail);
                EditText txtSenha = (EditText) findViewById(R.id.txtSenha);
                EditText txtConfirmar = (EditText) findViewById(R.id.txtConfirmar);
                EditText txtCidade = (EditText) findViewById(R.id.txtCidade);
                EditText txtEstado = (EditText) findViewById(R.id.txtEstado);

                Cadastro cadastro = new Cadastro();
                cadastro.setNome(txtNome.getText().toString());
                cadastro.setEmail(txtEmail.getText().toString());
                cadastro.setSenha(txtSenha.getText().toString());
                cadastro.setCidade(txtCidade.getText().toString());
                cadastro.setEstado(txtEstado.getText().toString());

                if(txtSenha.equals(txtConfirmar)){
                    Intent intent = new Intent(TelaRegistro.this,TelaRegistro2.class);
                    startActivity(intent);
                }
            }
        });
    }
}
