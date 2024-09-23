package com.example.ex10.freeboard;

import com.example.ex10.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
//@Table(name = "freeboard") <- 이름 바꾸고싶으면 적기
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long idx;

    private String title;
    private String content;


//   User테이블엔 1개이고 FreeBoard 테이블이 여러개이다.
//    영속성의 특성(영속성 전파)으로 FreeBoard만 저장을해도 User도 같이 저장이된다.
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @CreatedBy
    private String creAuthor;

    @LastModifiedBy
    private String modAuthor;

    @CreatedDate
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int view_Count;
}
//create table free_board (
//        view_count integer not null,
//        idx bigint not null auto_increment,
//        mod_date datetime(6),
//reg_date datetime(6),
//user_idx bigint,
//content varchar(255),
//title varchar(255),
//primary key (idx)
//    ) engine=InnoDB
//Hibernate:
//create table users (
//        age integer not null,
//        idx bigint not null auto_increment,
//        wdate datetime(6),
//username varchar(50) not null,
//email varchar(100),
//password varchar(100),
//primary key (idx)
//    ) engine=InnoDB