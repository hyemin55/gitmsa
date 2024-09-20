package com.example.ex09.freeboard;

import com.example.ex09.user.User;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;


@Data
public class FreeBoardReqDto {

    private Long idx;

//   @Schema(example = "보여주고싶은말")란 swagger ui에서 보여주고 싶은 칼럼에 사용한다.
    @Schema(example = "제목을 넣어주세요")
    @Length(min = 2, max = 255) // title 내용이 최소 2자이어야한다.
    private String title;

    @Schema(example = "내용을 넣어주세요")
    @NotEmpty //내용이 없으면 오류이다. 저장할 곳에 @Valid를 사용해줘야한다.
    private String content;

    private User user;


//  @Schema(hidden = true)란 swagger ui에서 숨기고 싶은 칼럼에 사용한다.
    @Schema(hidden = true)
    private LocalDateTime regDate;
    @Schema(hidden = true)
    private LocalDateTime modDate;
    @Schema(hidden = true)
    private int viewCount;


}
