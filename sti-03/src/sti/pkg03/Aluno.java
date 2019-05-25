package sti.pkg03;
import java.util.*;

/**
 *
 * @author camila
 */
public class Aluno {
   //Atributos
   private String matricula; 
   private ArrayList <String> disciplinas; //Vetor que guarda as disciplinas do aluno.
   private ArrayList <String> notas; // Vetor que guarda as notas do aluno.
   private ArrayList <String> cargahoraria; //Vetor que guarda a ch do aluno.
   private ArrayList <String> codigocurso;
   private int crAluno = 0;
   private int chAluno = 0;

   
   public Aluno (String matricula, String codDisciplina, String nota, String cargaHoraria, String codigoCurso){
       this.matricula = matricula;
       
       this.disciplinas = new ArrayList <String>(); //Instanciando um Array de disciplinas.  
       disciplinas.add(codDisciplina); //Adicionando o cod atual a lista.
       
       this.notas = new ArrayList <String>();  //Instanciando um Array de notas.
       notas.add(nota); //Adicionando a nota atual a lista;
       
       this.cargahoraria= new ArrayList<String>();
       cargahoraria.add(cargaHoraria);
       
       this.codigocurso = new ArrayList<String>();
       codigocurso.add(codigoCurso);
   }
    public void printAluno(){ //metodo usado na impressão de teste.

        System.out.println(getMatricula());
        System.out.println(getDisciplinas());
        System.out.println(getNotas());
        System.out.println(getCargaHoraria());
        System.out.println(getCodigoCurso());
   }
    
    public void addDisciplina(String disciplina, String nota, String cargaHoraria, String codigoCurso){

        this.disciplinas.add(disciplina);
        this.notas.add(nota);
        this.cargahoraria.add(cargaHoraria);
        this.codigocurso.add(codigoCurso);

   }
   
    public void calculaCR(){
        int ch = calculaCH();
        int acumulador = 0;
        ArrayList<String> arrayN= this.notas;
        ArrayList<String> arrayCH= this.cargahoraria;
        
        for (int i=0; i < arrayN.size(); i++){
            
            acumulador += Integer.parseInt(arrayN.get(i)) * Integer.parseInt(arrayCH.get(i));
            
        }
        
        crAluno = (acumulador/ch);
    }
    
    public int calculaCH(){
        int acumulador = 0;
        ArrayList <String> array = this.cargahoraria;
        for(int i=0; i < array.size(); i++){
            acumulador += Integer.parseInt(array.get(i));
        }
        this.chAluno = acumulador;
        
        return acumulador;
    }
    
    
    //Metodos Acessores.
    public String getMatricula (){
      return this.matricula; 
   }
    public void setMatricula (String matricula){
      this.matricula = matricula; 
   }
   public ArrayList <String> getDisciplinas(){
        return this.disciplinas;
      }
    public void setDisciplinas(ArrayList <String> array){
        this.disciplinas = array;
    }
    public ArrayList <String> getNotas(){
        return this.notas;
      }
    public void setNotas(ArrayList <String> array){
        this.notas = array;
    }
    public ArrayList <String> getCargaHoraria(){
        return this.cargahoraria;
      }
    public void setCargaHoraria(ArrayList <String> array){
        this.cargahoraria = array;
    }    
    public ArrayList <String> getCodigoCurso(){
        return this.codigocurso;
      }
    public void setCodigoCurso(ArrayList <String> array){
        this.codigocurso = array;
    }
    
    public int getCr(){
        return crAluno;
    }
    public int setCr(){
        return this.crAluno;
    }
    
    public int getchAluno(){
        return chAluno;
    }
    public int setchAluno(){
        return this.chAluno;
    }

}