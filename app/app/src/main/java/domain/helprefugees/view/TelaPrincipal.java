package domain.helprefugees.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

import control.ConsultarMobilização;
import domain.helprefugees.R;
import model.Mobilizacao;

public class TelaPrincipal extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btnMenu = findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirMenu();
            }
        });
        final TextView lblMostrar = findViewById(R.id.lblMostrar);
        Button btnProcurar = findViewById(R.id.btn_Procurar);
        final RelativeLayout relativo = findViewById(R.id.relativo);
        final EditText txtProcurar = findViewById(R.id.editText);
        btnProcurar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               Mobilizacao m = new Mobilizacao();
               m.setNomeMobilizacao(txtProcurar.getText().toString());
               lblMostrar.setText(m.getNomeMobilizacao());
               relativo.setVisibility(View.VISIBLE);
            }
        });

        Button btnVer = findViewById(R.id.button2);
        btnVer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirMenu();
            }
        });
    }

    public void abrirMenu(){
        Intent intent = new Intent(this,TelaMenu.class);
        startActivity(intent);
    }
    private void todasAsMobilizacoes() {

    }

    @Override
    public void onClick(View v) {

    }
    public void abrirMobilizacao(){
        Intent intent = new Intent(this,TelaVerMob.class);
        startActivity(intent);
    }
}


