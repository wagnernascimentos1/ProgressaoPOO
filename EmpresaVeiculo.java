import java.util.HashSet;
import java.util.Set;

public interface Veiculo{
   
  public void AcelerarVeiculo{
      (Velocidade + 10)
  }
  
  public void FreiarVeiculo{
      Velocidade - 10
  }
   
}

public abstract class Automovel{
    private int Velocidade;
    private String Descricao;
    private int Ano;
    private String Placa;
    private int Potencia;
    private float Valor;

public Automovel(int Velocidade, String Descricao, int Ano, String Placa, float Valor){
    this.Velocidade = 0;
    this.Descricao = descricao;
    this.Ano = ano;
    this.PLaca = placa;
    this.Valor = valor;
}
}

public class Moto extends Automovel{
    private String potencia;
    
public Moto(int Velocidade, String Descricao, int Ano, String Placa, float Valor, String potencia){
    super(Velocidade, Descricao, Ano, Placa, Valor);
    this.Potencia = potencia;
}
}
    
}
