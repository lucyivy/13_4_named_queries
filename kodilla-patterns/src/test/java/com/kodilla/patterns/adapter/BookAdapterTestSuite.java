package com.kodilla.patterns.adapter;

import org.junit.Assert;
import org.junit.Test;
import com.kodilla.patterns.adapter.librarya.Book;

import java.util.HashSet;
import java.util.Set;

public class BookAdapterTestSuite {

    @Test
    public void testMedianPublicationYear() {
        //Given
        Book book1 = new Book("Author1", "title1", 1997, "signature1");
        Book book2 = new Book("Author2", "title2", 1990, "signature2");
        Book book3 = new Book("Author3", "title3", 1999, "signature5");
        Book book4 = new Book("Author4", "title4", 2000, "signature");
        Book book5 = new Book("Author5", "title5", 1971, "signatur1");
        MedianAdapter adapter = new MedianAdapter();

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        //When
        int medianYear = adapter.publicationYearMedian(bookSet);

        //Then
        Assert.assertEquals(1997, medianYear);
    }
}