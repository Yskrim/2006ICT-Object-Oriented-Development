public class Main {
    // 1. getters and setters == incapsulate properties on obj, only use methods to access values
    static class Item{
        private String title;
        private double price;

        public Item(String title, double price){ this.price = price; this.title = title; }

        public String getTitle(){ return this.title; }
        public double getPrice(){ return this.price; }
        public void setTitle(String title) { this.title = title; }
        public void setPrice(double price) { this.price = price; }
    }

    // 2. toString == method that creates a readable description of an object.
    static class Product{
        private String title;
        private double price;
        public Product(String title, double price){ this.price = price; this.title = title; }

        @Override
        public String toString(){
            return "Product{title='" + title + "', price='" + price + "'}";
        }

        public String getTitle(){ return this.title; }
        public double getPrice(){ return this.price; }
        public void setTitle(String title) { this.title = title; }
        public void setPrice(double price) { this.price = price; }
    }

    public static void main(String[] args){
        Product product = new Product("Sword", 49.99);
        System.out.println(product);
        // apparently no need to call product.toString();
    }
}