public class Inventory {
    private String itemName;
    private int quantity;
    private int price;
    
    // Constructor (3-parameter)
    public Inventory(String itemName, int quantity, int price) {
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String toString() {
        return "Item: " + itemName + ", Quantity: "
                + quantity + ", Price: $" + price;
    }

    public boolean equals(Inventory other) {
        if (this.itemName.equals(other.itemName) && this.quantity == other.quantity && this.price == other.price) {
            return true;
        } else {
            return false;
        }
    }

    public void raisePrice(double percentage) {
        percentage = (Math.random()) * 101;
        price = (int) ((int) price * ( 1 + percentage / 100));
    }
}
