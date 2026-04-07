class Student{
    private String name;
    private int age;

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        if (age >0) {
            this.age= age;
        }
        else{
            System.out.println("Invalid age");
        }
    }

    public String getname(){
        return name; 
    }
    public int getAge(){
        return  age;
    }
    
}

public class EncapsulationBygetset{
    public static void main(String[] args) {
        
        Student s1= new Student();
        s1.setName("Prachi");
        s1.setAge(25);

        System.out.println("name: "+s1.getname());
        System.out.println("age:"+s1.getAge());



    }
}