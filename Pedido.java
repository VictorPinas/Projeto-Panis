interface Pedido{
  /*Interface de pedido
  * os métodos aqui definidos 
  * serão implementeados
  * por entrega
  */
  
 //Recebe pedido
 void receberPedido(boolean pedido){
   pedido = false;
 }
 
 //Computa quantidade de pães
 void calcularQuantia(int quantia);
 
 //Tempo de entrega
 //Definir método de cálculo
 void calcularTempo();
 
 //Confirmação de recebimentos
 void recebimentoPaes();
}