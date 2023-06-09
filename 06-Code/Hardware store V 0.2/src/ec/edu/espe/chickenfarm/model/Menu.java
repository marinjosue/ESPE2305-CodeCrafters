package ec.edu.espe.chickenfarm.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private List<Coop> coops;
    private Scanner scanner;

    public Menu(List<Coop> coops) {
        this.coops = coops;
        this.scanner = new Scanner(System.in);
    }

    public void show() {
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add coop");
            System.out.println("2. Add chicken");
            System.out.println("3. Save and exit");
            System.out.println("4. Show information");
            System.out.println("5. Delete chicken");
            System.out.print("Enter option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Add coop
                    System.out.print("Enter coop id: ");
                    String id = scanner.next();
                    Coop coop = new Coop(id, new ArrayList<>());
                    coops.add(coop);
                    break;
                case 2:
                    // Add chicken
                    System.out.print("Enter coop id: ");
                    String coopId = scanner.next();
                    Coop selectedCoop = null;
                    for (Coop c : coops) {
                        if (c.getId().equals(coopId)) {
                            selectedCoop = c;
                            break;
                        }
                    }
                    if (selectedCoop == null) {
                        System.out.println("Coop not found");
                        break;
                    }
                    System.out.print("Enter chicken id: ");
                    int chickenId = scanner.nextInt();
                    System.out.print("Enter chicken name: ");
                    String name = scanner.next();
                    System.out.print("Enter chicken color: ");
                    String color = scanner.next();
                    System.out.print("Is chicken molting (true/false): ");
                    boolean isMolting = scanner.nextBoolean();
                    System.out.print("Enter chicken birth year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter chicken birth month: ");
                    int month = scanner.nextInt();
                    System.out.print("Enter chicken birth day: ");
                    int day = scanner.nextInt();
                    Chicken chicken = new Chicken(chickenId, name, color, isMolting, new Date(year - 1900, month - 1, day));
                    int age = chicken.computeAge();
                    System.out.println("Chicken added: " + chicken.getName() + ", age: " + age);
                    selectedCoop.getChickens().add(chicken);
                    break;
                case 3:
                    exit = true;
                    break;
                case 4:
                    for (Coop c : coops) {
                        System.out.println("Coop id: " + c.getId());
                        for (Chicken ch : c.getChickens()) {
                            System.out.println( ch);
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                     System.out.print("Enter coop id: ");
                     String coopIdToDeleteFrom = scanner.next();
                     Coop selectedCoopToDeleteFrom = null;
                     for (Coop c : coops) {
                         if (c.getId().equals(coopIdToDeleteFrom)) {
                             selectedCoopToDeleteFrom = c;
                             break;
                         }
                     }
                     if (selectedCoopToDeleteFrom == null) {
                         System.out.println("Coop not found");
                         break;
                     }
                     System.out.print("Enter chicken id: ");
                     int chickenIdToDelete = scanner.nextInt();
                     Chicken chickenToDelete = null;
                     for (Chicken ch : selectedCoopToDeleteFrom.getChickens()) {
                         if (ch.getId() == chickenIdToDelete) {
                             chickenToDelete = ch;
                             break;
                         }
                     }
                     if (chickenToDelete == null) {
                         System.out.println("Chicken not found");
                         break;
                     }
                     selectedCoopToDeleteFrom.getChickens().remove(chickenToDelete);
                     System.out.println("Chicken deleted");
                     break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }
}
