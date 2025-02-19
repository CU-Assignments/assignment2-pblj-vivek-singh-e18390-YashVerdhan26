class Product {
    @SuppressWarnings("FieldMayBeFinal")
    private int id;
    @SuppressWarnings("FieldMayBeFinal")
    private String name;
    @SuppressWarnings("FieldMayBeFinal")
    private double price;

    // Constructor to initialize Product details
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Creating a product instance
        Product product = new Product(101, "Laptop", 75000);
        product.displayDetails();
    }
}
