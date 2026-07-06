/*
  Task 03 - Student Result Generator
  Creates multiple threads to calculate marks for different students,
  uses a synchronized method to write results to a shared report,
  and checks thread completion using isAlive().
*/
public class StudentResultGenerator {

    static class ReportBook {
        synchronized void writeResult(String studentName, int marks) {
            System.out.println("Result recorded: " + studentName + " - Marks: " + marks);
        }
    }

    static class StudentThread extends Thread {
        private ReportBook reportBook;
        private String studentName;
        private int marks;

        StudentThread(ReportBook reportBook, String studentName, int marks) {
            this.reportBook = reportBook;
            this.studentName = studentName;
            this.marks = marks;
        }

        @Override
        public void run() {
            // Simulate marks calculation delay
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            reportBook.writeResult(studentName, marks);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReportBook reportBook = new ReportBook();

        StudentThread s1 = new StudentThread(reportBook, "Student A", 85);
        StudentThread s2 = new StudentThread(reportBook, "Student B", 91);
        StudentThread s3 = new StudentThread(reportBook, "Student C", 78);

        s1.start();
        s2.start();
        s3.start();

        s1.join();
        s2.join();
        s3.join();

        System.out.println("Student A isAlive: " + s1.isAlive());
        System.out.println("Student B isAlive: " + s2.isAlive());
        System.out.println("Student C isAlive: " + s3.isAlive());
        System.out.println("All student threads completed.");
    }
}
