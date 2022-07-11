package com.example.demo.resource;

import com.example.demo.model.Camera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class CameraResource {
    @Autowired
    KafkaTemplate<String, Camera> kafkaTemplate;

    @GetMapping("/publish/{time}")
    public String postMessage(@PathVariable("time") final String time){
        kafkaTemplate.send("test", new Camera(time, "123" + "jpg", 1));
        return "전송에 성공하였습니다";
    }
}
