import java.util.stream.IntStream;

public class MT {
    public static void main(String args[]){
        System.out.println("Starting program");

        Printer printer=new Printer();
        Runnable r=new PrinterThread(printer);

        Thread[] threads=new Thread[10];
        for(int i=0; i < 10; i++){
            threads[i]=new Thread(r);
            threads[i].start();
        }

        System.out.println("Ending program");

    }
}

class Printer{
    void printDocuments(int numOfCopies, String documentName){
        IntStream.range(1,numOfCopies+1).forEach(n-> System.out.println("Printing "+documentName+" for copy #" + n));
    }
}

class PrinterThread implements Runnable{
    Printer printer;

    public PrinterThread(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        this.printer.printDocuments(10,"VivekDoc");
    }
}