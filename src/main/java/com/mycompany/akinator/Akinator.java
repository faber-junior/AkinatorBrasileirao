package com.mycompany.akinator;

import java.util.ArrayList;

public class Akinator 
{ 
    TelaPrincipal tpr;
    TelaPerguntas tpg;
    TelaResposta trp;
    public ArrayList<Time> times_possiveis;
    public ArrayList<Pergunta> perguntas;
    
    public Akinator()
    {
        this.times_possiveis = this.criaListaTimes();
        this.perguntas = this.criaPerguntas();
    }
    
    public static void main(String[] args) 
    {
        Akinator main = new Akinator();
        main.criaTelaPric(main.getTelaPrincipal());        
    }
    
    public ArrayList<Time> criaListaTimes()
    {
        ArrayList<Time> times_possiveis = new ArrayList<Time>();
        
        times_possiveis.add(new Time("Botafogo")); //0-
        times_possiveis.add(new Time("Bragantino")); //1
        times_possiveis.add(new Time("Grêmio")); //2-
        times_possiveis.add(new Time("Palmeiras")); //3-
        times_possiveis.add(new Time("Flamengo")); //4-
        times_possiveis.add(new Time("Fortaleza")); //5
        times_possiveis.add(new Time("Fluminense")); //6-
        times_possiveis.add(new Time("Athletico-PR")); //7-
        times_possiveis.add(new Time("Atlético-MG")); //8-
        times_possiveis.add(new Time("São Paulo")); //9-
        times_possiveis.add(new Time("Cuiabá")); //10
        times_possiveis.add(new Time("Internacional")); //11-
        times_possiveis.add(new Time("Corinthians")); //12-
        times_possiveis.add(new Time("Santos")); //13-
        times_possiveis.add(new Time("Cruzeiro")); //14-
        times_possiveis.add(new Time("Bahia")); //15-
        times_possiveis.add(new Time("Vasco da Gama")); //16-
        times_possiveis.add(new Time("Goiás")); //17
        times_possiveis.add(new Time("Coritiba")); //18-
        times_possiveis.add(new Time("América-MG")); //19
        
        return times_possiveis;
    }
    
    public ArrayList<Pergunta> criaPerguntas()
    {
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        
        //COR
        perguntas.add(new Pergunta("A cor predominante é verde?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Possui esta cor no escudo"),
            new Alternativa("Não possui esta cor"),
        }));

        perguntas.add(new Pergunta("A cor predominante é azul?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Possui esta cor no escudo"),
            new Alternativa("Não possui esta cor"),
        }));

        perguntas.add(new Pergunta("A cor predominante é vermelho?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Possui esta cor no escudo"),
            new Alternativa("Não possui esta cor"),
        }));

        perguntas.add(new Pergunta("A cor do seu time é preto e branco?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Possui esta cor no escudo"),
            new Alternativa("Não possui esta cor"),
        }));

        perguntas.add(new Pergunta("Tem 3 cores no seu time?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Possui esta cor no escudo"),
            new Alternativa("Não possui esta cor"),
        }));

        //REGIÃO
        perguntas.add(new Pergunta("O seu time é da região sudeste?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu time é da região sul?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu time é da região nordeste?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu time é da região norte?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu time é da região centro-oeste?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        //TÉCNICO
        perguntas.add(new Pergunta("O seu técnico é brasileiro?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu técnico é português?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        perguntas.add(new Pergunta("O seu técnico é argentino?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Provavelmente sim"),
            new Alternativa("Provavelmente não"),
        }));

        //OUTROS
        perguntas.add(new Pergunta("O seu time já foi campeão brasileiro?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Uma vez"),
            new Alternativa("Mais de uma vez"),
        }));

        perguntas.add(new Pergunta("O seu time já foi campeão mundial?", new Alternativa[]{
            new Alternativa("Sim"),
            new Alternativa("Não"),
            new Alternativa("Não sei"),
            new Alternativa("Uma vez"),
            new Alternativa("Mais de uma vez"),
        }));
        
        return perguntas;
    }
    
    public void criaTelaPric(TelaPrincipal tpr)
    {
        tpr = new TelaPrincipal();
        tpr.setVisible(true);
    }
    
    public void criaTelaPerg(TelaPerguntas tpg)
    {
        tpg = new TelaPerguntas();
        tpg.setVisible(true);
    }
    
    public void criaTelaResp(TelaResposta trp, Akinator main)
    {
        trp = new TelaResposta();
        trp.setVisible(true);
        trp.main = main;
        trp.criaResposta();
    }
    
    public TelaPrincipal getTelaPrincipal()
    {
        return this.tpr;
    }
    
    public TelaPerguntas getTelaPerguntas()
    {
        return this.tpg;
    }
    
    public TelaResposta getTelaResposta()
    {
        return this.trp;
    }
    
    public ArrayList<Time> getTimesPossiveis()
    {
        return this.times_possiveis;
    }
    
    public ArrayList<Pergunta> getPerguntas()
    {
        return this.perguntas;
    }
    
    public ArrayList<Time> atualizaTimesPossiveis(ArrayList<Time> times_possiveis, int num_perg, char op)
    {
        switch (num_perg)
        {
            case 0:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        break;
                    case 'c':                        
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        break;
                    default:
                        break;
                }
                break;
            case 4:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        break;
                    default:
                        break;
                }
                break;
            case 5:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));        
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 6:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 7:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 8:
                switch (op)
                {
                    case 'a':
                        break;
                    case 'b':
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 9:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 10:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 11:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 12:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        break;
                    case 'e':
                        break;
                    default:
                        break;
                }
                break;
            case 13:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));                        
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        break;
                    default:
                        break;
                }
                break;
            case 14:
                switch (op)
                {
                    case 'a':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'b':
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        break;
                    case 'c':
                        break;
                    case 'd':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("São Paulo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Corinthians"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Santos"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    case 'e':
                        times_possiveis.removeIf(time -> time.getNome().equals("Botafogo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bragantino"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Grêmio"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Palmeiras"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Flamengo"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fortaleza"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Fluminense"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Athletico-PR"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Atlético-MG"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cuiabá"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Internacional"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Cruzeiro"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Bahia"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Vasco da Gama"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Goiás"));
                        times_possiveis.removeIf(time -> time.getNome().equals("Coritiba"));
                        times_possiveis.removeIf(time -> time.getNome().equals("América-MG"));
                        break;
                    default:
                        break;
                }
                break;            
            default:
                break;
        }
        return times_possiveis;
    }
}