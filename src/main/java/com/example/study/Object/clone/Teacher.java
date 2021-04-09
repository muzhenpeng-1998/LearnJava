package com.example.study.Object.clone;

/**
 * 深拷贝
 */
public class Teacher implements Cloneable{

    private String name;
    private Student student;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    @Override
    public String toString() {
        return "Teacher [name=" + name + ", student=" + student + "]";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("张三");
        Teacher teacher1 = new Teacher();
        teacher1.setName("小赵老师");
        teacher1.setStudent(s1);
        //为什么会出现以下结果, Teacher中的clone方法
        Teacher teacher2 = (Teacher)teacher1.clone();
        Student s2 = teacher2.getStudent();
        s2.setName("李四");
        s2.setAge(30);
        System.out.println("teacher1:"+teacher1);
        System.out.println("teacher2:"+teacher2);
    }
}
