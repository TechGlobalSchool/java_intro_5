package exception_handling.try_catch;

public class Finally_Block {
    public static void main(String[] args) {

        String greeting = "hello";
        try{
            System.out.println(greeting.charAt(10));
        }catch (Exception e){
            System.out.println(greeting.charAt(9));
        }
        finally {
            System.out.println("End of the program");
        }


    }
}
