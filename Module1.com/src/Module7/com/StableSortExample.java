package Module7.com;

public class StableSortExample {

    static class Student {
        int marks;
        String name;

        Student(int marks, String name) {
            this.marks = marks;
            this.name = name;
        }
    }

    public static void main(String[] args) {

        Student[] students = {
                new Student(90,"A"),
                new Student(85,"B"),
                new Student(90,"C"),
                new Student(80,"D")
        };

        for(int i=0;i<students.length-1;i++){
            for(int j=0;j<students.length-i-1;j++){

                if(students[j].marks > students[j+1].marks){

                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }

        for(Student s : students){
            System.out.println(s.marks + " " + s.name);
        }
    }
}
