package com.lhz.springtest.entity;

import java.time.LocalDateTime;

/**
 * @author LHZ
 * @date 2023/7/5 16:35
 */
public class Work {

    String name;

    LocalDateTime time;

    String teacher;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
