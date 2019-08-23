abstract class Forma {
    public Forma(){
    }
        public abstract double calcularArea();{
}
        public abstract double calcularPerimetro();{
    }
}
class Retangulo extends Forma {
    float base;
    float altura;
    
    public Retangulo (float base, float altura){
        this.base = base;
        this.altura = altura;
        }
        
    public double calcularArea(){
        return (base * altura);
        }
        
    public double calcularPerimetro(){
        return (2 * base) + (2 * altura);
        }
}

class Circulo extends Forma {
    float raio;
     float pi = 3.141616f;

    public Circulo (float raio){
        this.raio = raio;
        }
        
    public double calcularArea(){
        return (pi * raio * raio);
        }
        
    public double calcularPerimetro(){
        return (2 * pi * raio);
        }
}

// TIRAR DÚVIDA SOBRE A CLASSE QUADRADO
    class Quadrado extends Retangulo {
   
    public Quadrado (float base, float altura){
        super (base , altura);
    }
    
    public double calcularArea(){
        return (base * base);
        }
        
    public double calcularPerimetro(){
        return (4 * base);
        }
}

public class Principal {
    
    public static void main (String[] args){
        
        Retangulo r = new Retangulo(5 , 6);
        System.out.println("A área do retângulo mede: " + r.calcularArea());
        System.out.println("O perímetro do retângulo mede: " + r.calcularPerimetro());
        
        Circulo c = new Circulo(4);
        System.out.println("A área do círculo mede: " + c.calcularArea()); 
        System.out.println("O perímetro do círculo mede: " +  c.calcularPerimetro());
        
        Quadrado q = new Quadrado(2, 4);
        System.out.println("A área do quadrado mede: " +  q.calcularArea());
        System.out.println("O perímetro do quadrado mede: " + q.calcularPerimetro()); 
}
}
