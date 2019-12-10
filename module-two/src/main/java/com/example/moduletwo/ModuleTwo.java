package com.example.moduletwo;

import com.example.moduleonetest.model.Student;

import java.util.logging.Logger;

public class ModuleTwo {

    private static Logger log = Logger.getLogger("ModuleTwo");

    public static void main(String[] args) {
        log.info("module tow 测试");
        System.out.println("module two");
        Student student = new Student("wzw", 30);
        System.out.println(student.getName());
    }
}
