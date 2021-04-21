package com.zhao.service;

import com.zhao.pojo.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {

    // 查询所有书
    List<Book> selectAllBooks();

    // 根据 id 查询一本书
    Book selectBookById(int id);

    // 根据名称查询一本书
    List<Book> selectBookByName(String name);

    // 增加一本书
    int addBook(Book book);

    // 更新一本书
    int updateBook(Book book);

    // 删除一本书
    int deleteBookById(int id);

}
