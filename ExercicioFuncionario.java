class Funcionario{
    private int Codigo;
    private String Nome;
    private String CPF;
    private String Endereco;
    private String Telefone;
    private int Idade;
    private float Salario;
    private int NumDependentes;
    
public Funcionario (int codigo, String nome, String CPF, String Endereco, String Telefone, int Idade, float Salario, int NumDependentes){
    this.Codigo = codigo;
    this.Nome = nome;
    this.CPF = CPF;
    this.Endereco = Endereco;
    this.Telefone = Telefone;
    this.Idade = Idade;
    this.Salario = Salario;
    this.NumDependentes = NumDependentes;
}

public int getCodigo(){
    return Codigo;
}

public void setCodigo (int Codigo){
    this.Codigo = Codigo;
}

public String getNome(){
    return Nome;
}

public void setNome (String Nome){
    this.Nome = Nome;
}


public String getCPF(){
    return CPF;
}

public void setCPF (String CPF){
    this.CPF = CPF;
}

public String getEndereco(){
    return Endereco;
}

public void setEndereco (String Endereco){
    this.Endereco = Endereco;
}

public String getTelefone(){
    return Telefone;
}

public void setTelefone (String Telefone){
    this.Telefone = Telefone;
}

public int getIdade(){
    return Idade;
}

public void setIdade (int Idade){
    this.Idade = Idade;
}

public float getSalario(){
    return Salario;
}

public void setSalario (float Salalrio){
    this.Salario = Salario;
}

public int getNumDependentes(){
    return NumDependentes;
}

public void setNumDependentes (int NumDependentes){
    this.NumDependentes = NumDependentes;
}

public float calculaSalarioLiquido (int percent){
   return (Salario - (Salario * 0.11f) + (NumDependentes * (Salario * percent/100)));
}

}


public class Main{
    public static void main (String [] args){
    Funcionario f = new Funcionario (4002, "Francisco da Silva", "123.456.789-00", "Rua José de Almeida", "(83) 98827-4361", 24, 1996.00f, 2);
    System.out.println (f.getCodigo());
    System.out.println (f.getNome());
    System.out.println (f.getCPF());
    System.out.println (f.getEndereco());
    System.out.println (f.getTelefone());
    System.out.println (f.getIdade());
    System.out.println (f.getSalario());
    System.out.println (f.getNumDependentes());
}
}
