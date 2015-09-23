package com.nigel.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookService
{
  private static Map<Integer, Book> books = new HashMap<Integer, Book>();
  // 保留下本图书�?ID
  private static int nextId = 5;

  // 以内存中的数据模拟数据库的持久存�?
  static
  {
    books.put(1, new Book(1, "Java 1", 99));
    books.put(2, new Book(2, "Java EE", 89));
    books.put(3, new Book(3, "Ajax", 78));
    books.put(4, new Book(4, "Struts 2", 79));
  }

  // 根据 ID 获取
  public Book get(int id)
  {
    return books.get(id);
  }

  // 获取系统中全部图�?
  public List<Book> getAll()
  {
    return new ArrayList<Book>(books.values());
  }

  // 更新已有的图书或保存新图�?
  public void saveOrUpdate(Book book)
  {
    // 如果试图保存的图书的 ID �?null，表明是保存新的图书
    if (book.getId() == null)
    {
      // 为新的图书分�?ID�?
      book.setId(nextId++);
    }
    // 将保�?book
    books.put(book.getId(), book);
  }

  // 删除图书
  public void remove(int id)
  {
    books.remove(id);
  }
}
