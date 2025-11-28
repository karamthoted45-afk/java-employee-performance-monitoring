public class Main {
    public static void main(String[] args) {
        EmployeeMonitor monitor = new EmployeeMonitor();
        monitor.assignTask("John", "Prepare Report", 5);
        monitor.checkPerformance();
    }
}