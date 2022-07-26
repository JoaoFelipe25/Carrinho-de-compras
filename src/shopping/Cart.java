package shopping;

import java.util.ArrayList;
import java.util.List;

public class Cart extends CartOperantions{
    
    List<Product> cartItems = new ArrayList<Product>();

    //1 - add products
    //2 - remove products
    //3 - get product by id
    //4 - list products

    //buscar um produto cadastrado e adicionar na coleçao de produtos do carrinho
    public void addProduct(Integer id) {

        Product product = getProductById(id);
        addToCart(product);
    }

    // carro de itens vai adicionar o produto
    //adicionando um produto na coleçao
    private void addToCart(Product product) {

        cartItems.add(product);
    }

    //remover item do carrinho
    public void removeProduct(Integer id) {

        Product product = getProductById(id);
        cartItems.remove(product);
    }

    //metodo para buscar um produto no cadastrado no estoque
    private Product getProductById(Integer id) {

        //produto em estoque que sera adicionado ao carrinho
        Product product = null;

        //Lista de produtos em estoque
        List<Product> products = new Products().getProducts();

        //procurando um elemento no estoque com base no id
        for (Product prod : products) {
            
            if (prod.getId() == id) {
                //produto encontrado
                product = prod;
            }
        }

        return product;

    }

    //exibir o carrinho
    public void printCart(){

        for(Product product : cartItems){

            System.out.println("Nome do produto: " + product.getName());
            System.out.println("Marca do produto: " + product.getBrand());
            System.out.println("Descrição do produto: " + product.getDescription());
            System.out.println("Preço do produto: " + product.getPrice());
            
        }
    }

    @Override
    public void getCartTotalPrice() {
        
         //Stream reduce() que retorna a soma dos preços dos produtos no carrinho
        Double totalPrice = cartItems.stream()
        .map(cartItem -> cartItem.getPrice())
        .reduce(0.0, (subtotal, cartItem) -> subtotal + cartItem);

        System.out.println(totalPrice);

    }

   

    @Override
    public void listCartPrices() {
        List<Double> cartPrices = cartItems.stream().map(cartItems -> cartItems.getPrice()).toList();
        cartPrices.stream().forEach(cartPrice -> System.out.println(cartPrice));
    }

        
    @Override
    public void itemsAccount() {
       
        Long itemsQt = cartItems.stream().count();
        System.out.println(itemsQt);
    }
        
    
}
