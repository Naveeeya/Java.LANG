public class Student {
    public static void main(String[] args){}
    private final int id;
    private final String name;
    private final String course;
    private final int year;

    // Constructor
    public Student(int id, String name, String course, int year) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
