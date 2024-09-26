package com.example.ex10.todo;

import com.example.ex10.user.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Data
public class TodoReqDto {

    private Long idx;

    @NotEmpty
    private User user;

    @NotEmpty
    private String content;

    @NotEmpty
    private LocalDateTime Date;
}
