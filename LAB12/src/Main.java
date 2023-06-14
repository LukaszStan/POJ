import fields.*;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "password1", new Person("John", "Doe", List.of("123456789"), new ArrayList<>(), new Role("Admin", new ArrayList<>()), 25));
        User user2 = new User("Alice", "password2", new Person("Alice", "Smith", List.of("987654321"), new ArrayList<>(), new Role("User", new ArrayList<>()), 20));
        User user3 = new User("Bob", "password3", new Person("Bob", "Brown", List.of("567890123"), new ArrayList<>(), new Role("User", new ArrayList<>()), 18));
        User user4 = new User("Alex", "password4", new Person("Alex", "Sanders", List.of("543216789"), new ArrayList<>(), new Role("Admin", new ArrayList<>()), 30));

        user1.getPersonDetails().getAddresses().add(new Address("Main Street", 1, null, "City1", "12345", "Country1"));
        user1.getPersonDetails().getAddresses().add(new Address("Second Street", 2, null, "City2", "23456", "Country2"));
        user2.getPersonDetails().getAddresses().add(new Address("First Avenue", 10, 5, "City3", "34567", "Country3"));
        user3.getPersonDetails().getAddresses().add(new Address("High Street", 20, null, "City4", "45678", "Country4"));
        user3.getPersonDetails().getAddresses().add(new Address("Park Avenue", 30, 15, "City5", "56789", "Country5"));

        Permission permission1 = new Permission("Permission A");
        Permission permission2 = new Permission("Permission B");
        Permission permission3 = new Permission("Permission C");
        Permission permission4 = new Permission("Permission D");
        Permission permission5 = new Permission("Permission E");

        user1.getPersonDetails().getRole().getPermissions().add(permission1);
        user1.getPersonDetails().getRole().getPermissions().add(permission2);
        user1.getPersonDetails().getRole().getPermissions().add(permission3);
        user2.getPersonDetails().getRole().getPermissions().add(permission2);
        user2.getPersonDetails().getRole().getPermissions().add(permission4);
        user3.getPersonDetails().getRole().getPermissions().add(permission1);
        user3.getPersonDetails().getRole().getPermissions().add(permission3);
        user3.getPersonDetails().getRole().getPermissions().add(permission5);

        List<User> users = List.of(user1,user2,user3,user4);

        List<User> usersWithMoreThanOneAddress = UserService.findUsersWhoHaveMoreThanOneAddress(users);
        System.out.println("Users with more than one address:");
        usersWithMoreThanOneAddress.forEach(System.out::println);

        User oldestPerson = UserService.findOldestPerson(users);
        System.out.println("Oldest person:");
        System.out.println(oldestPerson);

        User userWithLongestUsername = UserService.findUserWithLongestUsername(users);
        System.out.println("User with longest username:");
        System.out.println(userWithLongestUsername);

        String namesAndSurnames = UserService.getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(users);
        System.out.println("Names and surnames of users above 18:");
        System.out.println(namesAndSurnames);

        List<String> sortedPermissions = UserService.getSortedPermissionsOfUsersWithNameStartingWithA(users);
        System.out.println("Sorted permissions of users with name starting with 'A':");
        sortedPermissions.forEach(System.out::println);

        System.out.println("Capitalized permission names of users with surname starting with 'S':");
        UserService.printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(users);

        Map<Role, List<User>> usersByRole = UserService.groupUsersByRole(users);
        System.out.println("Users grouped by role:");
        usersByRole.forEach((role, userList) -> {
            System.out.println(role.getName() + ":");
            userList.forEach(System.out::println);
        });

        Map<Boolean, List<User>> usersPartitionedByAge = UserService.partitionUserByUnderAndOver18(users);
        System.out.println("Users partitioned by age:");
        usersPartitionedByAge.forEach((isOver18, userList) -> {
            System.out.println((isOver18 ? "Over 18:" : "Under 18:"));
            userList.forEach(System.out::println);
        });
    }
}