package domain.helprefugees.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import domain.helprefugees.R;
import model.Mobilizacao;

public class TelaVerMob extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_ver_mob);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Mobilizacao mobilizacao = new Mobilizacao();

        TextView lblLocal = findViewById(R.id.lblLocal);
        lblLocal.setText(mobilizacao.getLocal());

        TextView lblData = findViewById(R.id.lblData);
        lblData.setText(mobilizacao.getData());

        TextView lblDescricao = findViewById(R.id.lblDescricao);
        lblData.setText(mobilizacao.getDescricao());


        Button btnVoltar = findViewById(R.id.btnVoltar);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TelaVerMob.this,TelaPrincipal.class);
                startActivity(intent);
            }
        });
    }
}
