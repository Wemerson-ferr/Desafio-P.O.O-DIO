package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;
    
    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalDate getData() {
        return data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20D;
    }
    
    @Override
    public String toString() {
        return "Mentoria [titulo: " + getTitulo() + "\ndescricao: " + getDescricao() + "\ndata: " + data + "]";
    }
}
