package vo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("学生梁宁")
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.sex}")
    private String sex;
    @Value("${student.age}")
    private Integer age;

//    setter and getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    重写toString

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
