package com.example.ex10.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("todo")
@RequiredArgsConstructor
//@CrossOrigin
public class TodoController {

    private final TodoRepository todoRepository;

    @GetMapping("select")
//    public String select(){return "hihi";}
    public ResponseEntity<List<Todo>> select(){

        return ResponseEntity.ok().body(todoRepository.findAll());
    }
}
