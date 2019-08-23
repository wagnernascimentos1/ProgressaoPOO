abstract class Frete{
    private double distancia;
    private double valorPorKm;
    
    public Frete (Double distancia, double valorPorKm) {
        this.distanciakm = distanciakm;
        this.valorkm = valorPorKm;
    }
    
    public Double getDistancia() {
        return distancia;
    }
    
    public Double getValorPorKm() {
        return valorPorKm;
    }


    public abstract double calcularFrete();
    
   
}
    
class FretePadrao extends Frete{
    
    public FretePadrao(Double distancia, double valorPorKm){
        super(distancia, valorPorKm);
    }

    public double calcularFrete(){
        return getDistancia * getValorPorKm();
    }

}


class FreteExpresso extends Frete{

    private double nivelUrgencia;
    public FreteExpresso (Double nivelUrgencia, double distancia, double valorPorKm ){
        super(distancia, valorPorKm);
          this.nivelUrgencia = nivelUrgencia;
    }
    
    public double calcularFrete(){
        return (getDistancia * getValorPorKm) + (nívelUrgencia * 100);
    }
}



class FreteSuperExpresso extends FreteExpresso{
    private double valorDoSeguro;
    
    public FreteSuperExpresso(Double nivelUrgencia, double distancia, double valorPorKm, double valorDoSeguro){
        super(nivelUrgencia, distancia, valorPorKm);
          this.valorDoSeguro = valorDoSeguro;
    }
    
    public double calcularFrete(){
        return  (distancia * valorPorKm) + (nívelUrgencia * 100) + valorDoSeguro;;
    }

}

class CadastroFrete  {
  private int qtd;
  private  frete[] Fretes;
  public CadastroFrete(int qtd){
    this.qtd = 0;
    this.Fretes = new frete[qtd]; 
  }
  public boolean addFrete( frete f){
    if (qtd <= 10) return false;
    
      this.Fretes[qtd++] = f;
      return true;
    
  }

  public double calcularFrete(){
    double total = 0;
    for (int i = 0; i < Fretes.length; ++i){
     if (Fretes[i] != null) {
       total = total + Fretes[i].calcularFrete();
     }
    }

    return total;

}
}

public class Main{
  public static void main(String []args){
    
  }
}
