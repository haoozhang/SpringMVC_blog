package com.zhao.controller;

import com.zhao.pojo.Book;
import com.zhao.service.BookService;
import com.zhao.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    // controller 层调用 service 层
    @Autowired
    private BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    // 查询所有书
    @GetMapping("/allBooks")
    public String listAllBooks(Model model) {
        List<Book> bookList = bookService.selectAllBooks();
        model.addAttribute("bookList", bookList);
        return "allBooks";
    }

    // 跳转到添加书籍界面
    @RequestMapping("/toAddBook")
    public String toAddBook() {
        return "addBook";
    }

    // 增加一本书
    @PostMapping("/addBook")
    public String addBook(Book book) {
        System.out.println("-> addBook: " + book);
        bookService.addBook(book);
        return "redirect:/book/allBooks";
    }

    // 跳转到更新书籍界面
    @RequestMapping("/toUpdateBook")
    public String toUpdateBook(Model model, int id) {
        Book book = bookService.selectBookById(id);
        // 传递给前端，更新时显示在页面上
        model.addAttribute("selectBook", book);
        return "updateBook";
    }

    // 更新一本书
    @PostMapping("/updateBook")
    public String updateBook(Model model, Book book) {
        System.out.println("-> updateBook: " + book);
        bookService.updateBook(book);
        // 重定向到 allBooks 页面，获取最新结果
        return "redirect:/book/allBooks";
    }

    // 删除一本书
    // 使用 @DeleteMapping 注解后，返回时不能跳转界面 "GET method not support"，所以这里不能使用
    @RequestMapping("deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id) {
        bookService.deleteBookById(id);
        return "redirect:/book/allBooks";
    }

    // 根据名称查询一本书
    @RequestMapping("SearchBook")
    public String searchBook(String searchBookName, Model model) {
        List<Book> bookList = bookService.selectBookByName(searchBookName);
        model.addAttribute("bookList", bookList);
        return "allBooks";
    }
}
