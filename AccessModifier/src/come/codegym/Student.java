package come.codegym;

public class Student {
    private int rollno;
    private String name;
    private static String college = "BK university";

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    static void change(){
        college = "University of industry";
    }

    void display(){
        System.out.println(rollno+"  "+name+"  "+college);
    }

}

