package com.zhao.service;

import com.zhao.mapper.BookMapper;
import com.zhao.pojo.Book;

import java.util.List;

public class BookServiceImpl implements BookService {

    // service 层调用 mapper 层
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> selectAllBooks() {
        return bookMapper.selectAllBooks();
    }

    @Override
    public Book selectBookById(int id) {
        return bookMapper.selectBookById(id);
    }

    @Override
    public List<Book> selectBookByName(String name) {
        // Like 查询添加 SQL 通配符
        return bookMapper.selectBookByName("%" + name + "%");
    }

    @Override
    public int addBook(Book book) {
        return bookMapper.addBook(book);
    }

    @Override
    public int updateBook(Book book) {
        return bookMapper.updateBook(book);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }
}
