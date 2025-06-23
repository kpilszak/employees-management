package com.kpilszak.employeesmanagement;

import com.kpilszak.employeesmanagement.dao.StudentDAO;
import com.kpilszak.employeesmanagement.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student student = new Student("Paul", "Doe", "paul@luv2code.com");

        System.out.println("Saving the student ...");
        studentDAO.save(student);

        System.out.println("Saved student. Generated id: " + student.getId());
    }



}
