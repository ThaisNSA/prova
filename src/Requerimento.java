
public class Requerimento {

    Data dataRequerimento;
    Aluno aluno;
    String descricao;
    
    
    void mostrar(){
    System.out.println("Data do requerimento: "+dataRequerimento.dia+"/"+dataRequerimento.mes+"/"+dataRequerimento.ano);
    aluno.mostrar();
    
    }
    
    void informarTipo(String s){
       descricao=s; 
       System.out.println("Descricao: "+descricao);
    }

    
}
