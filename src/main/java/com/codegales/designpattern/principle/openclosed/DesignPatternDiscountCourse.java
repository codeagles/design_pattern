package com.codegales.designpattern.principle.openclosed;

/**
 * 设计模式课程类
 * @author Miico
 * @date 2024/7/11
 * @description 设计模式课程类
 */
public class DesignPatternDiscountCourse extends DesignPatternCourse{

    public DesignPatternDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Double getCoursePrice() {
        return super.getCoursePrice() * 0.7;
    }

    public Double getOriginalPrice() {
        return super.getCoursePrice();
    }
}
