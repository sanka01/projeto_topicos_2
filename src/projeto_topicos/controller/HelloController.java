package projeto_topicos.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HelloController {
    private String nome1;
    private String nome2;
    private String text;

    public static void main(String[] args) {


    }
    public String getNome1() {
        return nome1;
    }

    public void setNome1(String nome1) {
        this.nome1 = nome1;
    }

    public String getNome2() {
        return nome2;
    }

    public void setNome2(String nome2) {
        this.nome2 = nome2;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
