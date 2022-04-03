public class Pedido{
  /*O pedido possui qual cliente
  * e a quantidade de pães,
  * o horário de entrega,
  * um crônometro de quanto
  * tempo os pães ficarão prontos,
  * 
  */
  public int quantidade;
  public long tempo;
  public Cliente pedido;
  
  // Construtores
  public Pedido(){
    entrega = new Cliente(0,0);
  }
  public Pedido(Cliente c){
    entrega = c;
  }
  public Pedido(int tia, long tp){
    entrega = new Cliente(0,0);
    quantidade = qtia;
    tempo = tp;
  }
  public Pedido(Cliente c, int qtia, long tp){
    entrega = c;
    quantidade = qtia;
    tempo = tp;
  }
  
  //um método para entrega do pedido
  public void entrega(int qtia, long tp){
    entrega.qtia = qtia;
    entrega.tp = tp;
  }
  
  //um método para calcular o tempo
  public /*Qual tipo?*/ getEnvio(){
    return entrega;
  }
}