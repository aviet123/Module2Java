package come.codegym;

public class TestStaticMethod{
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(1,"Văn");
        Student s2 = new Student(2,"Lâm thồn");
        Student s3 = new Student(3,"Nghĩa béo");


        s1.display();
        s2.display();
        s3.display();

    }

}
