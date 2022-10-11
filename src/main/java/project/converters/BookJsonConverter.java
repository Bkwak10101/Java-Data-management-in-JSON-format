package project.converters;

import project.object.Book;

public class BookJsonConverter extends JsonConverter<Book> {
    public BookJsonConverter(String jsonFilename) {
        super(jsonFilename);
    }
}