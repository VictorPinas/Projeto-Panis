public class Cliente{
  /*O cliente possui um cadastro
  * com nome, endereço, telefone
  * e o pedido com a quantidade de pães
  */
  
  public int quantidade = 0;
  public long tempo = 0;
  
  //construtor do cliente
  public Cliente(int paes, long espera){
    quantidade = paes;
    tempo = espera;
  }
}