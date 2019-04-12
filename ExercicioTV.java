public class Tv{
    private int Volume;
    private int Canal;
    private boolean Ligado;
   
public Tv(int Volume, int Canal, boolean Ligado){
    this.Volume = Volume;
    this.Canal = Canal;
    this.Ligado = Ligado;
}
   
public int getVolume(){
    return Volume;
}

public void aumentarVolume(){
    Volume++;
}

public void diminuirVolume(){
    Volume--;
}

public int getCanal(){
    return Canal;
}

public void setCanal (int Canal){
    this.Canal = Canal;
}

public boolean getLigado(){
    return Ligado;
}

public void ligarLigado (){
    this.Ligado = true;
}

public void desligarLigado (){
    this.Ligado = false;
}

public static void main (String [] args){
    Tv t = new Tv(22,245,false);
    System.out.println (t.getVolume());
    System.out.println (t.getCanal());
    System.out.println (t.getLigado());
}
}
