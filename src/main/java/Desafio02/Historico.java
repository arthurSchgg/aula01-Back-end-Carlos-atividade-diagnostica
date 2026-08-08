package Desafio02;

import java.util.ArrayDeque;
import java.util.Deque;

public class Historico {
    private Deque<String> listUrls = new ArrayDeque<>();
    
    public void addUrlFisrt(String urlVisited){
       listUrls.addFirst(urlVisited); 
    }

    public void addUrlLast(String urlVisited){
        listUrls.addFirst(urlVisited);
    }
    
    public void listUrls(){
        System.out.println("URL:" + listUrls);
    }
    
    public void cleanedUrl(){
        listUrls.removeLast();
    }
    
    //--------------------------------------------------------------------------------//
    
    public static void main(String[] args){
        Historico historico = new Historico();
        
        historico.addUrlFisrt("dsadsadasdasdasd");
        historico.listUrls();
        historico.addUrlFisrt("dsadsadasdasdasd");
        historico.listUrls();
        historico.addUrlLast("Hsadsadasdasdasd");
        historico.listUrls();
        historico.addUrlLast("2dsadsadasdasdasd");
        historico.listUrls();
        historico.cleanedUrl();
        historico.listUrls();
        historico.cleanedUrl();
        historico.listUrls();
        historico.cleanedUrl();
        historico.listUrls();
        historico.cleanedUrl();
        historico.listUrls();
    }
}
