package triangel_stars;

public class TriangleStars {
    public static void main(String[] args) {

        // 10*10 triangle stars

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }

    }
}
