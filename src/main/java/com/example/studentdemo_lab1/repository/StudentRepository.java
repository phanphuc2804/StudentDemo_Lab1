package com.example.studentdemo_lab1.repository;

import com.example.studentdemo_lab1.entity.Student;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    //save
    public Student save(Student student);
    //read
    //CRUD
    public List<Student> findStudentByLastName(String lastName);
    public List<Student>findAll();
    public Student findStudentByEmail(String email);

    //JPQL
    @Query("select s from Student s where s.lastName=?1")
    public Student findStudentByLastNameJPQL(String lastName);

    @Query("select s from Student s where s.lastName=?1 and s.email=?2")
    public Student findStudentByLastNameAndEmailJPQL(String lastName, String email);

    //Native
    @Query(value = "select * from tbl_student where studentid=?1", nativeQuery = true)
    public Student findStudentByIdNative(Long id);

    @Query(value = "select * from tbl_student s", nativeQuery = true)
    public List<Student> findAllStudentNative();


    //update
    //CRUD

    //JPQL
    @Transactional
    @Modifying
    @Query("update Student s set s.firstName=?2 where s.studentID =?1")
    public void updateByIdJPQL(Long id, String firstName);


    //CRUD
    @Transactional
    @Modifying
    public void deleteByStudentID(Long id);
    //JPQL
    @Transactional
    @Modifying
    @Query("delete from Student s where s.studentID=?1")
    public void deleteStudentByIdJPQL(Long id);


    @Transactional
    @Modifying
    @Query("delete from Student s  where s.email=?1")
    public void deleteStudentByEmailJPQL(String email);
    //Native
    @Transactional
    @Modifying
    @Query(value = "delete from tbl_student where studentID=?1", nativeQuery = true)
    public void deleteStudentByIdNative(Long id);

    @Transactional
    @Modifying
    @Query(value = "delete from tbl_student where email=?1",nativeQuery = true)
    public void deleteStudentByEmailNative(String email);
    //update
    //JPQL
    @Transactional
    @Modifying
    @Query("update Student s set s.firstName=?2 where s.studentID=?1")
    public void updateFirstNameStudentByIDJPQL(Long id, String firstName);

    //Native
    @Transactional
    @Modifying
    @Query(value = "update tbl_student set last_Name=?2 where studentID=?1", nativeQuery = true)
    public void updateLastNameStudentByIdNative(Long id, String lastName);
}
