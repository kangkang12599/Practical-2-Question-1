public class Question1 {
    public static void main (String[] args){
        System.out.println("Number\t\tSquare");
        for(int i = 0; i <= 20; i+=2){
            System.out.printf("%d\t\t%.4f\n", i, Math.sqrt(i));
        }
    }
}