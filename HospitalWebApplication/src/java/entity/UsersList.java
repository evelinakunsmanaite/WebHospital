/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
 /*
 * @author Administrator
 */
public class UsersList {
    private static User[] users
;    
      static {
        users = new User[5];
        users[0] = new User("20031","Рябицкий",  "Андрей", "Викторович", "20030i");
        users[1] = new User("20092","Кунсманайте",  "Эвелина", "Арвидасовна", "20030i");
        users[2] = new User("20025","Сараев",  "Никита", "Олегович", "20030i");
        users[3] = new User("20030","Хлуденко",  "Александр", "Сергеевич", "20030i");
        users[4] = new User("20032","Рыбиков",  "Даниил", "Александрович", "20030i");
    }

    public static User[] getUsers() {
        return users;
    }
    
}
