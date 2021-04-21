package com.zhao.mapper;

import com.zhao.pojo.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    // 查询所有书
    List<Book> selectAllBooks();

    // 根据 id 查询一本书
    Book selectBookById(@Param("bookId") int id);

    // 根据名称查询一本书
    List<Book> selectBookByName(@Param("bookName") String name);

    // 增加一本书
    int addBook(Book book);

    // 更新一本书
    int updateBook(Book book);

    // 删除一本书
    int deleteBookById(@Param("bookId") int id);

}
