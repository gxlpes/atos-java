package atos.academiajava.bookstore.mapper;

import atos.academiajava.bookstore.dto.BookDto;
import atos.academiajava.bookstore.entity.Book;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BookMapper {

    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    Book toModel(BookDto dto);
    BookDto toDto(Book model);
}
