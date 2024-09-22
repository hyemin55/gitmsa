package com.pmh.test02.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("select")
    public ResponseEntity<List<User>> select(){

        return ResponseEntity.status(200).body(userRepository.findAll());
    }

//    @RequestBody User user -> DB에 insert한다.
//    ResponseEntity는 Entity의 상태가 몇번인지 알려준다.
    @PostMapping("insert")
    public ResponseEntity<String> insert(@Valid @RequestBody UserReqDto userReqDto){


        userService.insert(userReqDto);

//        select * from where idx=?
//        userRepository.findById()


        return ResponseEntity.status(200).body("success insert");
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@Valid @RequestBody UserReqDto userReqDto){
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        userRepository.save(user);
        return ResponseEntity.status(200).body("success update");
    }

//    @RequestParam은 포스트맵 주소줄에 쿼리 문자열에서 값을 가져오고 <- 선택적이고 여러개를 가질 수 있다.
//    @PathVariable은 포스트맵 주소줄에 URL 경로에서 값을 가져온다. <- 보통 필수적이고 명확한 리소스이다.
    @DeleteMapping("delete")
    public ResponseEntity<String> delete(@PathVariable Long idx){
        userRepository.deleteById(idx);
        return ResponseEntity.status(200).body("success delete");
    }
}
