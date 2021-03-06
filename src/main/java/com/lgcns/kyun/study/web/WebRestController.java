package com.lgcns.kyun.study.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lgcns.kyun.study.domain.posts.PostsRepository;
import com.lgcns.kyun.study.dto.PostsSaveRequestDto;
import com.lgcns.kyun.study.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld~~~~!!!!!";
    }
    
    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}