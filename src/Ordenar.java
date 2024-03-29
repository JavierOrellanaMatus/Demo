import java.util.*;

class Student implements Comparable<Student>
{
    private String name;
    private int age;
 
    public Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString()
    {
        return "{" + "name='" + name + '\'' +
                    ", age=" + age + '}';
    }
 
    public String getName() {
        return name;
    }
 
    public int getAge() {
        return age;
    }
 
    @Override
    public int compareTo(Student o)
    {
        if (this.age != o.getAge()) {
            return this.age - o.getAge();
        }
        return this.name.compareTo(o.getName());
    }
}
 
class Ordenar
{
    public static void main(String[] args)
    {
        Student[] students = { new Student("John", 15), new Student("Sam", 20),
                                new Student("Dan", 20), new Student("Joe", 10),
                                new Student("Joe", 1), new Student("Joe", 5)};
 
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
