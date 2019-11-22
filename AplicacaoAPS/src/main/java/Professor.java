public class Professor {
    private String Nome;
    private String Endereco;
    private String Disciplina;
    
public Professor(String Nome, String Endereco, String Disciplina){
    this.Nome =  Nome;
    this.Endereco = Endereco;
}

public String getNome() {
        return Nome;
    }
    
public void setNome (String Nome){
    this.Nome = Nome;
}

public String getEndereco() {
    return Endereco;
}

public void setEndereco (String Endereco){
    this.Endereco = Endereco;
}
