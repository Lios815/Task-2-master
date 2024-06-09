package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        // добавление 4 юзеров в таблицу
        userService.saveUser("Адам", "Смит", (byte) 30);
        System.out.println("Пользователь с именем – Адам добавлен в базу данных");
        userService.saveUser("Джек", "Дэниелс", (byte) 25);
        System.out.println("Пользователь с именем – Джек добавлен в базу данных");
        userService.saveUser("Коннор", "О'Брайан", (byte) 40);
        System.out.println("Пользователь с именем – Коннор добавлен в базу данных");
        userService.saveUser("Анна", "Болейн", (byte) 35);
        System.out.println("Пользователь с именем – Анна добавлен в базу данных");
        // получение всех юзеров из базы и вывод в консоль
        System.out.println("List of users:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        // очистка таблицы
        userService.cleanUsersTable();

        // удаление таблицы
        userService.dropUsersTable();
    }
}
