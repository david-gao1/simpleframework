package com.gao.demo.annotation;

/**
 * 使用自定注解
 *
 * @author lianggao
 */
@CourseInfoAnnotation(courseName = "spring框架学习", courseTag = "面试", courseProfile = "提升源码阅读水平")
public class MyCourse {

    @PersonInfoAnnotation(name = "gaogao", language = "中文")
    private String author;

    @CourseInfoAnnotation(courseName = "校园商铺", courseProfile = "全面了解ssm框架", courseTag = "实战")
    public void getCourseInfo() {

    }
}
