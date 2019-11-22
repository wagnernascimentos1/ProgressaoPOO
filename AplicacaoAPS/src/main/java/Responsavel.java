public class Responsavel {
    private String Nome;
    private String RespAluno;

public Responsavel(String Nome, String RespAluno){
    this.Nome =  Nome;
    this.RespAluno = RespAluno;
}

public String getNome() {
        return Nome;
    }
    
public void setNome (String Nome){
    this.Nome = Nome;
}

public String getRespAluno() {
    return RespAluno;
}

public void setRespAluno (String RespAluno){
    this.RespAluno = RespAluno;
}
}
