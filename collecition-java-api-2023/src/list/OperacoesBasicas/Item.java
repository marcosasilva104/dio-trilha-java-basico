package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class Item {

    List<CarrinhoDeCompras> itensCompra;

    public Item() {
        this.itensCompra = new ArrayList<>();
    }

    public void  adicionarItem(String nome, double preco, int quantidade){
        itensCompra.add(new CarrinhoDeCompras(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<CarrinhoDeCompras> itensComprasRemover = new ArrayList<>();
        if(!itensCompra.isEmpty()){
            for (CarrinhoDeCompras i : itensCompra) {
                if(i.getNome().equalsIgnoreCase(nome)){
                    itensComprasRemover.add(i);
                }
            }
            itensCompra.removeAll(itensComprasRemover);
        }else{
            System.out.println("A lista está vazia");
        }
    }

    public double calcularValorTotal(){
        double valorTotal = 0d;
        if (!itensCompra.isEmpty()){
            for (CarrinhoDeCompras i : itensCompra) {
                valorTotal += i.getPreco() * i.getQuantidade(); 
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirItens(){
        if (!itensCompra.isEmpty()){
            System.out.println(itensCompra.toString());
        }else{
            System.out.println("A lista esta vazia");
        }
    }

    
    @Override
    public String toString() {
        return "Item [itensCompra=" + itensCompra + "]";
    }

    public static void main(String[] args) {
       Item carrinhoCompras = new Item();

       carrinhoCompras.adicionarItem("Caneta", 1.50, 5);
       carrinhoCompras.adicionarItem("Camisa", 40.50, 10);
       carrinhoCompras.adicionarItem("Camisa", 40.50, 5);
    
       carrinhoCompras.removerItem("Camisa");

       carrinhoCompras.exibirItens();

       System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());
       System.out.println(carrinhoCompras.toString());
    }
}
