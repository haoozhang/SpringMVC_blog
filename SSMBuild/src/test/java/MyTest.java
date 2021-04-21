import com.zhao.pojo.Book;
import com.zhao.service.BookService;
import com.zhao.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void testBookService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("bookServiceImpl");
        List<Book> bookList = bookServiceImpl.selectAllBooks();
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
}
