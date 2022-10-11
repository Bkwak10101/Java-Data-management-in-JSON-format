package project;

import project.converters.BookJsonConverter;
import project.converters.BookStoreJsonConverter;
import project.object.Book;
import project.object.BookStore;
import project.object.Category;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;


public class App {

    public static void main(String[] args) {
        // --------------------------------------------------------------------
        // book data
        Book book = Book.builder()
                .title("Jaws")
                .author("Peter Benchley")
                .price(9.97)
                .releaseDate(1974)
                .category(Category.THRILLER)
                .build();

        // --------------------------------------------------------------------
        // book json conversion
        final String bookJsonFilename = "book.json";
        BookJsonConverter bookJsonConverter = new BookJsonConverter(bookJsonFilename);
        bookJsonConverter.toJson(book);
        bookJsonConverter.fromJson().ifPresent(System.out::println);

        // --------------------------------------------------------------------
        // books store data
        BookStore booksStore = new BookStore(new HashSet<>(Arrays.asList(
                Book.builder()
                        .title("JAWS")
                        .author("Peter Benchley")
                        .price(9.97)
                        .releaseDate(1974)
                        .category(Category.THRILLER)
                        .build(),
                Book.builder()
                        .title("Witcher")
                        .author("Andrzej Sapkowski")
                        .price(10.99)
                        .releaseDate(1980)
                        .category(Category.FANTASY)
                        .build(),
                Book.builder()
                        .title("12 prac Herkulesa Poirot")
                        .author("Agatha Christie")
                        .price(12.99)
                        .releaseDate(1918)
                        .category(Category.CRIME)
                        .build()
        )));

        // --------------------------------------------------------------------
        // book store json conversion
        final String booksStoreJsonFilename = "books_store.json";
        BookStoreJsonConverter booksStoreJsonConverter = new BookStoreJsonConverter(booksStoreJsonFilename);
        booksStoreJsonConverter.toJson(booksStore);
        booksStoreJsonConverter.fromJson().ifPresent(System.out::println);
    }
}
