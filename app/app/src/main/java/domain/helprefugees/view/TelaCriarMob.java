package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import control.InserirMobilizacao;
import domain.helprefugees.R;
import model.Mobilizacao;

public class TelaCriarMob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_criar_mob);
        Button btnCancelar = findViewById(R.id.btnVoltar);
        Button btnCriar = findViewById(R.id.btnCriar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirPrincipal();
            }
        });

        btnCriar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtNomeMob = (EditText) findViewById(R.id.txtNomeMob);
                EditText txtLocal = (EditText) findViewById(R.id.txtLocal);
                EditText txtDescricaoMob = (EditText) findViewById(R.id.txtDescricao);
                EditText txtData = (EditText) findViewById(R.id.txtData);


                Mobilizacao mobilizacao = new Mobilizacao();
                mobilizacao.setNomeMobilizacao(txtNomeMob.getText().toString());
                mobilizacao.setLocal(txtLocal.getText().toString());
                mobilizacao.setDescricao(txtDescricaoMob.getText().toString());
                mobilizacao.setData(txtData.getText().toString());

                InserirMobilizacao inserirMobilizacao = new InserirMobilizacao();
                inserirMobilizacao.gravar(mobilizacao);

                System.out.println("Mobilização criada com sucesso!");
                abrirPerfil();
            }
        });

    }
    public void abrirPrincipal () {
        Intent intent = new Intent(this, TelaPrincipal.class);
        startActivity(intent);
    }
    public void abrirPerfil(){
        Intent intent = new Intent(this,TelaPerfil.class);
        startActivity(intent);
    }
}

