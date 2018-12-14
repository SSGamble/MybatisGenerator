package top.qingrang.dao;

import top.qingrang.pojo.Student;
import top.qingrang.pojo.StudentExample;

import java.util.List;

public interface StudentMapper {
    // 利用 Example 查询
    List<Student> selectByExample(StudentExample example);

    // 根据 pk 查询
    Student selectByPrimaryKey(Integer id);

    // 根据 pk 删除
    int deleteByPrimaryKey(Integer id);

    // 插入，会插入所有字段，包括 null
    int insert(Student record);

    // 插入，不会插入 null 的字段值
    int insertSelective(Student record);

    // 根据 pk 更新所有字段
    int updateByPrimaryKey(Student record);

    // 根据 pk 更新传递过来的不为 null 的 字段
    int updateByPrimaryKeySelective(Student record);
}