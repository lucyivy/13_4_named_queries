package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooksShallowCopy() {
        //given
        Library library = new Library("My home library");
        IntStream.iterate(1, n -> n + 1)
                .limit(5)
                .forEach(n -> library.getBooks().add(new Book("Book no. " + n, "Author" + n,
                        LocalDate.of(2001, 01, 01))));

        // making a shallow copy
        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("Shallow copy of my home library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep copy of my home library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }


        //when
        library.getBooks().add(new Book("Additional Test Book", "Tester",
                LocalDate.of(2011, 02, 02)));

        //then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(6, library.getBooks().size());
        Assert.assertEquals(6, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(shallowClonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
