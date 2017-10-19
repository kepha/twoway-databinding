package br.com.kepha.opensource.twowaydatabind.handlers;

import android.support.v7.app.AlertDialog;
import android.view.View;

import br.com.kepha.opensource.twowaydatabind.model.Mensagem;

public class MainActivityHandlers {

    public void onButtonClick(View view, Mensagem mensagem) {
        AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
        builder.setTitle("Alerta");
        builder.setMessage(mensagem.getDescricao());
        AlertDialog dialog = builder.create();
        dialog.show();
    }

}