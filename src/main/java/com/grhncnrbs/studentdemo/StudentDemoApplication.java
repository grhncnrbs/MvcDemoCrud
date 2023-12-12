package com.grhncnrbs.studentdemo;

import com.grhncnrbs.studentdemo.entity.Student;
import com.grhncnrbs.studentdemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDemoApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;
    public static void main(String[] args) {
        SpringApplication.run(StudentDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*Student student1 = new Student("Ali", "Veli", "ali@gmail.com");
        studentRepository.save(student1);

        Student student2 = new Student("Can", "Kan", "can@gmail.com");
        studentRepository.save(student2);

        Student student3 = new Student("Test", "Tan", "tan@gmail.com");
        studentRepository.save(student3);*/
    }
}
