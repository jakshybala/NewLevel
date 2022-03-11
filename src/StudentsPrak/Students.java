package StudentsPrak;

import java.util.Comparator;
import java.util.Objects;

public class Students implements Comparable<Students> {
    private String name;
    private String email;
    private Group group;
    private int age;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name) && Objects.equals(email, students.email) && group == students.group;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, email, group, age);
    }

    public Students(String name, String email, Group group, int age) {
        this.name = name;
        this.email = email;
        this.group = group;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public int compareTo(Students o) {
        return getAge() > o.getAge()? -1:1;
    }
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", group=" + group +
                ", age=" + age +
                '}';
    }


}
