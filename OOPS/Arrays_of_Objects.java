
class Student{
    String name;
    int marks;
}



public class Arrays_of_Objects {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ramana";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Guru";
        s2.marks = 80;

        Student s3 = new Student();
        s3.name = "King";
        s3.marks = 100;


        Student student[] = new Student[3];
        student[0] = s1;
        student[1] = s2;
        student[2] = s3;

        // for(int i = 0 ; i < student.length; i++){
        //     System.out.println("Name: " + student[i].name + " " + " Marks: " + student[i].marks); 
        // }


        for(Student stu : student){
            System.out.println("NAME : " + stu.name + " " +  " MARKS : " + stu.marks); // Enhanced for loop
        }

        
    }
    
}
