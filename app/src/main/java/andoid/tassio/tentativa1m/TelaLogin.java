package andoid.tassio.tentativa1m;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {


    private TextView text_tela_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dois);


        getSupportActionBar().hide();
        IniciarComponentes();
        text_tela_cadastro.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(TelaLogin.this,FormCadastro.class);
                startActivity(intent);

            }
        });
    }

    private void IniciarComponentes() {
    }

    private void iniciarComponentes(){
        text_tela_cadastro = findViewById(R.id.text_tela_cadastro);
    }

}