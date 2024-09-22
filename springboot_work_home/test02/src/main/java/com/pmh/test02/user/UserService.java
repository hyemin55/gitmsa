package com.pmh.test02.user;

import com.pmh.test02.error.BizException;
import com.pmh.test02.error.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

//Spring 담는 객체에 service를 넣는다.
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    //    email이 중복이면 에러코드
//    email이 중복이 아니면 insert를 정상적으로 입력
    public void insert(UserReqDto userReqDto) {

        Optional<User> optionalUser = userRepository.findByEmail(userReqDto.getEmail());
//        에러가 발생하면 ModelMapper로 가지않고 ErrorController로 간다.
        optionalUser.ifPresent(user -> {
            throw new BizException(ErrorCode.DUPLICATE_USERS);
        });

        //      ModelMapper를 사용하면 userReqDto의 값들이 User.class로 변경되어 userRepository.save(user);을 저장할 수 있다.
        ModelMapper modelMapper = new ModelMapper();
        User user = modelMapper.map(userReqDto, User.class);
        userRepository.save(user);
    }
}
