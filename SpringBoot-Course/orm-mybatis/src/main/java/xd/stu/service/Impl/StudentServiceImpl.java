package xd.stu.service.Impl;

import org.springframework.stereotype.Service;
import xd.stu.dao.StudentDao;
import xd.stu.entity.Student;
import xd.stu.service.StudentService;

import javax.annotation.Resource;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentDao studentDao;
    @Override
    public Student queryStudentById(Integer id) {
        return studentDao.selectStudentById(id);
    }
}
