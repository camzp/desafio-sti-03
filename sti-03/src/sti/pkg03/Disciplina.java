/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sti.pkg03;
import java.util.*;

/**
 *
 * @author camila
 */
public class Disciplina {
    //Atributos
    private String curso;
    private ArrayList <String> cargahoraria;
    private ArrayList <String> nota;
    private int crCurso =0;
    private int chCurso =0;
        
    public Disciplina (String curso, String cargaHoraria, String notas){
        this.curso = curso;
        
        this.cargahoraria = new ArrayList<String>();
        cargahoraria.add(cargaHoraria);
        
        this.nota = new ArrayList <String>();
        nota.add(notas);
        
    }
    
    public void printDisciplina(){
        System.out.println(getCurso());
        System.out.println(getCargaHoraria());
        System.out.println(getNotas());
    }
    
    public void addInfos (String cargaHoraria, String notas){
        this.cargahoraria.add(cargaHoraria);
        this.nota.add(notas);
    }
    public void calculaCR(){
        int ch = calculaCH();
        int acumulador =0;
        ArrayList<String> arrayN= this.nota;
        ArrayList<String> arrayCH= this.cargahoraria;
        for (int i=0; i < arrayN.size(); i++){
            
            acumulador += Integer.parseInt(arrayN.get(i)) * Integer.parseInt(arrayCH.get(i));
            
        }
        
        crCurso = (acumulador/ch);
        
    }
    
    public int calculaCH(){
        int acumulador = 0;
        ArrayList <String> array = this.cargahoraria;
        for(int i=0; i < array.size(); i++){
            acumulador += Integer.parseInt(array.get(i));
        }
        this.chCurso = acumulador;
       return acumulador; 
    }
    
    // Metodos Acessores
    public String getCurso(){
        return this.curso;
    }
    
    public void setCurso(String curso){
        this.curso = curso;
    }
    
    
    public  ArrayList <String> getCargaHoraria(){
        return this.cargahoraria;
    }
    
    public void setCargaHoraria(ArrayList <String> array){
        this.cargahoraria = cargahoraria;
    }
    
    public ArrayList <String> getNotas(){
        return this.nota;
    }
    
    public void setNotas(ArrayList <String> array){
        this.nota = nota;
    }
        public int getCR(){
        return this.crCurso;
    }
    
    public void setCR(int crCruso){
        this.crCurso = crCurso;
    }
    
    
    
}
