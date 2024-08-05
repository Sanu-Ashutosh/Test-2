/**
 * App1
 */
public class App1 {

    public static void main(String[] args) {
        
        System.out.println("Hellow world");
        try {
            System.out.println("before exception");
            int a=28/0;
            System.out.println("After exception");}
         catch (ArithmeticException e) {
            System.out.println("in arithmetic| "+e.getMessage());
            
            // TODO: handle exception
        }
        catch(Exception e ){
            System.out.println("In exception");
            e.printStackTrace();
        } 
    }
}