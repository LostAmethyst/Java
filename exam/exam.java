import java.util.*;

public class Laptop {
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;

    public Laptop(String model, int ram, int storage, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
    }

    // Геттеры и сеттеры для полей класса

    public static void main(String[] args) {
        // Создаем множество ноутбуков
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Model 1", 8, 512, "Windows", "Black"));
        laptops.add(new Laptop("Model 2", 16, 1024, "Linux", "Silver"));
        laptops.add(new Laptop("Model 3", 8, 256, "Windows", "Blue"));

        // Вызываем метод фильтрации
        Map<Integer, Object> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filter criteria:");
        System.out.println("1 - RAM");
        System.out.println("2 - Storage");
        System.out.println("3 - Operating System");
        System.out.println("4 - Color");

        int criteria = scanner.nextInt();

        switch (criteria) {
            case 1:
                System.out.println("Enter minimum RAM value:");
                int minRam = scanner.nextInt();
                filter.put(criteria, minRam);
                break;
            case 2:
                System.out.println("Enter minimum storage value:");
                int minStorage = scanner.nextInt();
                filter.put(criteria, minStorage);
                break;
            case 3:
                System.out.println("Enter operating system:");
                String os = scanner.next();
                filter.put(criteria, os);
                break;
            case 4:
                System.out.println("Enter color:");
                String color = scanner.next();
                filter.put(criteria, color);
                break;
            default:
                System.out.println("Invalid criteria.");
                return;
        }

        // Вызываем метод фильтрации и выводим результат
        Set<Laptop> result = filterLaptops(laptops, filter);
        if (result.isEmpty()) {
            System.out.println("No laptops matching the criteria found.");
        } else {
            System.out.println("Filter results:");
            for (Laptop laptop : result) {
                System.out.println(laptop);
            }
        }
    }

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<Integer, Object> filter) {
        Set<Laptop> result = new HashSet<>();

        for (Laptop laptop : laptops) {
            boolean matches = true;

            for (Map.Entry<Integer, Object> entry : filter.entrySet()) {
                int criteria = entry.getKey();
                Object value = entry.getValue();

                switch (criteria) {
                    case 1:
                        int ram = (int) value;
                        if (laptop.getRam() < ram) {
                            matches = false;
                        }
                        break;
                    case 2:
                        int storage = (int) value;
                        if (laptop.getStorage() < storage) {
                            matches = false;
                        }
                        break;
                    case 3:
                        String os = (String) value;
                        if (!laptop.getOs().equals(os)) {
                            matches = false;
                        }
                        break;
                    case 4:
                        String color = (String) value;
                        if (!laptop.getColor().equals(color)) {
                            matches = false;
                        }
                        break;
                    default:
                        System.out.println("Invalid criteria.");
                        return result;
                }

                if (!matches) {
                    break;
                }
            }

            if (matches) {
                result.add(laptop);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", ram=" + ram +
                ", storage=" + storage +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
