package com.darren.mvc.service.IService;

import com.darren.mvc.pojo.Book;

import java.util.List;

public interface IBookService {
    public List<Book> getAllBooks();

    public Book getBookById(int id);

    public int add(Book entity) throws Exception ;

    public int add(Book entity1,Book entityBak);

    public int delete(int id);

    /**
     * 多删除
     */
    public int delete(String[] ids);

    public int update(Book entity);
}
