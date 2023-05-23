package com.app.SpringBootOneToMany.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.utility.dispatcher.JavaDispatcher;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "stdtab")
public class Student {

    @Id
    private Integer sid;

    private String sname;

    @OneToMany
    @JoinColumn(name = "sidFk")
    private Set<Book> bobs;
}
