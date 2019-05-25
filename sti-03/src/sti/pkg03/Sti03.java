
package sti.pkg03;

import java.io.IOException;

/**
 *
 * @author camila
 */
public class Sti03 {
    
    private static final String ARQ ="notas.csv"; //String do arquivo a ser lido.
    
    public static void main(String[] args) throws IOException{ //Sem tratamento de erro.
        //Parametros da funcao
        ListaAluno aluno = new ListaAluno();
        ListaMateria disciplina = new ListaMateria();
        Arquivo arq = new Arquivo();
        arq.read(aluno, disciplina, ARQ); //(leitura do arquivo)
        aluno.calculoAluno();
        disciplina.calculoCurso();
        aluno.ImprimeLista();
        disciplina.ImprimeLista();
        //aluno.ImprimeTeste();
        //disciplina.ImprimeTeste();
        
        
    }
    
}