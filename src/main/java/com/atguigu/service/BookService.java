package com.atguigu.service;

import com.atguigu.dao.BookMapper;
import com.atguigu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> queryBooks() {
        return bookMapper.queryBooks();
    }



}
