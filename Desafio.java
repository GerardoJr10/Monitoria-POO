public class Desafio {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        int z = 7;
        do {
            ++x;
            y--;
            --z;
            if (x % 2 == 0) {
                continue;
            }
            System.out.println("x=" + x + ", y=" + y + ", z=" + z);
            if (y < 2) {
                break;
            }
        } while (z > 0);

        // Valores finais esperados: x=7, y=1, z=3
        System.out.println("Valores finais -> x=" + x + ", y=" + y + ", z=" + z);
    }
}
