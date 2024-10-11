package com.example.springapplication.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return Arrays.asList(
                new Topic(1, "SpringBoot", "This Topic is about SpringBoot"),
                new Topic(2, "Python", "This Topic is about Python"),
                new Topic(3, "Django", "This Topic is about Django")
        );
    }
}
