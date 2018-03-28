package bossini.com.br.servicedeskccp3an;

/**
 * Created by rodrigo on 21/03/18.
 */

public enum FilaId {
    DESKTOP (1000, "Desktops", "desktops"),
    TELEFONIA (1001, "Telefonia", "telefonia");
    public int numero;
    public String nome;
    public String icone;

    FilaId (int numero, String nome, String icone){
        this.numero = numero;
        this.nome = nome;
        this.icone = icone;
    }


}
