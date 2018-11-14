package com.darren.mvc.mapper;


import com.darren.mvc.pojo.Book;

import java.util.List;

public interface BookMapper {
    /**
     * 获得所有图书
     */
    public List<Book> getAllBooks();
    /**
     * 根据图书编号获得图书对象
     */
    public Book getBookById(int id);
    /**
     * 添加图书
     */
    public int add(Book entity);
    /**
     * 根据图书编号删除图书
     */
    public int delete(int id);
    /**
     * 更新图书
     */
    public int update(Book entity);
}
