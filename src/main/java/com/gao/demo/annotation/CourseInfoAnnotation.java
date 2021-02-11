package com.gao.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 课程信息注解类
 *
 * @author lianggao
 */
@Target({ElementType.TYPE, ElementType.METHOD})//类和方法
@Retention(RetentionPolicy.RUNTIME)//运行时注解也存在
public @interface CourseInfoAnnotation {
    //课程名称
    String courseName();

    //课程标签
    String courseTag();

    //课程简介
    String courseProfile();

    //课程序号
    int courseIndex() default 303;

}
