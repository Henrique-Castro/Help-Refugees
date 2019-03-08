package domain.helprefugees.view;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import org.xml.sax.SAXException;
import android.support.fragment.*;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import domain.helprefugees.R;

public class TelaInicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
        
        completarTarefa();
    }



    private void completarTarefa(){
        try {
            Thread.sleep(3500);
            Intent intent = new Intent(this, TelaPrincipal.class);
            startActivity(intent);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            throw new ParserConfigurationException();
        } catch (ParserConfigurationException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            throw new TransformerException("");
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            throw new SAXException();
        } catch (SAXException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        try {
            throw new IOException();
        } catch (IOException e) {
        }

    }




    }

