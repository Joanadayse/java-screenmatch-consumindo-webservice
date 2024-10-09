package br.com.alura.screenmatch.modelos;

public class ErroDeConversaoDeAnoException extends Throwable {
    private String mensagem;
    public ErroDeConversaoDeAnoException(String s) {
        this.mensagem = s;
    }

    @Override
    public String getMessage() {
     return    this.mensagem ;
    }


}
