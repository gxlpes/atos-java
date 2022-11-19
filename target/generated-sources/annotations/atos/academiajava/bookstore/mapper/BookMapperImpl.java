package atos.academiajava.bookstore.mapper;

import atos.academiajava.bookstore.dto.BookDto;
import atos.academiajava.bookstore.entity.Book;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-11-19T19:17:27-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 15.0.9 (Azul Systems, Inc.)"
)
public class BookMapperImpl implements BookMapper {

    @Override
    public Book toModel(BookDto dto) {
        if ( dto == null ) {
            return null;
        }

        Book book = new Book();

        book.setId( dto.getId() );
        book.setDescription( dto.getDescription() );
        book.setAuthor( dto.getAuthor() );
        book.setYear( dto.getYear() );
        book.setPrice( dto.getPrice() );

        return book;
    }

    @Override
    public BookDto toDto(Book model) {
        if ( model == null ) {
            return null;
        }

        BookDto bookDto = new BookDto();

        bookDto.setId( model.getId() );
        bookDto.setDescription( model.getDescription() );
        bookDto.setAuthor( model.getAuthor() );
        bookDto.setYear( model.getYear() );
        bookDto.setPrice( model.getPrice() );

        return bookDto;
    }
}
