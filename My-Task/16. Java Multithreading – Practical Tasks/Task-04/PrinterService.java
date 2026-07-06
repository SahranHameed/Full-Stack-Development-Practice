/*
  Task 04 - Printer Service
  Creates multiple employee threads to send print jobs,
  synchronizes the printDocument() method, uses setPriority()
  to give one employee higher priority, and uses join() to wait
  for all print jobs to complete.
*/
public class PrinterService {

    static class Printer {
        synchronized void printDocument(String employeeName) {
            System.out.println(employeeName + " document printed.");
        }
    }

    static class EmployeeThread extends Thread {
        private Printer printer;
        private String employeeName;

        EmployeeThread(Printer printer, String employeeName) {
            this.printer = printer;
            this.employeeName = employeeName;
        }

        @Override
        public void run() {
            printer.printDocument(employeeName);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Printer printer = new Printer();

        EmployeeThread highPriorityEmployee =
            new EmployeeThread(printer, "[High Priority] Employee 1");
        EmployeeThread employee2 = new EmployeeThread(printer, "Employee 2");
        EmployeeThread employee3 = new EmployeeThread(printer, "Employee 3");

        // Give one employee thread a higher scheduling priority
        highPriorityEmployee.setPriority(Thread.MAX_PRIORITY);
        employee2.setPriority(Thread.NORM_PRIORITY);
        employee3.setPriority(Thread.NORM_PRIORITY);

        highPriorityEmployee.start();
        employee2.start();
        employee3.start();

        // Wait for all print jobs to complete
        highPriorityEmployee.join();
        employee2.join();
        employee3.join();

        System.out.println("All print jobs completed.");
    }
}
