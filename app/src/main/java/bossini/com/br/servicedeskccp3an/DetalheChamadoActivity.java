package bossini.com.br.servicedeskccp3an;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetalheChamadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_chamado);
        TextView chamadoSelecionadoTextView =
                findViewById(R.id.chamadoSelecionadoTextView);
        Intent origemIntent = getIntent ();
        chamadoSelecionadoTextView.
                setText(origemIntent.
                getStringExtra(
                        ListarChamadosActivity.DESCRICAO
                ));
    }
}
