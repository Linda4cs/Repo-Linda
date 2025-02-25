public class Bookshelf {
    public static void main(String[] args) {
        // Creating Book objects
        Book book1 = new Book("The smart Java", "Linda Dike", ", Dike and Co", 2020);
        Book book2 = new Book("OOP", "John Smith", "James & Brown", 2025);
        Book book3 = new Book("Level 4 Programming", "CS Level 4", "Group B & Co.", 2024);

        // Displaying book details using toString
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();
        System.out.println(book3);

        // Updating book details using setter methods
        book1.setTitle("The Catcher in the Linda (Updated Edition)");
        book1.setPublisher("New Publisher");

        // Displaying updated book details
        System.out.println("\nUpdated Book 1 Details:");
        System.out.println(book1);
    }
}