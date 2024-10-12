package com.example.springapplication.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    List<Topic> listTopics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "SpringBoot", "This Topic is about SpringBoot"),
            new Topic("python", "Python", "This Topic is about Python"),
            new Topic("django", "Django", "This Topic is about Django")
        )
    );

    public List<Topic> getAllTopics() {
        return listTopics;
    }

    public Topic getTopic(String id) {
        return listTopics.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        listTopics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (int i = 0; i < listTopics.size(); i++) {
            Topic t = listTopics.get(i);

            if (t.getId().equals(id)) {
                listTopics.set(i, topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        listTopics.removeIf(topic -> topic.getId().equals(id));
    }
}
