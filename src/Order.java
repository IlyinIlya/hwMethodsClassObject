import java.util.Arrays;
import java.util.Objects;

public class Order {
    private String customer;
    private Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return customer + " " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Order order = (Order) obj;
        boolean compare = true;
        int i = 0;
        if (basket.length != order.basket.length){
            return false;
        } else{
            for (int elem = 0; elem < basket.length; elem++){
                if (Objects.equals(basket[elem], order.basket[elem])) {
                    compare = true;
                    break;
                }
            }
        }
        return Objects.equals(customer, order.customer) && compare;
    }
}
