package br.com.uninove.aula.meutime.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.com.uninove.aula.meutime.R;

public class MeuJogador extends LinearLayout{
    private ImageView imgFoto;
    private TextView txtNome;
    private Context context;

    public ImageView getImgFoto() {
        return imgFoto;
    }

    public void setImgFoto(Bitmap imgFoto) {
        this.imgFoto.setImageBitmap(imgFoto);
    }

    public TextView getTxtNome() {
        return txtNome;
    }

    public void setTxtNome(String txtNome) {
        this.txtNome.setText(txtNome);
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;
    public MeuJogador(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        try {
            init();
            imgFoto.setImageResource(R.drawable.usu);
            txtNome.setText("selecionar meu jogador");
        } finally {

        }
    }

    private void init(){
        inflate(getContext(),R.layout.meu_jogador,this);
        this.txtNome = (TextView)findViewById(R.id.txtNome);
        this.imgFoto = (ImageView)findViewById(R.id.imgFoto);

    }

}
