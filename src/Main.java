public class Main {
    public static void main(String[] args) {
        Product smartProd1 = new Product(1, "Helio 2", 21_000, "Смартфон");
        Product smartProd2 = new Product(5, "Huawei Mate", 37_000, "Планшет");
        Product smartProd3 = new Product(7, "Samsung SW", 17_000, "Смарт часы");
        Product smartProd4 = new Product(3, "iPhone 17 Pro", 98_000, "Смартфон");
        Product smartProd5 = new Product(11, "LG h320", 82_000, "Телевизор");
        Product smartProd6 = new Product(1, "Huawei P60", 60_500, "Смартфон");
        System.out.println(smartProd1);
        System.out.println(smartProd2);
        System.out.println(smartProd3);
        System.out.println(smartProd4);
        System.out.println(smartProd5);
        System.out.println(smartProd6);
        //Compare products
        System.out.println("Compare products 1 and 4:" + smartProd1.equals(smartProd4));
        System.out.println("Compare products 1 and 6:" + smartProd1.equals(smartProd6));
        //Fill basket
        Product[] products1 = {smartProd1, smartProd3, smartProd2};
        Product[] products2 = {smartProd2, smartProd4, smartProd1};
        Product[] products3 = {smartProd3, smartProd5};
        Product[] products4 = {smartProd2, smartProd4, smartProd1};
        Product[] products5 = {smartProd2, smartProd4, smartProd1};
        Order order1 = new Order("John", products1);
        Order order2 = new Order("Jack", products2);
        Order order3 = new Order("John", products3);
        Order order4 = new Order("Jack", products4);
        Order order5 = new Order("Sam", products5);
        //Print out and compare
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);
        System.out.println(order4);
        System.out.println(order5);
        System.out.println("Baskets compare 1 and 2:" + order1.equals(order2));
        System.out.println("Baskets compare 1 and 3:" + order1.equals(order3));
        System.out.println("Baskets compare 2 and 4:" + order2.equals(order4));
        System.out.println("Baskets compare 2 and 5:" + order2.equals(order5));
    }
}