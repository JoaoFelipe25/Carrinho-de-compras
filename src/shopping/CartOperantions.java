package shopping;

public abstract class CartOperantions {

    Double totalPrice = 0.0;
    Integer totalItems = 0;

    public abstract void getCartTotalPrice();

    public void orderCartDesc(){}

    public void orderCartAsc(){}
        
    public void listCartPrices(){}
    
    public void itemsAccount(){}
    
}
