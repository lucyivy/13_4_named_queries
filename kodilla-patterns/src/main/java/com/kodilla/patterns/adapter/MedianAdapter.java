package com.kodilla.patterns.adapter;

import com.kodilla.patterns.adapter.librarya.Classifier;
import com.kodilla.patterns.adapter.librarya.Book;
import com.kodilla.patterns.adapter.libraryb.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns.adapter.libraryb.Book > bookMap = new HashMap<>();
        for(Book book : bookSet) {
            bookMap.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns.adapter.libraryb.Book(book.getAuthor(), book.getTitle(), book.getPublicationYear()));
        }

        return medianPublicationYear(bookMap);
    }
}