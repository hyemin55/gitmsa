package com.example.ex09.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select() {
        return ResponseEntity.status(200).body(userRepository.findAll());
    }

    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto) {
//              select * from where idx = ?
//               userRepository.findAllById();

        userService.insert(userReqDto);
        // save insert 실행...
//        User user = User.builder()
//                .name("홍길동")
//                .age(20)
//                .email("aaa@naver.com")
//                .password("password")
//                .wdate(LocalDateTime.now())
//                .build();


        return ResponseEntity.status(200).body("success insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto) {
        System.out.println("실행" + userReqDto);

        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);

        System.out.println("user = " + user);
        userRepository.save(user);
        return ResponseEntity.status(200).body("success update");

    }

    @DeleteMapping("delete/{idx}")
    public String delete(@PathVariable long idx) {
        userRepository.deleteById(idx);
        System.out.println(idx);
        return "deleted";
    }
}
