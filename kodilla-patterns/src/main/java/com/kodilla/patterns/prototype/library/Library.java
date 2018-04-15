package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Task;
import com.kodilla.patterns.prototype.TasksList;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = name + ":\n";
        for (Book bookList : books) {
            s = s + bookList.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library deepClonedLibrary = (Library) super.clone();
        deepClonedLibrary.books = new HashSet<>();
        for (Book theBook : this.books) {
            Book clonedBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
            deepClonedLibrary.books.add(clonedBook);
        }
        return deepClonedLibrary;
    }

}