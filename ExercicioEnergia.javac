public class ContaEnergia{
    private String NomeCliente;
    private int Consumo;

public ContaEnergia(String NomeCliente, int Consumo){
    this.NomeCliente = NomeCliente;
    this.Consumo = Consumo;
}

public String getNomeCliente(){
    return NomeCliente;
}

public void setNome (String NomeCliente){
    this.NomeCliente = NomeCliente;
}

public int getConsumo(){
    return Consumo;
}

public void setConsumo (int Consumo){
    this.Consumo = Consumo;
}


public double CalcConta(){
    if (Consumo <= 50){
        return 10.00;
    }
   
    else if  (Consumo <= 100){
        return (10.00 + ((Consumo - 50) * 0.20));
    }
   
    else if (Consumo <=200){
        return (10.00 + ((100-50)*0.20) + ((Consumo - 100) * 0.25));
    }
   
    else {
        return (10.00 + ((100-50)*0.20) + (100 * 0.25)+ ((Consumo - 200) * 0.35));
}
}

public static void main (String [] args){
    ContaEnergia ce = new ContaEnergia("Paulo Nascimento", 60);
    System.out.println (ce.getNomeCliente());
    System.out.println (ce.getConsumo());
    System.out.println (ce.CalcConta());
}
}
