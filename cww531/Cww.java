package cww531;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cww implements Serializable {
    private String name;
//    private List<Food> foods  new ArrayList<>();
//    public  static class Food(){

//    }
//    private int age;
//    private String sex;
//    //transient修饰的变量，
    private int age;
    private  String sex;
//     transient private int stuId;
    transient  private  int stuId;
    private static  int count = 99;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Cww.count = count;
    }

    @Override
    public String toString() {
        return "Cww{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", stuId=" + stuId +
                '}';
    }
}
