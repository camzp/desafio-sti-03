package sti.pkg03;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Arquivo {
      
    public void createAluno (ListaAluno aluno, CSVRecord csvRecord, String mat, String dis, String nota, String ch, String cc){
        aluno.addAluno(mat, dis, nota, ch, cc); //adicionando o meu aluno a minha listagem de alunos.
    }
    
    public void createCurso (ListaMateria materia, CSVRecord csvRecord,String cc,String ch, String nota){
        materia.addMateria(cc, ch, nota); //adicionando o curso a minha listagem de matéroas.
    }

    
    public void read(ListaAluno aluno, ListaMateria materia, String CSV_FILE_PATH) throws IOException {
        try (
            Reader reader = Files.newBufferedReader(Paths.get(CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim());
        ){
            for (CSVRecord csvRecord : csvParser) {
                // Accessing Values by Column Index

                String n = csvRecord.get("NOTA");
                String c = csvRecord.get("COD_DISCIPLINA");
                String m = csvRecord.get("MATRICULA");
                String cc = csvRecord.get("COD_CURSO");
                String ch = csvRecord.get("CARGA_HORARIA");

                
                createAluno (aluno, csvRecord, m, c, n, ch, cc);
                createCurso (materia,csvRecord, cc, ch, n);
            }
        }
    }
}
