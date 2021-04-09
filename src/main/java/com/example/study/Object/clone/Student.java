package com.example.study.Object.clone;

/**
 * 浅拷贝
 */
public class Student implements Cloneable {
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    /**
     * @param args
     * @throws CloneNotSupportedException
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
        Student student1 = new Student(20, "张三");
        Student student2 = (Student) student1.clone();
        student2.setAge(22);// 注意修改student2的age值 但是没有影响 student1的值
        System.out.println("student1：" + student1.getName() + "-->"+ student1.getAge());
        System.out.println("student2：" + student2.getName() + "-->"+ student2.getAge());

    }
}

