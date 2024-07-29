/*
Sorting Algorithms:

1. Bubble Sort:
   Repeatedly iterate through the array, comparing adjacent pairs of 
   elements and swapping them if they are in the wrong order. Repeat 
   until the array is fully sorted.

2. Insertion Sort:
   Build up a sorted subarray from left to right by inserting each new
   element into its correct position in the subarray. Repeat until the 
   array is fully sorted.

3. Quick Sort:
   Select a 'pivot' element from the array and partition the other elements 
   into two sub-arrays, according to whether they are less than or greater 
   than the pivot. Recursively apply the same process to the sub-arrays.

4. Merge Sort:
   Divide the array into two halves, sort each half, and then merge the sorted 
   halves to produce the sorted array.
*/

class Order {
    int orderId;
    String customerName;
    double totalPrice;

    public Order(int orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order(" + orderId + ", " + customerName + ", " + totalPrice + ")";
    }
}

public class SortingAlgorithms {

    public static void bubbleSort(Order[] orders) {
        int n = orders.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orders[j].totalPrice > orders[j + 1].totalPrice) {
                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(Order[] orders, int low, int high) {
        if (low < high) {
            int pi = partition(orders, low, high);
            quickSort(orders, low, pi - 1);
            quickSort(orders, pi + 1, high);
        }
    }

    private static int partition(Order[] orders, int low, int high) {
        double pivot = orders[high].totalPrice;
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (orders[j].totalPrice <= pivot) {
                i++;
                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }
        Order temp = orders[i + 1];
        orders[i + 1] = orders[high];
        orders[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "JIT", 250.0),
            new Order(2, "SOURAV", 150.0),
            new Order(3, "SOUVIK", 300.0),
            new Order(4, "SNEHA", 100.0),
            new Order(5, "RAHUL", 1500.0),
            new Order(6, "ANUSHKA", 200.0)
        };
        bubbleSort(orders);
        System.out.println("Bubble Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
        orders = new Order[]{
            new Order(1, "JIT", 250.0),
            new Order(2, "SOURAV", 150.0),
            new Order(3, "SOUVIK", 300.0),
            new Order(4, "SNEHA", 100.0),
            new Order(5, "RAHUL", 1500.0),
            new Order(6, "ANUSHKA", 200.0)
        };
        quickSort(orders, 0, orders.length - 1);
        System.out.println("Quick Sorted Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}

/*
Time Complexity Analysis:
    Bubble Sort:
        Best-case: O(n)
        Average-case: O(n^2)
        Worst-case: O(n^2)

    Quick Sort:
        Best-case: O(nlogn)
        Average-case: O(nlogn)
        Worst-case: O(n^2)

Suitability:
    Quick Sort is generally preferred over Bubble Sort because it 
    has a better average-case time complexity of O(nlogn) compared 
    to Bubble Sort's O(n^2).
*/

