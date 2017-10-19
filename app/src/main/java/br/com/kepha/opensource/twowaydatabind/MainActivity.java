package br.com.kepha.opensource.twowaydatabind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.kepha.opensource.twowaydatabind.databinding.ActivityMainBinding;
import br.com.kepha.opensource.twowaydatabind.handlers.MainActivityHandlers;
import br.com.kepha.opensource.twowaydatabind.model.Mensagem;

public class MainActivity extends AppCompatActivity {

    /**
     * Mensagem
     */
    private Mensagem mensagem = new Mensagem("Mensagem de teste");

    /**
     * MainActivityHandlers
     */
    private MainActivityHandlers mainActivityHandlers = new MainActivityHandlers();

    /**
     * ActivityMainBinding
     */
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel(this.mensagem);
        activityMainBinding.setHandlers(this.mainActivityHandlers);
    }

}