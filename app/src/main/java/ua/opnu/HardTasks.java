package ua.opnu;

import ua.opnu.util.Customer;
import ua.opnu.util.DataProvider;
import ua.opnu.util.Order;
import ua.opnu.util.Product;

import java.util.*;

public class HardTasks {

    private final List<Customer> customers = DataProvider.customers;
    private final List<Order> orders = DataProvider.orders;
    private final List<Product> products = DataProvider.products;

    public static void main(String[] args) {
        HardTasks tasks = new HardTasks();

        // Для того, щоб побачити в консолі результат роботи методу, разкоментуйте відповідний рядок коду

        // Завдання 1
        Objects.requireNonNull(tasks.getBooksWithPrice(),"Method getBooksWithPrice() returns null").forEach(System.out::println);

        // Завдання 2
        Objects.requireNonNull(tasks.getOrdersWithBabyProducts(),"Method getOrdersWithBabyProducts() returns null").forEach(System.out::println);

        // Завдання 3
        Objects.requireNonNull(tasks.applyDiscountToToys(),"Method applyDiscountToToys() returns null").forEach(System.out::println);

        // Завдання 4
        System.out.println(Objects.requireNonNull(tasks.getCheapestBook(),"Method getCheapestBook() returns null").get());

        // Завдання 5
        // Objects.requireNonNull(tasks.getRecentOrders(),"Method getRecentOrders() returns null").forEach(System.out::println);

        // Завдання 6
        // DoubleSummaryStatistics statistics = Objects.requireNonNull(tasks.getBooksStats(), "Method getBooksStats() returns null");
        // System.out.printf("count = %1$d, average = %2$f, max = %3$f, min = %4$f, sum = %5$f%n", statistics.getCount(), statistics.getAverage(), statistics.getMax(), statistics.getMin(), statistics.getSum());

        // Завдання 7
        // Objects.requireNonNull(tasks.getOrdersProductsMap(),"Method getOrdersProductsMap() returns null").forEach((id, size) -> System.out.printf("%1$d : %2$d\n", id, size));

        // Завдання 8
        // Objects.requireNonNull(tasks.getProductsByCategory(), "Method getProductsByCategory() returns null").forEach((name, list) -> System.out.printf("%1$s : %2$s\n", name, Arrays.toString(list.toArray())));
    }

    public List<Product> getBooksWithPrice() {
        return products.stream().filter(s -> s.getCategory().equals("Books")).filter(s-> s.getPrice() > 100).toList();
    }

    public List<Order> getOrdersWithBabyProducts() {

        return orders.stream().filter(order -> order.getProducts().stream().anyMatch(p -> p.getCategory().equals("Baby")))
                .sorted(Comparator.comparing(Order::getId))
                .toList();
    }

    public List<Product> applyDiscountToToys() {

        return products.stream().filter(p -> p.getCategory().equals("Toys")).peek(p -> p.setPrice(p.getPrice() * 0.5)) // знижка 50%
                .sorted(Comparator.comparing(Product::getId))
                .toList();
    }

    public Optional<Product> getCheapestBook() {

        return products.stream().filter(p -> p.getCategory().equals("Books")).min(Comparator.comparing(Product::getPrice));
    }

    public List<Order> getRecentOrders() {

        // id замовлень 23, 30, 33

        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

    public DoubleSummaryStatistics getBooksStats() {

        // count = 5, average = 607.880000, max = 893.440000, min = 240.580000, sum = 3039.400000

        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

    public Map<Integer, Integer> getOrdersProductsMap() {

        // region Вірна відповідь
        // 1 : 3
        // 2 : 4
        // 3 : 5
        // 4 : 3
        // 5 : 1
        // 6 : 2
        // 7 : 6
        // 8 : 2
        // 9 : 1
        // 10 : 2
        // 11 : 6
        // 12 : 4
        // 13 : 4
        // 14 : 1
        // 15 : 3
        // 16 : 6
        // 17 : 2
        // 18 : 4
        // 19 : 6
        // 20 : 1
        // 21 : 2
        // 22 : 2
        // 23 : 4
        // 24 : 5
        // 25 : 5
        // 26 : 1
        // 27 : 3
        // 28 : 2
        // 29 : 1
        // 30 : 3
        // 31 : 3
        // 32 : 2
        // 33 : 6
        // 34 : 6
        // 35 : 4
        // 36 : 2
        // 37 : 2
        // 38 : 5
        // 39 : 2
        // 40 : 5
        // 41 : 6
        // 42 : 1
        // 43 : 1
        // 44 : 6
        // 45 : 4
        // 46 : 5
        // 47 : 4
        // 48 : 6
        // 49 : 6
        // 50 : 2
        // endregion

        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

    public Map<String, List<Integer>> getProductsByCategory() {

        // region Вірна відповідь
        // Grocery : [3, 12, 14, 23, 25]
        // Toys : [2, 4, 6, 11, 13, 21, 26, 27, 28, 29, 30]
        // Games : [1, 5, 19]
        // Baby : [8, 10, 15, 18, 20, 22]
        // Books : [7, 9, 16, 17, 24]
        // endregion

        // TODO: напишіть вміст методу згідно умовам для того, щоб пройти тести
        return null;
    }

}
