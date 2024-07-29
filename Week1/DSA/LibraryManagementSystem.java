/*
Search Algorithms:
1. Linear Search:
    Sequentially checks each element until the target is found or the end is reached.

2. Binary Search:
    Divides the sorted array into halves to find the target.
*/

// Define the Book class with attributes for searching
class Book {
    int bookId;
    String title;
    String author;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book(" + bookId + ", " + title + ", " + author + ")";
    }
}

public class LibraryManagementSystem {
    private Book[] books;
    private int count;

    public LibraryManagementSystem(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(Book book) {
        if (count < books.length) {
            books[count++] = book;
        } else {
            System.out.println("Array is full. Cannot add more books.");
        }
    }

    public Book linearSearch(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public Book binarySearch(String title) {
        int left = 0, right = count - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = books[mid].title.compareTo(title);
            if (cmp == 0) {
                return books[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryManagementSystem lms = new LibraryManagementSystem(5);
        lms.addBook(new Book(1, "The Grand Design", "Stephen Hawking"));
        lms.addBook(new Book(2, "RajKahini", "Obonindonath Thakur"));
        lms.addBook(new Book(3, "1984", "Harper Lee"));

        System.out.println("Linear Search for '1984':");
        System.out.println(lms.linearSearch("1984"));

        // Sort books for binary search
        java.util.Arrays.sort(lms.books, 0, lms.count, (a, b) -> a.title.compareTo(b.title));

        System.out.println("Binary Search for '1984':");
        System.out.println(lms.binarySearch("1984"));
    }
}

/*
Time Complexity Analysis:
1. Linear Search:
   - Best-case: O(1)
   - Average-case: O(n)
   - Worst-case: O(n)

2. Binary Search:
   - Best-case: O(1)
   - Average-case: O(log n)
   - Worst-case: O(log n)

When to use:
- Linear Search: Suitable for small or unsorted datasets.
- Binary Search: Suitable for large and sorted datasets.
*/

