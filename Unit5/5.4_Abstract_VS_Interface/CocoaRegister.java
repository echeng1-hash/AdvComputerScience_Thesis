import java.util.ArrayList;

public class CocoaRegister {

    public static final double TAX_RATE = 0.0875;

    private ArrayList<Sellable> items;
    private ArrayList<Integer> quantities;

    public CocoaRegister() {
        items = new ArrayList<>();
        quantities = new ArrayList<>();
    }

    public void addItem(Sellable item, int quantity) {
        if (item == null) {
            return;
        }
        if (quantity <= 0) {
            return;
        }
        items.add(item);
        quantities.add(quantity);
    }

    public double getSubtotal() {
        double subtotal = 0.0;
        for (int i = 0; i < items.size(); i++) {
            Sellable item = items.get(i);
            int qty = quantities.get(i);
            subtotal += item.getBasePrice() * qty;
        }
        return ChocolateBar.round2(subtotal);
    }

    public double getTax() {
        double tax = getSubtotal() * TAX_RATE;
        return ChocolateBar.round2(tax);
    }

    public double getTotal() {
        double total = getSubtotal() + getTax();
        return ChocolateBar.round2(total);
    }

    public void printReceipt() {
        // Hint: - Header line: "== COCOA CORNER =="
        // - For each line item i:
        // (i+1) + ". " + name + " x" + qty + " @ $" + unit + " = $" + lineTotal
        // - Use ChocolateBar.money(...) for all currency formatting
        System.out.println("== COCOA CORNER ==");
        for (int i = 0; i < items.size(); i++) {
            Sellable item = items.get(i);
            int qty = quantities.get(i);
            String name = item.getName();
            double unit = item.getBasePrice();
            double lineTotal = ChocolateBar.round2(unit * qty);
            System.out.println((i + 1) + ". " + name + " x" + qty + " @ $" + ChocolateBar.money(unit)
                    + " = $" + ChocolateBar.money(lineTotal));
        }
        System.out.println("Subtotal: $" + ChocolateBar.money(getSubtotal()));
        System.out.println("Tax: $" + ChocolateBar.money(getTax()));
        System.out.println("Total: $" + ChocolateBar.money(getTotal()));
    }

}
