package me.salisuwy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class BlogController {

    @Autowired
    BlogRespository blogRespository;

    @GetMapping("/blog")
    public List<Employee1> index(){
        return blogRespository.findAll();
    }

    @GetMapping("/blog/{id}")
    public Optional<Employee1> show(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        return blogRespository.findById(blogId);
    }







}