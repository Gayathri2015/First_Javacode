public class InheritanceExample {
    public void display(){
        System.out.println("I am from parent display method");
    }

    public void sound(){
        System.out.println("Dont make sounds");
    }
    
}

class child extends InheritanceExample{
    public void display(){
        System.out.println("I am not satisfied with parent display method");
        super.display();
    }
}

class Test{
    public static void main(String[] args){
        child c = new child();
        c.display();
    }
}

