package com.codegales.designpattern.principle.openclosed;

/**
 * 课程接口
 * @author Miico
 * @date 2024/7/11
 * @description 课程接口，定义课程相关方法
 */
public interface ICourse {

    public Integer getCourseId();
    public String getCourseName();
    public Double getCoursePrice();
}
