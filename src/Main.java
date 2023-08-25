public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstName = "Begüm";
        s1.department = "Uygulamalı Bilimler";

        Instructor i1 = new Instructor();
        i1.firstName = "Serkan";
        i1.faculty = "Eğitim";






//        UserManager userManager = new UserManager();
//        userManager.add(s1);
//        userManager.add(i1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(i1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(s1);

    }
}