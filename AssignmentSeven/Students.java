public class Students {
    int rollno;
    String name;
    Students(int rollno,String name){
        this.rollno = rollno;
        this.name = name;
    }
    Students(int rollno){
        this.rollno = rollno;
        this.name = "Unknown";
    }
    void displayStudentDetails(){
        System.out.println("Roll number: " +rollno);
        System.out.println("Name: " +name);
    }

    public static void main(String[] args){
        Students obj = new Students(13,"Divya");
        Students obj2 = new Students(15);
        obj.displayStudentDetails();
        obj2.displayStudentDetails();

    }
}
