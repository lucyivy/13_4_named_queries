package com.kodilla.patterns.adapter;

import com.kodilla.patterns.adapter.libraryb.Book;
import com.kodilla.patterns.adapter.libraryb.BookSignature;
import com.kodilla.patterns.adapter.libraryb.BookStatistics;
import com.kodilla.patterns.adapter.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }

}

