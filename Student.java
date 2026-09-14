class Student{
    String name;
    int age;
    void display(){
        System.out.println("Student1:"+s1.name+",age:"+s1.age);
        System.out.println("Student2:"+s2.name+",age:"+s2.age);
        
    }
}

public class Student{
    int age;
    String name; 
    public static void main(String[] args){
        Student s1= new Student();
        s1.name="aarti";
        s1.age=19;
        Student s2=new Student();
        s2.name="dimple";
        s2.age=20;
        System.out.println("Student1:"+s1.name+",age:"+s1.age);
        System.out.println("Student2:"+s2.name+",age:"+s2.age);
        s1.display();
        s2.display();
    }
    
}
