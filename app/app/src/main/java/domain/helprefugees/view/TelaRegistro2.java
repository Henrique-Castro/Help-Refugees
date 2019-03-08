package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import control.Cadastrar;
import control.InserirMobilizacao;
import domain.helprefugees.R;
import model.Cadastro;

public class TelaRegistro2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_registro2);

        Button btnEnviar = findViewById(R.id.btnProximo);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText txtRg = (EditText) findViewById(R.id.txtRg);
                EditText txtNascimento = (EditText) findViewById(R.id.dateNascimento);
                RadioButton feminino = findViewById(R.id.radioFeminino);
                RadioButton masculino = findViewById(R.id.radioMasculino);
                EditText txtCelular = (EditText) findViewById(R.id.txtCelular);
                EditText txtTelefone = (EditText) findViewById(R.id.txtTelefone);


                String sexoMasculino = "m";
                String sexoFeminino = "f";

                Cadastro cadastro = new Cadastro();

                cadastro.setRg(txtRg.getText().toString());
                cadastro.setNascimento(txtNascimento.getText().toString());
                cadastro.setCelular(txtCelular.getText().toString());
                cadastro.setTelefone(txtTelefone.getText().toString());
                if(feminino.isChecked()){
                    cadastro.setSexo(sexoFeminino);
                }
                else if (masculino.isChecked()){
                    cadastro.setSexo(sexoMasculino);
                }
               Cadastrar inserir = new Cadastrar();

                inserir.gravar1(cadastro);

                System.out.println("Mobilização criada com sucesso!");

                Intent intent = new Intent(TelaRegistro2.this,TelaPerfil.class);
                startActivity(intent);
            }
        });

        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaRegistro2.this,TelaRegistro.class);
                startActivity(intent);
            }
        });
    }
}
