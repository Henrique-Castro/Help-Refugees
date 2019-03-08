package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import domain.helprefugees.R;

public class TelaMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_menu);

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirPrincipal();
            }
        });

        Button btnCriarMob = findViewById(R.id.btnCriarMob);
        btnCriarMob.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirCriarMob();
            }
        });
        ImageButton btnCriarMob2 = findViewById(R.id.btnCriarMob2);
        btnCriarMob2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirCriarMob();
            }
        });

        Button btnPerfil = findViewById(R.id.btnPerfil);
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirPerfil();
            }
        });
        ImageButton btnPerfil2 = findViewById(R.id.btnPerfil2);
        btnPerfil2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirPerfil();
            }
        });

        Button btnInfo = findViewById(R.id.btnInformacoes);
        btnInfo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                abrirInfo();
            }
        });
        ImageButton btnInfo2= findViewById(R.id.btnInformacoes2);
        btnInfo2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                abrirInfo();
            }
        });

        Button btnSair = findViewById(R.id.btnSair);
        btnSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirLogin();
            }
        });
        ImageButton btnSair2= findViewById(R.id.btnSair2);
        btnSair2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirLogin();
            }
        });
    }
    public void abrirCriarMob(){
        Intent intent = new Intent(this,TelaCriarMob.class);
        startActivity(intent);
    }
    public void abrirPrincipal(){
        Intent intent = new Intent(this,TelaPrincipal.class);
        startActivity(intent);
    }
    public void abrirPerfil(){
        Intent intent = new Intent(this,TelaPerfil.class);
        startActivity(intent);
    }
    public void abrirInfo(){
        Intent intent = new Intent(this,TelaInformacoes.class);
        startActivity(intent);
    }
    public void abrirLogin(){
        Intent intent = new Intent(this,TelaLogin.class);
        startActivity(intent);
    }

}
