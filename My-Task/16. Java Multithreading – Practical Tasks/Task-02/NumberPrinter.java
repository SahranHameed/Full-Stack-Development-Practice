/*
  Task 02 - Number Printer
  One thread prints odd numbers, another prints even numbers.
  Uses sleep() to delay output, and synchronizes the printing
  method so the output from both threads is never mixed.
*/
public class NumberPrinter {

    static class NumberPrinterHelper {
        synchronized void print(int number, String label) {
            System.out.println(label + " : " + number);
        }
    }

    public static void main(String[] args) {
        NumberPrinterHelper printer = new NumberPrinterHelper();
        int limit = 10;

        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= limit; i += 2) {
                printer.print(i, "Odd ");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= limit; i += 2) {
                printer.print(i, "Even");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        });

        oddThread.start();
        evenThread.start();
    }
}
