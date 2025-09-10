import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Item {
    String name;
    String category;
    double price;

    Item(String name, String category, double price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() { return name; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class Order {
    LocalDate orderDate;
    List<Item> items;

    Order(LocalDate orderDate, List<Item> items) {
        this.orderDate = orderDate;
        this.items = items;
    }

    public LocalDate getOrderDate() { return orderDate; }
    public List<Item> getItems() { return items; }
}

class Store {
    Map<String, List<Order>> customerToOrders = new HashMap<>();
}

public class SalesDashboard {
    public static void main(String[] args) {
        Item laptop = new Item("Laptop", "Electronics", 1200);
        Item phone = new Item("Phone", "Electronics", 800);
        Item blender = new Item("Blender", "Home Appliances", 150);
        Item treadmill = new Item("Treadmill", "Fitness", 700);
        Item book = new Item("Book", "Stationery", 20);

        Order recentOrder1 = new Order(LocalDate.now().minusDays(10), Arrays.asList(laptop, phone));
        Order recentOrder2 = new Order(LocalDate.now().minusDays(20), Arrays.asList(blender));
        Order recentOrder3 = new Order(LocalDate.now().minusDays(30), Arrays.asList(treadmill, book));

        Store store1 = new Store();
        store1.customerToOrders.put("Alice", Arrays.asList(recentOrder1, recentOrder2, recentOrder3));

        Store store2 = new Store();
        store2.customerToOrders.put("Bob", Arrays.asList(recentOrder1, recentOrder3));

        Map<String, List<Store>> cityToStoresMap = new HashMap<>();
        cityToStoresMap.put("New York", Arrays.asList(store1, store2));
        LocalDate cutoff = LocalDate.now().minusDays(60);

        List<Item> topAffordablePicks = cityToStoresMap.values().stream()
            .flatMap(List::stream) // all stores
            .flatMap(store -> store.customerToOrders.entrySet().stream())
            .filter(entry -> entry.getValue().stream().filter(o -> o.getOrderDate().isAfter(cutoff)).count() >= 3) // customers with >=3 orders
            .flatMap(entry -> entry.getValue().stream().flatMap(order -> order.getItems().stream())) // flatten orders → items
            .collect(Collectors.collectingAndThen(
                Collectors.toMap(Item::getName, i -> i, (i1, i2) -> i1), // remove duplicates by name
                m -> m.values().stream()
                        .sorted(Comparator.comparingDouble(Item::getPrice).reversed())
                        .peek(item -> System.out.println("Logging item: " + item))
                        .skip(2)
                        .limit(10)
                        .collect(Collectors.toList())
            ));
        Map<String, List<Item>> groupedByCategory =
            topAffordablePicks.stream().collect(Collectors.groupingBy(Item::getCategory));
        long electronicsCount = groupedByCategory.getOrDefault("Electronics", List.of()).size();
        boolean anyOver500 = topAffordablePicks.stream().anyMatch(i -> i.getPrice() > 500);
        boolean allAbove10 = topAffordablePicks.stream().allMatch(i -> i.getPrice() > 10);
        boolean noneEmptyName = topAffordablePicks.stream().noneMatch(i -> i.getName() == null || i.getName().isEmpty());
        Optional<Item> firstHomeAppliance = topAffordablePicks.stream()
            .filter(i -> "Home Appliances".equals(i.getCategory()))
            .findFirst();

        Optional<Item> anyFitness = topAffordablePicks.stream()
            .filter(i -> "Fitness".equals(i.getCategory()))
            .findAny();
        double totalValue = topAffordablePicks.stream()
            .map(Item::getPrice)
            .reduce(0.0, Double::sum);
        System.out.println("\nTop Affordable Picks: " + topAffordablePicks);
        System.out.println("Grouped by Category: " + groupedByCategory);
        System.out.println("Electronics count: " + electronicsCount);
        System.out.println("Any item over $500? " + anyOver500);
        System.out.println("All items above $10? " + allAbove10);
        System.out.println("No empty item names? " + noneEmptyName);
        System.out.println("First Home Appliance: " + firstHomeAppliance);
        System.out.println("Any Fitness item: " + anyFitness);
        System.out.println("Total Value of Picks: $" + totalValue);
    }
}