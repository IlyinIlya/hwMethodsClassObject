import java.util.Arrays;
import java.util.Objects;

public class Order {
    private final String customer;
    private final Product[] basket;

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

        if (!Objects.equals(customer, order.customer)) {
            return false;
        }
        if (basket == null && order.basket == null) {
            return true;
        } else if (basket == null || order.basket == null) {
            return false;
        } else if (basket.length != order.basket.length) {
            return false;
        }

        for (int elem = 0; elem < basket.length; elem++) {
            if (basket[elem] == null || order.basket[elem] == null) {
                return false;
            } else if (basket[elem] == null && order.basket[elem] == null) {
                continue;
            } else if (!basket[elem].equals(order.basket[elem])) {
                compare = false;
                break;
            }
        }
        return compare;
    }
}
