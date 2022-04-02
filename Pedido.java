public class Pedido{
  /*O pedido possui qual cliente
  * e a quantidade de pães,
  * o horário de entrega,
  * um crônometro de quanto
  * tempo os pães ficarão prontos,
  * 
  */
  public int quantidade;
  public int tempo;
  public Cliente pedido;
  
  // Construtores
  public Pedido(){
    pedido = new Cliente(0,0);
  }
  public Pedido(Cliente p){
    cliente = p;
  }
  public Pedido(pedido, tempo){
    
  }
  public Pedido(pedido, quantidade, tempo){
    
  }
  
  //um método para entrega do pedido
  public void entrega(int quantidade, tempo, entrega){
    cliente.pedido = p;
  }
  
  //um método para calcular o tempo
  public int getTempo(){
    // preciso criar um código especifico para isso
    // não é tão simples quanto calcular uma área
  }
}