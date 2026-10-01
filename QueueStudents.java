import java.util.Queue;
import java.util.LinkedList;

public class QueueStudents {
    public static void main(String[] args) {

        Queue<String> students = new LinkedList<>();

        // Add students
        students.offer("Ana");
        students.offer("Ben");
        students.offer("Carla");

        System.out.println("Initial Service Order:");

        // Serve the first student
        System.out.println("Served: " + students.poll());

        // Add a new student after the first student is served
        students.offer("David");

        System.out.println("\nUpdated Service Order:");

        // Serve remaining students
        while (!students.isEmpty()) {
            System.out.println("Served: " + students.poll());
        }
    }
}