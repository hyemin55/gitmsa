package com.example.ex10.file;

import com.example.ex10.freeboard.FreeBoard;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "freeBoardFile")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FileEntity {

//   기본키 생성
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private String path;
    private String fileDesc;

    @Override
    public String toString() {
        return "FileEntity{" +
                "idx=" + idx +
                ", name='" + name + '\'' +
                ", path='" + path + '\'' +
                ", fileDesc='" + fileDesc +
                '}';
    }

    //    JoinColunm(name = "free_board_iddx")는 생략가능하다.
    @ManyToOne
//    N+1 이슈를 해결할 때 사용한다.
    @JsonIgnore
    private FreeBoard freeBoard;
}
