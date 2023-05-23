package com.app.SpringBootOneToMany.runner;

import com.app.SpringBootOneToMany.entity.Book;
import com.app.SpringBootOneToMany.entity.Student;
import com.app.SpringBootOneToMany.repo.BookRepository;
import com.app.SpringBootOneToMany.repo.StudentRepository;
import javafx.beans.binding.SetBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Set;


@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private BookRepository brepo;

    @Autowired
    private StudentRepository srepo;

    @Override
    public void run(String... args) throws Exception {

        //book objs
        Book bk1 = new Book(50,"DS");
        Book bk2 = new Book(60,"SB");

        //save books
        brepo.save(bk1);
        brepo.save(bk2);

        //set
        Set<Book> s1 =Set.of(bk1, bk2);
        

        //stu obj


        Student st1 = new Student(101,"SAM",s1);

        //save stu obj
        srepo.save(st1);

    }
}
