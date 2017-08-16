package com.zzpclass.service;

import com.zzpclass.entity.StudyInfo;

import java.util.List;

public interface IStudyService {

    public List<StudyInfo> getAllClzByStuId(String stuId);

    public List<StudyInfo> getAllStuByClzId(Integer clzId);

    public void delCourse(String stuId,Integer clzId);

}
