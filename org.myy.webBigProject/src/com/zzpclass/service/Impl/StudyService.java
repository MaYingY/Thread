package com.zzpclass.service.Impl;

import com.zzpclass.dao.IStudyInfoDao;
import com.zzpclass.entity.StudyInfo;
import com.zzpclass.service.IStudyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudyService implements IStudyService {

    @Autowired
    private IStudyInfoDao studyInfoDao;

    @Override
    public List<StudyInfo> getAllClzByStuId(String stuId) {
        return studyInfoDao.selectByStuId(stuId);
    }

    @Override
    public List<StudyInfo> getAllStuByClzId(Integer clzId) {
        return studyInfoDao.selectByClzId(clzId);
    }

    @Override
    public void delCourse(String stuId, Integer clzId) {
        studyInfoDao.delete(stuId,clzId);
    }
}
