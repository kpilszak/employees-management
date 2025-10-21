package com.kpilszak.employeesmanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class EmployeesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesManagementApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
            deleteAllStudents(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student student = new Student("Paul", "Doe");

        System.out.println("Saving the student ...");
        studentDAO.save(student);

        System.out.println("Saved student. Generated id: " + student.getId());
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
        System.out.println("Creating 3 student objects ...");
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Mary", "Public");
        Student student3 = new Student("Bonita", "Applebum");

        System.out.println("Saving the students ...");
        studentDAO.save(student1);
        studentDAO.save(student2);
        studentDAO.save(student3);
    }

    private void readStudent(StudentDAO studentDAO) {
        System.out.println("Creating new student object ...");
        Student student = new Student("Daffy", "Duck");

        System.out.println("Saving the student ...");
        studentDAO.save(student);

        int id = student.getId();
        System.out.println("Saved student. Generated id: " + id);

        System.out.println("Retrieving student with id: " + id);
        Student savedStudent = studentDAO.findById(id);

        System.out.println("Found the student: " + savedStudent);
    }

    private void queryForStudents(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void queryForStudentsByLastName(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findByLastName("Duck");

        for (Student student : students) {
            System.out.println(student);
        }
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;

        System.out.println("Getting student with id: " + studentId);
        Student student = studentDAO.findById(studentId);

        System.out.println("Updating student...");
        student.setFirstName("Scooby");

        studentDAO.update(student);

        System.out.println("Updated student: " + student);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3;

        System.out.println("Deleting student id: " + studentId);
        studentDAO.delete(studentId);
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all students");
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Deleted row count: " + numRowsDeleted);
    }
}
