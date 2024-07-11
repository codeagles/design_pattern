package com.codegales.designpattern.principle.openclosed;

/**
 * 英语课程类
 * @author Miico
 * @date 2024/7/11
 * @description 英语课程类
 */
public class EnglishCourse implements ICourse{

    private Integer id;
    private String name;
    private Double price;

    public EnglishCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getCourseId() {
        return this.id;
    }

    @Override
    public String getCourseName() {
        return this.name;
    }

    @Override
    public Double getCoursePrice() {
        return this.price;
    }
}
