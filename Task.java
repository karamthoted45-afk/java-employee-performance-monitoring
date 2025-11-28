public class Task {
    String employee;
    String taskName;
    int deadlineDays;

    public Task(String employee, String taskName, int deadlineDays) {
        this.employee = employee;
        this.taskName = taskName;
        this.deadlineDays = deadlineDays;
    }

    @Override
    public String toString() {
        return employee + " - " + taskName + " (Deadline: " + deadlineDays + " days)";
    }
}