import java.util.ArrayList;

public class EmployeeMonitor {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void assignTask(String employee, String taskName, int deadline) {
        Task t = new Task(employee, taskName, deadline);
        tasks.add(t);
        System.out.println("Task Assigned: " + t);
    }

    public void checkPerformance() {
        System.out.println("Checking task deadlines...");
        for (Task t : tasks) {
            if (t.deadlineDays <= 1) {
                System.out.println("⚠ ALERT: Deadline approaching for " + t);
            } else {
                System.out.println("OK: " + t);
            }
        }
    }
}