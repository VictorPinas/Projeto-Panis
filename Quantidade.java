public class Quantidade{
  public boolean pedido;
  public int quantidade = 0;
  public Tempo tempo;
  
  // construtores
  public Quantidade(){
    Tempo tempo = new Tempo("32", "3");
  }
  public Quantidade(Tempo t){
    tempo = t;
  }
  public Quantidade(boolean pd, int qtia, Tempo tempo){
    // recebe o tempo em minutos e segundos declarado em Tempo
    pd = pedido;
    qtia = quantidade;
  }
  
  //Um método para processar o pedido
  public void processar(String m,String s){
    tempo.m = m;
    tempo.s = s;
  }
  
  //Um método para "receber" a quantia
  public int getQtia(){
    return pd = qtia;
  }
  
}