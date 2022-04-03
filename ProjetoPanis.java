public class ProjetoPanis{
  public static void main(String[] args){
  
  //Declara e cria um objeto cliente e pedido
  Cliente pedidoCliente = new Cliente(0,0);
  Pedido = new Pedido(pedidoCliente);
  
  //Mostre ao cliente e quantos pães ele pediu
  System.out.println("Olá, você pediu " + pedido.quantidade);
  System.out.println("Pedido recebido: " + getEnvio());
  
  //Mostre em quanto tempo os pães ficarão prontos
  System.out.println("Esse é o tempo que levará para os pães ficarem prontos, por favor aguarde." + entrega.tp);
  System.out.println("Essa foi a quantia de pães que você pediu: " + entrega.qtia);
  
  //configurar pedido
  entrega.pedido = clientePedido;
  
  //realizar entrega
  clientePedido.entrega(0,0);
  System.out.println("Esse é o tempo que levará para os pães ficarem prontos, por favor aguarde." + entrega.tp);
  System.out.println("Essa foi a quantia de pães que você pediu: " + entrega.qtia);
  
  }
}