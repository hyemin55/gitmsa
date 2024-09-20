package com.example.ex09.freeboard;

import com.example.ex09.user.User;
import com.example.ex09.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class FreeBoardRepositoryTest {

    //    스프링 객체 담는 통에서 freeboardRepository 객체 가져오기
    @Autowired
    FreeBoardRepository freeBoardRepository;

    @Autowired
    UserRepository userRepository;

//    1. UserRepository
//    2. Cascade JPA 속성

    @Test
//    @Transactional <- 테스크할 때 생성된 내용은 DB에 남기지 않으려할때 사용함.
    void insertTest() {
        User user = User.builder()
                .name("홍길동")
                .age(20)
                .email("www@naver.com")
                .password("password")
                .build();

//        userRepository.save(user); <-Cascade를 넣어주면 FreeBoard에서
//        freeBoardRepository.save(freeBoard); 이걸 실행했을때
//        user의 내용도 같이 들어간다.

        FreeBoard freeBoard = FreeBoard.builder()
                .title("제목")
                .content("내용")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }

    @Test
    void selectTest() {
        List<FreeBoard> list = freeBoardRepository.findAll();
        list.stream().forEach(System.out::println);
    }

    @Test
    void deleteTest() {
        freeBoardRepository.deleteById(2l);
    }

    @Test
    void updateTest() {
        User user = User.builder()
                .name("김길동")
                .age(20)
                .email("ddd@naver.com")
                .password("password")
                .build();


        FreeBoard freeBoard = FreeBoard.builder()
                .idx(3l)
                .title("제목2")
                .content("내용2")
                .user(user)
                .build();
        freeBoardRepository.save(freeBoard);
    }
}