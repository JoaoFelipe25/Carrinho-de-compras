package shopping;

import java.util.ArrayList;
import java.util.List;

public class Products {
    
    // lista de produtos - estoque
    private List<Product> products = new ArrayList<Product>();

    //construtor da classe que chama o metodo de carregar a lista de produtos - estoque
    public Products() {
        this.storeItems();
    }

    //lsta de produtos em estoque
    public List<Product>getProducts() {
        return products;
    }

    //metodo para armazenamento inicial dos produtos em estoque
    private void storeItems() {

        this.products.add(new Product(products.size(), "Perfume ","boticario ", "cheiroso ", 100.00,10.00));
        this.products.add(new Product(products.size(), "Sabonete ","boticario ", "cheiroso demais ", 10.00,10.00));
        this.products.add(new Product(products.size(), "Oleo Mineral ","boticario ", " bem cheiroso ", 30.00,10.00));
        this.products.add(new Product(products.size(), "Shampoo ","boticario ", "bom ", 100.00,100.00));
        this.products.add(new Product(products.size(), "Desodorante ","boticario ", "cheiro bom ", 20.00,10.00));
        this.products.add(new Product(products.size(), "Creme de mao ","boticario ", "barato", 30.00,10.00));
        this.products.add(new Product(products.size(), "Batom ","boticario ", "bonito ", 50.00,10.00));
    }
    
}
