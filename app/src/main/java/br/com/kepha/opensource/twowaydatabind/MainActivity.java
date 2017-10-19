package br.com.kepha.opensource.twowaydatabind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.kepha.opensource.twowaydatabind.databinding.ActivityMainBinding;
import br.com.kepha.opensource.twowaydatabind.model.Mensagem;

public class MainActivity extends AppCompatActivity {

    /**
     * Button
     */
    private Button button;

    /**
     * EditText
     */
    private EditText editText;

    /**
     * Mensagem
     */
    private Mensagem mensagem = new Mensagem("Mensagem de teste");

    /**
     * ActivityMainBinding
     */
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel(this.mensagem);

        // Bind dos objetos da interface
        button = (Button) findViewById(R.id.button);

        // Evento de clique do botão
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alerta");
                builder.setMessage(mensagem.getDescricao());
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }

}