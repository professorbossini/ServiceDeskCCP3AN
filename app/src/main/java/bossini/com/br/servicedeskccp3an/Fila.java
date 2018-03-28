package bossini.com.br.servicedeskccp3an;

import java.io.Serializable;

/**
 * Created by rodrigo on 21/03/18.
 */

public class Fila implements Serializable{
    private int id;
    private String icone, nome;

    public Fila (int id, String icone, String nome){
        this.id = id;
        this.icone = icone;
        this.nome = nome;
    }

    public String getIcone() {
        return icone;
    }
}
