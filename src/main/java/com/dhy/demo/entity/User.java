package com.dhy.demo.entity;

public class User {
    /**
     * 表：user
     * 字段：id
     * 注释：
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * 表：user
     * 字段：name
     * 注释：
     *
     * @mbggenerated
     */
    private String name;

    /**
     * 表：user
     * 字段：age
     * 注释：
     *
     * @mbggenerated
     */
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}