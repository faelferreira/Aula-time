package br.com.uninove.aula.meutime;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import br.com.uninove.aula.meutime.customviews.MeuJogador;

public class MainActivity extends AppCompatActivity {

    private MeuJogador jogadorSelecionado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    static final int REQUEST_IMAGE_CAPTURE= 1;
    public void editarJogador(View view){
        Intent takePictureIntent =new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent,REQUEST_IMAGE_CAPTURE);
            this.jogadorSelecionado= (MeuJogador)view;
        }
    }
}
