package com.digitinary;

import java.util.List;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private int year;




    public Book(int id , String title , int year){
        this.id=id;
        this.title=title;
        this.year=year;
    }
    public int getId(){
        return id;
    }
    public String getTitle(){
        return  title;
    }
    public int getYear(){
        return year;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setYear(int year){
        this.year=year;
    }
    public String toString(){
        return "{" + id + "|" + title + "|" + year + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
//    @Override
//    public boolean equals(Object o){
//        if (this==o) return true;
//        if (o instanceof Book book) {
//            return id == book.id;
//        }
//        return false;
//    }
//    @Override
//    public int hashCode(){
//        return Objects.hash(id);
//    }


}
