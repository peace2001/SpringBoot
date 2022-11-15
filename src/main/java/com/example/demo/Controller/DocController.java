package com.example.demo.Controller;

import com.example.demo.pojo.Doc;
import com.example.demo.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
public class DocController {
    @Autowired
    DocRepository docRepository;

//    @GetMapping("alldoc")
//    public String AllDoc(Pageable pageable){
//        Optional<Doc> optional = docRepository
//        return "success";
//    }
}
