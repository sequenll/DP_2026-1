package hw.ch01;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        System.out.println("학번: 20240770, 이름: 전민서");

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드", "기술", 2008, 30000.0));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000.0));
        bookShelf.appendBook(new Book("사피엔스", "역사", 2011, 18000.0));
        bookShelf.appendBook(new Book("이펙티브 자바", "기술", 2018, 36000.0));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000.0));
        bookShelf.appendBook(new Book("레미제라블", "소설", 1862, 12000.0));
        bookShelf.appendBook(new Book("총균쇠", "역사", 1997, 22000.0));
        bookShelf.appendBook(new Book("리팩터링", "기술", 2018, 34000.0));
        bookShelf.appendBook(new Book("로마인 이야기", "역사", 1992, 25000.0));
        bookShelf.appendBook(new Book("어린왕자", "소설", 1943, 9000.0));
        
        // 명시적으로 Iterator를 사용하는 방법 
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println();

        //장르가 "소설"인 책만 출력하는 방법
        System.out.println("***장르가 소설인 책***");
        Iterator<Book> it1 = bookShelf.iteratorByGenre("소설");
        while (it1.hasNext()) {
            Book book = it1.next();
            System.out.println("제목: " + book.getName() + ", 장르: " + book.getGenre() + ", 출판 연도: " + book.getYear() + ", 가격: " + book.getPrice());
        }

       // 출판 연도가 최신부터 오래된 순서로 책을 출력하는 방법
       System.out.println("***출판 연도가 최신부터 오래된 순서***");
       Iterator<Book> it2 = bookShelf.iteratorByYear();
       while (it2.hasNext()) {
           Book book = it2.next(); 
           System.out.println("제목: " + book.getName() + ", 장르: " + book.getGenre() + ", 출판 연도: " + book.getYear() + ", 가격: " + book.getPrice());
       }

    }
}