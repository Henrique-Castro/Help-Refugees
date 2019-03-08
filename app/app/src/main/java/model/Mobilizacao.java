package model;

public class Mobilizacao {
    private String nomeMobilizacao;
    private String local;
    private String descricao;
    private String data;

    public String getNomeMobilizacao() {
        return nomeMobilizacao;
    }

    public void setNomeMobilizacao(String nomeMobilizacao) {
        this.nomeMobilizacao = nomeMobilizacao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public Mobilizacao(String nomeMobilizacao, String local, String descricao, String data) {
        this.nomeMobilizacao = nomeMobilizacao;
        this.local = local;
        this.descricao = descricao;
        this.data = data;
    }

    public Mobilizacao(){
        this(" "," "," "," ");
    }
}

