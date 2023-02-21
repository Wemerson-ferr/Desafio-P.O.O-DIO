package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final Double XP_PADRAO = 10D;
    private String titulo;
    private String descricao;

    public abstract double calcularXP();

    public static Double getXpPadrao() {
        return XP_PADRAO;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
