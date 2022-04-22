public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    public Book(String n, Author at, double p, int q){
        this.name = n;
        this.author = at;
        this.price = p;
        this.qty = q;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book-name: " + "name='" + name + '\'' +
                ", author=" + author + ", price=" + price + ", qty=" + qty + '.';
    }

    public static void main(String[] args) {
        Author anteck = new Author("tan ah teck", "ahteck@gmail.com", 'm');
        System.out.println(anteck);
        Book bl = new Book("Java for dummies", anteck, 99.9, 100);
        System.out.println(bl);
        bl.setPrice(60.5);
        System.out.println("Price: " + bl.getPrice());
        bl.setQty(88);
        System.out.println("Qty:" + bl.getQty());
        System.out.println("author: " + bl.getAuthor());
        Book moreDummBook = new Book("java for more dumies", new Author("Peter", "java@gmail.com", 'f'),29.9,5);
        System.out.println(moreDummBook);
    }
}
