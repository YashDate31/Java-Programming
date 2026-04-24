class Parent
 {
    void show()
    {
        System.out.println("Parent's show()");
    }
}
  

class Child extends Parent
 {
    
    void show()
    {
        System.out.println("Child's show()");
    }
}
  

class Method_overridingdemo
 {
    public static void main(String[] args)
    {
        
        Child obj1 = new Child();
        obj1.show();
  
        
        Parent obj2 = new Parent();
        obj2.show();
    }
}