package com.mycompany.akinator;

public class Pergunta 
{
    private String pergunta;
    private Alternativa[] alternativa;

    public Pergunta(String pergunta, Alternativa[] alternativa) 
    {
        this.pergunta = pergunta;
        this.alternativa = alternativa;
    }

    public String getPergunta() 
    {
        return pergunta;
    }

    public void setPergunta(String pergunta) 
    {
        this.pergunta = pergunta;
    }

    public Alternativa[] getAlternativa() 
    {
        return alternativa;
    }

    public void setAlternativa(Alternativa[] alternativa) 
    {
        this.alternativa = alternativa;
    }

    @Override
    public String toString() 
    {
        return "Pergunta{" + "pergunta=" + pergunta + '}';
    }  
}
