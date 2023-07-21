public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private int age;


    public Student(String name, int rollNumber, String grade,int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }
     public int getage() {
        return age;
    }
}