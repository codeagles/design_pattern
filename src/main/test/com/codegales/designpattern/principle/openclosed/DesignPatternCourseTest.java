package com.codegales.designpattern.principle.openclosed;

import junit.framework.TestCase;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Miico
 * @date 2024/7/11
 * @description 测试类
 */
public class DesignPatternCourseTest {

    public static void main(String[] args) {
        ICourse designPatternCourse = new DesignPatternCourse(1, "设计模式课程", 299d);
        ICourse englishCourse = new EnglishCourse(2, "英语速记课程", 199d);
        System.out.println("课程id:" + designPatternCourse.getCourseId()
                + " 课程名称："+designPatternCourse.getCourseName() + " 课程价格："+ designPatternCourse.getCoursePrice());
        System.out.println("课程id:" + englishCourse.getCourseId()
                + " 课程名称："+englishCourse.getCourseName() + " 课程价格："+ englishCourse.getCoursePrice());
    }


}