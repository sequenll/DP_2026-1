package hw.ch01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class YearIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private Integer[] sortedIndices;
    private int index;
    
    public YearIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        int length = bookShelf.getLength();
        this.sortedIndices = new Integer[length];
        for (int i = 0; i < length; i++) {
            this.sortedIndices[i] = i;
        }
        // 출판 연도를 최신부터 오래된 순서로 정렬 (내림차순)
        Arrays.sort(this.sortedIndices, Comparator.comparingInt((Integer i) -> bookShelf.getBookAt(i).getYear()).reversed());
        this.index = 0;
    }
    
    @Override
    public boolean hasNext() {
        return index < sortedIndices.length;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book book = bookShelf.getBookAt(sortedIndices[index]);
        index++;
        return book;
    }
}