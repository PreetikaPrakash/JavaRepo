package coreJava;

/*  OBJECTIVE
    -Main coreJava.method should not assign the student coreJava.rollnumber i.e. through parameterized constructor don't pass the
    coreJava.rollnumber instead class itself should assign a coreJava.rollnumber.
    -STATIC , private, public usage
    -roll number format = RA@2001, RA@2002.....
*/
class rollnumber{
    private static int count=2000;
    private String stro;
    rollnumber(){
        // assignRollNum has to return an object;
        stro=assignRollNum();
    }
    String assignRollNum(){
        String str="RA@"+ count;
        count++;
        return str;
    }
    // To see the coreJava.rollnumber
    public String getStudentRollNumber(){
        return stro;
    }
}
public class student_rollnumber {
    public static void main(String...args){
        rollnumber student1 = new rollnumber();
        System.out.println(student1.getStudentRollNumber());
        rollnumber student2 = new rollnumber();
        System.out.println(student2.getStudentRollNumber());
        rollnumber student3 = new rollnumber();
        System.out.println(student3.getStudentRollNumber());
    }
}
/* -> OUTPUT
RA@2000
RA@2001
RA@2002
*/