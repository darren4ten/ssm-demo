package com.darren.mvc.controller;

import com.darren.mvc.pojo.Book;
import com.darren.mvc.service.IService.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    IBookService bookService;

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String getBook(int id, ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
//        Object id = model.("id");
//        int idInt = Integer.parseInt(id.toString());
        Book book = bookService.getBookById(id);
        model.addAttribute("book", book);
        return "book";
    }
}
