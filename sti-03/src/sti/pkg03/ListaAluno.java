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
public class ListaAluno {
   public ArrayList <Aluno> listaAluno;
   
   public ListaAluno(){
       this.listaAluno = new ArrayList<Aluno>();
   }
  public void ImprimeLista(){
       ArrayList <Aluno> array = this.listaAluno;
       
       System.out.println("------- O CR dos alunos é: --------");
       for(int i = 0; i < array.size(); i++){
           System.out.println(array.get(i).getMatricula() + " - " + array.get(i).getCr());
            

       }
       System.out.println("");
       System.out.println("-----------------------------------");

   }
 
  public void ImprimeTeste(){ //Impressão do Teste
      ArrayList <Aluno> array = this.listaAluno;
      
       for(int i = 0; i < array.size(); i++){
           array.get(i).printAluno();
       }
  }
  
public void addAluno(String matricula, String disciplina, String nota, String cargaHoraria, String codigoCurso){ //Metodo criado para diminuir a repetição de alunos.

       ArrayList <Aluno> array = this.listaAluno;

       for(int i = 0; i < array.size(); i++){
            if(array.get(i).getMatricula().equals(matricula)){

                array.get(i).addDisciplina(disciplina, nota, cargaHoraria, codigoCurso);
                return;
            }
       }

       this.listaAluno.add(new Aluno(matricula, disciplina, nota, cargaHoraria, codigoCurso));
    }

public void calculoAluno (){ 
    ArrayList <Aluno> array = this.listaAluno;
    for(int i = 0; i < array.size(); i++){
        array.get(i).calculaCR();
    }
}


}
    
   
      


