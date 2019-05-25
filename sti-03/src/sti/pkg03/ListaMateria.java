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
public class ListaMateria {    
    public ArrayList <Disciplina> listaMateria;
    
    
    public ListaMateria(){
        this.listaMateria = new ArrayList<Disciplina>();
    }
    
    public void ImprimeLista(){

      ArrayList <Disciplina> array = this.listaMateria;
       
       System.out.println("------- O CR dos cursos é: --------");
       for(int i = 0; i < array.size(); i++){
           System.out.println(array.get(i).getCurso() + " - " + array.get(i).getCR());

       }
   }
   
    public void ImprimeTeste(){
        ArrayList <Disciplina> array = this.listaMateria;
        for (int i=0; i<array.size(); i++){
            array.get(i).printDisciplina();
        }
    }
    
    public void addMateria (String curso, String cargaHoraria, String nota){
        
        ArrayList <Disciplina> array = this.listaMateria;

       for(int i = 0; i < array.size(); i++){
            if(array.get(i).getCurso().equals(curso)){

                array.get(i).addInfos(cargaHoraria, nota);
                return;
            }
       }

       this.listaMateria.add(new Disciplina(curso, cargaHoraria, nota));
    }

public void calculoCurso (){
    ArrayList <Disciplina> array = this.listaMateria;
    for(int i = 0; i < array.size(); i++){
        array.get(i).calculaCR();
    }
}
}