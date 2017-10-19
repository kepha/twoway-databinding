package br.com.kepha.opensource.twowaydatabind;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    /**
     * Button
     */
    private Button button;

    /**
     * EditText
     */
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Definição do layout
        setContentView(R.layout.activity_main);

        // Bind dos objetos da interface
        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);

        // Evento de clique do botão
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Alerta");
                builder.setMessage(editText.getText());
                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });

    }

}