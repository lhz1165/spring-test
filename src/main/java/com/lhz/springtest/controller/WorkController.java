package com.lhz.springtest.controller;

import com.lhz.springtest.entity.Work;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author LHZ
 * @date 2023/7/5 16:34
 */
@RestController
public class WorkController {

    @GetMapping("/getWork")
    public List<Work>getWork(){
        List<Work> works = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Work work = new Work();
            work.setName("aaa"+i);
            work.setTeacher("teacher "+i);
            work.setTime(LocalDateTime.now());
            works.add(work);
        }
        return works;
    }
}
