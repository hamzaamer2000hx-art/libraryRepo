package com.digitinary;

import javax.crypto.spec.PSource;
import java.util.*;

public class Library {
    List<Book> books = new ArrayList<>();
    Queue<String> waitingQueue = new LinkedList<>();
    Deque<String> doubleEndedQueue = new ArrayDeque<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void displayBooks(){
        for (Book b : books){
            System.out.println(b);
        }
    }
    public void deleteBook(int id){
        books.removeIf(b -> b.getId()==id);
    }
    public Book searchBookById(int id){
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }
    public void updateBook(int id , String newTitle , int newYear){
        Book b = searchBookById(id);
        if(b != null){
            b.setTitle(newTitle);
            b.setYear(newYear);
        }
    }
    public void removeDuplicates(){
        Set<Book> unique = new LinkedHashSet<>(books);
        books = new ArrayList<>(unique);

    }
    public void addPersonToQueue(String name){
        waitingQueue.add(name);
    }
    public void servePersonFromQueue(){
        if (!waitingQueue.isEmpty()){
            System.out.println(waitingQueue.poll() + "borrowed a book");
        } else{
            System.out.println("no one is waiting");
        }
    }
    public void addPersonFront(String name){
        doubleEndedQueue.addFirst(name);
    }
    public void addPersonBack(String name){
        doubleEndedQueue.addLast(name);
    }
    public void showDoubleEndedQueue(){
        System.out.println(doubleEndedQueue);
    }
    public void displaySortedByTitle(){
        books.stream()
                .sorted(Comparator.comparing(Book::getTitle))
                .forEach(System.out::println);
    }
    public void displaySortedByYear(){
        books.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .forEach(System.out::println);
    }
    public void displaySortedById(){
        books.stream()
                .sorted(Comparator.comparing(Book::getId))
                .forEach(System.out::println);
    }

}
