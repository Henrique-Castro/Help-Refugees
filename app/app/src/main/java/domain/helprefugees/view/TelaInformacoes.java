package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import domain.helprefugees.R;

public class TelaInformacoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informacoes);

        Button btnSair = findViewById(R.id.btnVoltar);
        btnSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirMenu();
            }
        });
        Button btnOngs = findViewById(R.id.btnOngs);
        btnOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirOngs();
            }
        });
        Button btnEscolas = findViewById(R.id.btnEscolas);
        btnEscolas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirEscolas();
            }
        });
        Button btnDocumentacao = findViewById(R.id.btnDocumentacao);
        btnDocumentacao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirDocumentacao();
            }
        });
        Button btnEmpregos = findViewById(R.id.btnEmpregos);
        btnEmpregos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirEmpregos();
            }
        });

    }
    public void abrirMenu(){
        Intent intent = new Intent(this,TelaMenu.class);
        startActivity(intent);
    }
    public void abrirOngs(){
        Intent intent = new Intent(this,TelaOngs.class);
        startActivity(intent);
    }
    public void abrirEscolas(){
        Intent intent = new Intent(this,TelaEscolas.class);
        startActivity(intent);
    }
    public void abrirEmpregos(){
        Intent intent = new Intent(this,TelaEmpregos.class);
        startActivity(intent);
    }
    public void abrirDocumentacao(){
        Intent intent = new Intent(this,TelaDocumentacao.class);
        startActivity(intent);
    }
}
