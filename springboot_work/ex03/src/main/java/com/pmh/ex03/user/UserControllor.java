package com.pmh.ex03.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController //url 맵하는 클래스
@RequestMapping("user") //주소줄에 user로 시작하는거야
@RequiredArgsConstructor //new 생성 없이 자동으로 객체 불러오기(private final 선언)
@CrossOrigin
public class UserControllor {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select() {
        return userRepository.findAll();
    }

    @PostMapping("insert")
//    @RequestBody는 postmap에서 body에서 보낸다.
    public String insert(@RequestBody User user) {
        System.out.println("실행");
//		save insert 실행...

//        User user = User.builder()
//                .name("홍길동")
//                .age(30)
//                .email("aaa@naver.com")
//                .password("1234")
//                .wdate(LocalDateTime.now())
//                .build();
        userRepository.save(user);
        return "ok";
    }
}
