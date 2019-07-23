import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        float width;
        float heigh;

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Nhap chieu dai :");
        width = scanner.nextFloat();
        System.out.printf("Nhap chieu rong :");
        heigh = scanner.nextFloat();

        float area = width * heigh;
        System.out.println("Dien tich la : " + area);

        float perimeter = (width + heigh) * 2;
        System.out.println("Chu vi la : " + perimeter);
    }
}
