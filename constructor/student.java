package constructor;

public class student {
    private String name ;
    private String age;
    private String rollno;
   
    public student(String name, int age,int rollno){
        this.name = "name";
        this.age = "age";
        this.rollno = "rollno";
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getRollno() {
        return rollno;
    }
    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
}
