package com.pmh.test02.user;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping("select")
    public List<User> select(){

        return userRepository.findAll();
    }

//    @RequestBody User user -> DB에 insert한다.
    @PostMapping("insert")
    public String insert(@Valid @RequestBody UserReqDto userReqDto){

//        userReqDto의 값들이 User.class로 변경되어 userRepository.save(user);을 저장할 수 있다.
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        userRepository.save(user);
        return "ok";
    }
}
