import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество товаров: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Товар " + (i + 1) + ":");
            System.out.print("Наименование: ");
            String name = scanner.next();
            System.out.print("Сорт: ");
            String sort = scanner.next();
            System.out.print("Цена: ");
            double price = scanner.nextDouble();

            Product product = new Product(name, sort, price);
            products.add(product);
        }

        System.out.print("Введите сорт товара: ");
        String desiredSort = scanner.next();

        double minPrice = Double.MAX_VALUE;
        List<Product> result = new ArrayList<>();

        for (Product product : products) {
            if (product.getSort().equals(desiredSort)) {
                double price = product.getPrice();
                if (price < minPrice) {
                    minPrice = price;
                    result.clear();
                }
                if (price == minPrice) {
                    result.add(product);
                }
            }
        }

        System.out.println("Товары с наименьшей ценой и сортом '" + desiredSort + "':");
        for (Product product : result) {
            System.out.println(product.getName());
        }
    }
}

class Product {
    private String name;
    private String sort;
    private double price;

    public Product(String name, String sort, double price) {
        this.name = name;
        this.sort = sort;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSort() {
        return sort;
    }

    public double getPrice() {
        return price;
    }
}
