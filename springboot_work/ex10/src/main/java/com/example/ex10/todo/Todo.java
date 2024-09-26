package com.example.ex10.todo;

import com.example.ex10.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.Length;
import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@EntityListeners(AuditingEntityListener.class)
public class Todo {

    @Id
//    숫자 자동입력
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

//    user는 하나이고 todo는 여러개이다.
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

//    content 데이터 길이는 1000이다.
    @Column(length = 1000)
    private String content;

//    현재시간 입력
    @CreatedDate
//    업데이트 시 수정X
    @Column(updatable = false)
    private LocalDateTime Date;
}
