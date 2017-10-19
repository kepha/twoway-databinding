package br.com.kepha.opensource.twowaydatabind.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import br.com.kepha.opensource.twowaydatabind.BR;

public class Mensagem extends BaseObservable {

    private String descricao;

    @Bindable
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
        notifyPropertyChanged(BR.descricao);
    }

    public Mensagem() {

    }

    public Mensagem(String descricao) {
        this.descricao = descricao;
    }

}