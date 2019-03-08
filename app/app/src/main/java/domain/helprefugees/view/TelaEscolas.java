package domain.helprefugees.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import domain.helprefugees.R;

public class TelaEscolas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolas);

        Button btnVoltar = findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                abrirInfo();
            }
        });
    }

    public void abrirInfo() {
        Intent intent = new Intent(this, TelaInformacoes.class);
        startActivity(intent);
    }
}
