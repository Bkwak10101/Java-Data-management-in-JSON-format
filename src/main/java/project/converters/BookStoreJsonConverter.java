package project.converters;

import project.object.BookStore;

public class BookStoreJsonConverter extends JsonConverter<BookStore> {
    public BookStoreJsonConverter(String jsonFilename) {
        super(jsonFilename);
    }
}
