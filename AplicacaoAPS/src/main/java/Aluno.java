public class Aluno {
    private String Nome;
    private String Endereco;
    private String Matricula;
    private String Serie;
    private String Responsavel;
    private String Boletim;
    
public Aluno(String Nome, String Endereco, String Matricula, String Serie, String Responsavel, String Boletim){
    this.Nome =  Nome;
    this.Endereco = Endereco;
    this.Matricula = Matricula;
    this.Serie = Serie;
    this.Responsavel = Responsavel;
    this.Boletim = Boletim;
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

public String getMatricula() {
    return Matricula;
}

public void setMatricula (String Matricula){
    this.Matricula = Matricula;
}

public String getSerie() {
    return Serie;
}

public void setSerie (String Serie){
    this.Serie = Serie;
}

public String getResponsavel() {
    return Responsavel;
}

public void setResponsavel (String Responsavel){
    this.Responsavel = Responsavel;
}

public String getBoletim() {
    return Boletim;
}

public void setBoletim (String Boletim){
    this.Boletim = Boletim;
}

}
