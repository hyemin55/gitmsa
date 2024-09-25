//package com.example.ex10.todo;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//@RequestMapping(name = "todo")
//
//public class TodoController {
//
//    @GetMapping("select")
//    public ResponseEntity<List<Todo>> select(){
//        return ResponseEntity.status(200).body(TodoRepository.findAll());
//    }
//}
