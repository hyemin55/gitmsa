package com.example.ex10.todo;

import com.example.ex10.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;
import org.hibernate.annotations.Cascade;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Todo {


    private Long idx;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    private String content;
    private LocalDateTime Date;
}
