import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
    addPeople();
    }

    public static void addPeople() {
        var people = new ArrayList<String>();
        System.out.println("Enter quantity of people to add to the List:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter person to add:");
            String name = sc.next();
            people.add(name);
        }
        System.out.println("Do you want to change List?");
        System.out.println("1 - change item" +"\n"+ "2 - delete item" +"\n"+ "3 - find item");
        int answer = sc.nextInt();
        if(answer == 1){
            System.out.println("Enter number of element to change:");
            int num = sc.nextInt();
            System.out.println("Enter new name:");
            String name = sc.next();
            people.set(num,name);
        } else if(answer == 2){
            System.out.println("Enter number of element to delete:");
            int num = sc.nextInt();
            people.remove(num);
            System.out.println(num +"- was deleted");
        } else if(answer ==3){
            System.out.println("Enter name of the person to find:");
            String name = sc.next();
            if(people.contains(name)){

                System.out.println("ArrayList contains - "+name);
            }
        }
        Object[] peopleArray = people.toArray();
        for (Object person : peopleArray) {
            System.out.println(person);
        }
    }


}
