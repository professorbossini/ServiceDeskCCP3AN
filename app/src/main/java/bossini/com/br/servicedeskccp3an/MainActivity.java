package bossini.com.br.servicedeskccp3an;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText txtNome;
    public static final String NOME =
            "br.usjt.deswebmob.servicedesk.nome";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNome = findViewById(R.id.busca_fila);
    }

    public void buscarChamados (View view){
        String nome = txtNome.getText().toString();
        Intent intent =
                new Intent (this, ListarChamadosActivity.class);
        intent.putExtra(NOME, nome);
        startActivity(intent);
    }
}
