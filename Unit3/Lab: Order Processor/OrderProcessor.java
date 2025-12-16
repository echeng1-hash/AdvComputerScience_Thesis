public class OrderProcessor {
    // Main Method
    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();
            double itemTotal = calculateItemTotal(item);
            subtotal += itemTotal;
            boolean premium = isPremiumItem(item);
            if (premium) {
                premiumCount = addPremiumItemName(premiumTemp, premiumCount, item.getName());
            }
        }
        String[] premiumItems = trimPremiumItems(premiumTemp, premiumCount);
        double tax = calculateTax(subtotal, taxRate);
        double total = calculateTotal(subtotal, tax);
        orderSummary(subtotal, tax, total, premiumCount);
        return new OrderSummary(total, subtotal, tax, premiumItems);
    }

    // Helper methods
    public static double calculateItemTotal(double price, int quantity) {
        return item.getPrice() * item.getQuantity();
    }

    // premium if price > 50
    private static boolean isPremiumItem(Item item) {
        return item.getPrice() > 50.0;
    }

    // prints the line for each item
    private static void printItemType(Item item, boolean premium) {
        if (premium) {
            System.out.println(item.getName() + " is a premium item at $" + item.getPrice());
        } else {
            System.out.println(item.getName() + " is a regular item at $" + item.getPrice());
        }
    }

    // states the name into the temporary array and returns the new count
    private static int addPremiumItemName(String[] premiumTemp, int premiumCount, String nane) {
        premiumTemp[premiumCount] = name;
        return premiumCount + 1;
    }

    // make a new array with number of premium items
    private static String[] trimPremiumItems(String[] premiumTemp, int premiumCount) {
        String[] premiumItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            premiumItems[i] = premiumTemp[i];
        }
        return premiumItems;
    }

    private static double calculateTax(double subtotal, double taxRate) {
        if (subtotal <= 0) {
            return 0.0;
        }
        return subtotal * taxRate;
    }

    private static double calculateTotal(double subtotal, double tax) {
        if (subtotal <= 0) {
            return 0.0;
        }
        return subtotal + tax;
    }

    private static void orderSummary(double subtotal, double tax, double total, int premiumCount) {
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);
    }
}
// I split the big processCustomerOrder method into small helper methods so each
// one does one job at a time,
// like compute item totals, decide if an item is premium etc. This makes the
// main method easier to read because it becomes simpler.
// It also makes it easier to test and fix bugs, because each helper method is
// small and focused. The other 3 classes
// (Item, OrderSummary, OrderTester) are just data containers and a runner, and
// the main refactor belongs in OrderProcessor.