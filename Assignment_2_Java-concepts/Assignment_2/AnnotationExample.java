class Student {

    @Override
    public String toString() {

        return "Rajeev";

    }

}

public class AnnotationExample {

    @Deprecated
    static void oldMethod() {

        System.out.println("Old Method");

    }

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println(s);

        oldMethod();

    }

}