package bossini.com.br.servicedeskccp3an;

/**
 * Created by rodrigo on 21/03/18.
 */
import java.io.Serializable;
import java.util.Date;
public class Chamado implements Serializable {
    private int numero;
    private Date dataAbertura, dataFechamento;
    private String status, descricao;
    private Fila fila;

    public Chamado (int numero, Date dataAbertura, Date dataFechamento,
                    String status, String descricao, Fila fila){
        this.numero = numero;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
        this.descricao = descricao;
        this.fila = fila;
    }

    public String getDescricao(){
        return descricao;
    }

    public Fila getFila (){
        return this.fila;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public Date getDataFechamento() {
        return dataFechamento;
    }
}
