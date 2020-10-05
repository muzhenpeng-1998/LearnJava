package com.example.study.IOC.day1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//�����е�person������ʲôʱ�򴴽��ģ�
//�����еĶ����������������֮ǰ���Ѿ��Ѷ��󴴽�����
public class test {
    public static void main(String[] args) {
        /*
         * applicationContext:��ʾIOC��������ڣ���Ҫ��ȡ����Ļ�������Ҫ��������
         *   ������������ȡ�����ļ���ʵ����
         *       ClassPathXmlApplicationContext:��ʾ��classpath�ж�ȡ����
         *       FileSystemXmlApplicationContext:��ʾ�ӵ�ǰ�ļ�ϵͳ��ȡ����
         * * */
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/study/IOC/day1/ioc.xml");
        //��ȡ�����beanʵ��������Ҫ����ǿ������ת��
//        Person person = (Person) context.getBean("person");
        //��ȡ�����ʱ����Ҫǿ������ת��
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
