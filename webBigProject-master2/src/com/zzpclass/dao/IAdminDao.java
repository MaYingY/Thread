package com.zzpclass.dao;

import com.zzpclass.entity.Admin;
import com.zzpclass.entity.Course;
import com.zzpclass.entity.Student;
import com.zzpclass.entity.StudyInfo;

import java.util.List;

public interface IAdminDao {

    public Admin selectById(String id);

    public List<Student> selectAllStudents();

    public List<Course> selectAllCourses();

    public void updateStudent(Student student);

    public Student selectStuById(String id);

    public void addStudent(Student student);

    public void delStudent(String id);

    public void addCourse(Course course);

    public void delCourse(Integer id);

    public List<StudyInfo> selectAllStudyInfo();

    public void addStudyInfo(StudyInfo studyInfo);

    public void delStudyInfo(Integer id);

    public StudyInfo selectById(Integer id);

    public void delStudyInfoByCId(Integer id);

    public void delStudyInfoBySId(String id);
}
