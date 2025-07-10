public class TrycatchExample {

    public static void checkage(int Age) throws  IllegalArgumentException{
            if(Age < 18){
 
                throw new IllegalArgumentException("Age must be greater than 18");
            }
            else{
                System.out.println("Access Granted");
            }
        }

        public static void main(String[] args){
            try{
                checkage(13);
            }
            catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }

 }
    

