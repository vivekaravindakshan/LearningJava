import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class MTNew {

    public static void main(String args[]){
        System.out.println("Starting program");
        int threadCount=2;
        List<String> list=new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("h");
        list.add("i");
        list.add("j");
        list.add("k");
        list.add("l");
        list.add("m");

        Lists.partition(list,list.size()/threadCount).forEach(n-> process(n));

        System.out.println("Ending program");

    }

    private static void process(List<String> n) {
        Runnable r=new PrintList(n);
        Thread thread=new Thread(r);
        thread.start();
    }

}

class PrintList implements Runnable{
    List<String> printList=new ArrayList<>();

    public PrintList(List<String> printList) {
        this.printList = printList;
    }

    @Override
    public void run() {
        this.printList.forEach(n-> System.out.println(Thread.currentThread().getId()+": Alpha:"+n));
    }
}