/*
Linked Lists:
1. Singly Linked List: Each node contains data and a reference to the next node. 
                       Efficient for insertions and deletions.
2. Doubly Linked List: Each node contains data, a reference to the next node, and 
                       a reference to the previous node. Allows traversal in both 
                       directions.
*/

class Task {
    int taskId;
    String taskName;
    String status;

    public Task(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Task(" + taskId + ", " + taskName + ", " + status + ")";
    }
}

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}

public class TaskManagementSystem {
    private Node head;

    public TaskManagementSystem() {
        head = null;
    }

    public void addTask(Task task) {
        Node newNode = new Node(task);
        newNode.next = head;
        head = newNode;
    }

    public Task searchTask(int taskId) {
        Node current = head;
        while (current != null) {
            if (current.task.taskId == taskId) {
                return current.task;
            }
            current = current.next;
        }
        return null;
    }

    public void traverseTasks() {
        Node current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    public void deleteTask(int taskId) {
        Node current = head;
        Node previous = null;
        while (current != null && current.task.taskId != taskId) {
            previous = current;
            current = current.next;
        }
        if (current != null) {
            if (previous == null) {
                head = current.next;
            } else {
                previous.next = current.next;
            }
        } else {
            System.out.println("Task not found.");
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();
        tms.addTask(new Task(1, "Design", "Pending"));
        tms.addTask(new Task(2, "Development", "In Progress"));
        tms.addTask(new Task(3, "Testing", "Completed"));

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("Search Task with ID 2:");
        System.out.println(tms.searchTask(2));

        System.out.println("Delete Task with ID 2:");
        tms.deleteTask(2);

        System.out.println("All Tasks after deletion:");
        tms.traverseTasks();
    }
}

/*
Time Complexity Analysis:
1. Add: O(1)
2. Search: O(n)
3. Traverse: O(n)
4. Delete: O(n)

Advantages of Linked Lists over Arrays:
1. Dynamic size: Can grow and shrink as needed.
2. Efficient insertions and deletions: No need to shift elements.
3. Suitable for applications where frequent insertions and deletions are required.
*/
