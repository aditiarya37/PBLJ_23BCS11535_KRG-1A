import java.util.*;
class EmptyListException extends Exception {
    public EmptyListException(String msg) {
        super(msg);
    }
}
class Student {
    private ArrayList<String> list = new ArrayList<>();
    public void addStudent(String name) {
        list.add(name);
    }
    public void removeStudent(String name) {
        list.remove(name);
    }
    public void display() throws EmptyListException {
        if(list.isEmpty()) {
            throw new EmptyListException("List is empty.");
        }
        Collections.sort(list);
        System.out.println("Students: " + list);
    }
}
class calculateAverage {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> arr = new ArrayList<>();
    public void readNumbers() {
        System.out.println("Enter numbers: ");
        while(true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int n = Integer.parseInt(input);
                arr.add(n);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number, please enter a valid number");
            }
        }
    }
    public void calAvg() {
        try {
            int sum = 0;
            for(int i: arr) {
                sum += i;
            }
            double avg = sum/arr.size();
            System.out.println("Average: " + avg);
        }
        catch (ArithmeticException e) {
            System.out.println("Size of list cannot be 0.");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        System.out.println("1) Question 1");
        System.out.println("2) Question 3");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Student s = new Student();
                s.addStudent("Aditi Arya");
                s.addStudent("Mohit");
                s.addStudent("Daksh Thakran");
                s.addStudent("Purvisha");
                s.removeStudent("Purvisha");
                try {
                    s.display();
                } catch (EmptyListException e) {
                    System.out.println(e.getMessage());
                }
                break;
            case 2:
                calculateAverage c = new calculateAverage();
                c.readNumbers();
                c.calAvg();
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

