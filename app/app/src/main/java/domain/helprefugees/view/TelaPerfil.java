package domain.helprefugees.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import domain.helprefugees.R;

public class TelaPerfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnSair = findViewById(R.id.btnVoltar7);
        btnSair.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirPrincipal();
            }
        });


    }
    public void abrirPrincipal(){
        Intent intent = new Intent(this,TelaPrincipal.class);
        startActivity(intent);
    }
}
