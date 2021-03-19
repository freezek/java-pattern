package src.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by ChenTao on 2017/7/12.
 * Junit测试类
 */
public class TestDoWhile {

    private String[] strings = new String[0];

    private static  AtomicInteger a = new AtomicInteger(0);

//    @Test
//    public void testDoWhile(){
//        int i =0;
//        do {
//           i++;
//        }while (i!=10);
//        System.out.println(i);
//    }
//
//    @Test
//    public void testEmptyArray(){
//
//
//        this.setValue("3","4");
//
//        System.out.println(strings.length);
//
//    }

    private void setValue(String ...strs){


        this.strings = strs;
    }

//    @Test
//    public void contextLoads() {
//
//
//        Book b1 = new Book("Programing","jake" ,new Date());
//        Book b2 = new Book("Math","tom" ,new Date());
//        Book b3 = new Book("English","bob" ,new Date());
//        Book b4 = new Book("Song","bili" ,new Date());
//        Book b5 = new Book("English","lily" ,new Date());
//
//
//        List<Book> list = new ArrayList<>();
//        list.add(b1);
//
//        Book list1 = Optional.ofNullable(list.get(0)).orElse(new Book("Game","hello",new Date()));
//
//        Optional<Book> optional = Optional.ofNullable(list.get(0));
//
//        optional.ifPresent(book -> System.out.println(book.getName()));
//
//        list.add(b1);
//        list.add(b2);
//        list.add(b3);
//        list.add(b4);
//        list.add(b5);
//
//        assert true;
//
//        List<String> newList =  list.stream().map(book->book.getName().toUpperCase()).limit(1).collect(Collectors.toList());
//
//        String names = list.stream().map(Book::getName).filter(name->!name.equals("English")).reduce("-",(a,b)->a+b+"-");
//
//        System.out.println(newList.toString());
//
//        System.out.println(names);
//
//    }


    class Book{

        private String name;

        private String author;

        private Date year;

        public Book(String name,String author,Date year){

            this.name = name;
            this.author = author;
            this.year = year;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public Date getYear() {
            return year;
        }

        public void setYear(Date year) {
            this.year = year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

     static class Worker implements Runnable{

        private static volatile int b = 0;

        @Override
        public void run() {
            System.out.println(this.say2(b));;
        }

        private AtomicInteger say(AtomicInteger b){

//            synchronized (a){
                for (int i = 0; i < 100; i++) {
                    a.incrementAndGet();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//            }

            return a;
        }

         private int say2(int c){

//            synchronized (b){
             for (int i = 0; i < 100; i++) {
                 b++;
                 try {
                     Thread.sleep(10);
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
//            }

             return b;
         }
    }

//    @Test
//    public void testSynchronized(){
//
//        Thread thread = new Thread(new Worker());
//        Thread thread2 = new Thread(new Worker());
//        thread.start();
//        thread2.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
        Worker worker = new Worker();
        Thread thread = new Thread(worker);
        Thread thread2 = new Thread(worker);
        thread.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
