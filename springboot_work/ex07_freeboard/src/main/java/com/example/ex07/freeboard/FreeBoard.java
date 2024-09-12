package com.example.ex07.freeboard;

import com.example.ex07.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Getter
@Setter
public class FreeBoard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTOINCREMENT 이거 설정해줘...
    private Long idx;

    private String title;
    private String content;


//   User테이블엔 1개이고 FreeBoard 테이블이 여러개이다.
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    private LocalDateTime regDate;
    private LocalDateTime modDate;

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