abstract class Empregado{
    private String nome;
    private String cpf;
    private double vencimento;
    
    public Empregado (String nome, String cpf, double vencimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.vencimento = vencimento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public double getVencimento() {
        return vencimento;
    }
    
    public abstract double calcularSalario();
    
   
}
    
class Mensalista extends Empregado{
    private double salario;
    public Mensalista (String nome, String cpf, double salario, double vencimento){
        super(nome, cpf, vencimento);
        this.salario = salario;
    }

    public double calcularSalario(){
        return getVencimento();
    }

}


class Comissionado extends Empregado{

    private double totalVenda;
      private double taxaComissao;
    public Comissionado (String nome, String cpf, double salario, double totalVenda, double taxaComissao){
        super(nome, cpf, salario);
          this.totalVenda = totalVenda;
          this.taxaComissao = taxaComissao;
    }
    
    public double calcularSalario(){
        return (taxaComissao * totalVenda);
    }
}



class Horista extends Empregado{
    private double precoHora;
      private double horasTrabalhadas;
    public Horista (String nome, String cpf, double salario, double precoHora, double horasTrabalhadas){
        super(nome, cpf, salario);
          this.precoHora = precoHora;
          this.horasTrabalhadas = horasTrabalhadas;
    }
    
    public double calcularSalario(){
        return  (precoHora * horasTrabalhadas);
    }

}



public class Main{


    public static void main (String [] args){
        Empregado e  = new Horista("Maria", "12898005452", 1.000, 15, 160);
        System.out.println("O salário do funcionário horista será: " + e.calcularSalario());

        Mensalista m  = new Mensalista("João", "67823409814", 3000, 3000);
        System.out.println("O salário do funcionário mensalista será:: " + m.calcularSalario());
        
        Comissionado c = new Comissionado("Pedro", "67809854334", 50, 100, 10);
        System.out.println("O salário do funcionário comissionado será:: " + c.calcularSalario());

}
}
