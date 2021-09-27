package classes;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})

@RestController
public class ServiceProvider {

    List<Student> studentList = new ArrayList<>();


    // C= Create R = Read U = Update D = Delete

    // Create = POST Mapping
    // Read = GET  Mapping
    // Update = PUT Mapping
    // Delete = DELETE  Mapping

    // localhost:Port Number/connect

    // Messages on my Browser saying that which method was called GET Mapping , Post Mapping

//    @GetMapping("/connect")
//    public String getMethod(){
//        return "hello Get method has been called";
//
//    }
//
//    @PostMapping("/connect")
//    public String postMethod(){
//        return "hello Post method has been called";
//    }
//
//    @PutMapping("/connect")
//    public String putMethod(){
//        return "hello Put Method has been called ";
//    }
//
//    @DeleteMapping("/connect")
//    public String deleteMethod(){
//        return "hello Delete Method has been called";
//    }

    // GEt multiple Students
    @GetMapping("/getAllStudentData")
    public List<Student> getAllData() {
        return studentList;
    }


    // Get one Student
    @GetMapping("/getoneStudent/{id}")
    public Student getOneStudent(@PathVariable String id) {

        for (Student student : studentList) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }


    // Adding a student

    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {

        if (student != null) {
            studentList.add(student);
            return "student added";
        } else {
            return "error in adding student";
        }
    }


    // Updating the Details of the User
    @PutMapping("/updateStudentDetails/{id}/{studentName}")
    public Student updateStudent(@PathVariable String id, @PathVariable String studentName) {

        for (Student student : studentList) {
            if (student.getStudentId().equalsIgnoreCase(id)) {
                student.setStudentName(studentName);
                return student;
            }
        }
        return null;
    }

    @DeleteMapping("/deleteStudentDetails/{id}")
    public String deleteStudent(@PathVariable String id) {

        for (int i=0;i<studentList.size();i++) {
            if (studentList.get(i).getStudentId().equalsIgnoreCase(id)) {
                studentList.remove(i);
                return "student data deleted";
            }
        }
        return "student not found";
    }


}
