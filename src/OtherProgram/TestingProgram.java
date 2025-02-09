package OtherProgram;

public class TestingProgram {

    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
            System.out.print("\t");
            System.out.print(i);
            for (int j = i; j > 0 ; j--) {
                System.out.print("*");
            }
        }
    }
}
