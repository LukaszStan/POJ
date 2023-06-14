package service;

import fields.Permission;
import fields.Role;
import fields.User;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class UserService {

    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAddresses().size() > 1)
                .collect(Collectors.toList());
    }

    public static User findOldestPerson(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(user -> user.getPersonDetails().getAge()))
                .orElse(null);
    }

    public static User findUserWithLongestUsername(List<User> users) {
        return users.stream()
                .max(Comparator.comparingInt(u -> u.getName().length()))
                .orElse(null);
    }

    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List<User> users) {
        return users.stream()
                .filter(user -> user.getPersonDetails().getAge()>18)
                .map(user -> user.getPersonDetails().getName() + " " + user.getPersonDetails().getSurname())
                .collect(Collectors.joining(", "));
    }

    public static List<String> getSortedPermissionsOfUsersWithNameStartingWithA(List<User> users) {
        return users.stream()
                .filter(user -> user.getName().startsWith("A"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream().map(Permission::getName))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
                users.stream()
                .filter(user -> user.getPersonDetails().getSurname().startsWith("S"))
                .flatMap(user -> user.getPersonDetails().getRole().getPermissions().stream().map(Permission::getName).map(String::toUpperCase))
                .forEach(System.out::println);
    }

    public static Map<Role, List<User>> groupUsersByRole(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(user->user.getPersonDetails().getRole()));
    }

    public static Map<Boolean, List<User>> partitionUserByUnderAndOver18(List<User> users) {
        return users.stream()
                .collect(Collectors.partitioningBy(user->user.getPersonDetails().getAge()>18));
    }
}
