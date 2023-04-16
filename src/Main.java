import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listA = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя для списка А: ");
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("Список А: " + listA);

        List<String> listB = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя для списка Б: ");
            String input = scanner.nextLine();
            listB.add(input);
        }

        System.out.println("Список Б: " + listB);

        List<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }

        System.out.println("Список С: " + listC);

        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });

        System.out.println("Отсортированный список С: " + listC);
    }
}