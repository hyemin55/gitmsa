package com.example.ex10.freeboard;

import com.example.ex10.file.FileEntity;
import com.example.ex10.user.User;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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
    @Column(updatable = false)
    private LocalDateTime regDate;

    @LastModifiedDate
    private LocalDateTime modDate;

    @Column(columnDefinition = "int default 0")
    private int view_Count;

//    서로 참조해야할 때 양방향 매핑이라한다. mappedBy를 사용해 참조할 이름을 똑같이 적어줘야한다.
//    EAGER는
//    LAZY가 기본값이다.
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "freeBoard")
    private List<FileEntity> list = new ArrayList<>();
}
