public class Numeros0a99 {
    public static void main(String[] args) {
        for (int i = 0; i <= 99; i++) {

            System.out.printf("%d%s", i, i == 99 ? "" : ", ");
        }
        System.out.println();
    }
}
