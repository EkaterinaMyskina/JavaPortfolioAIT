/*
Задание: Разработка модели социальной сети на Java
Цель:
Создать упрощенную модель социальной сети, используя основные коллекции Java: Array, ArrayList, HashSet, и HashMap.
Задачи:

    Пользователи и Друзья (Использование ArrayList и HashSet):
        Создайте класс TestEmployee, который должен содержать информацию о пользователе: имя (String),
        уникальный идентификатор (int), и список друзей (используйте HashSet для хранения объектов TestEmployee,
        представляющих друзей пользователя).

        Реализуйте методы для добавления и удаления друзей пользователя.

    Сообщения (Использование ArrayList):
        Создайте класс Message, который содержит информацию о сообщении: отправитель (TestEmployee),
        текст сообщения (String), и время отправки (LocalDateTime).
        В классе TestEmployee, добавьте поле, которое будет хранить список сообщений (ArrayList<Message>),
        отправленных пользователем.

    Лайки и Сообщества (Использование HashMap):
        В классе Message, реализуйте систему лайков. Используйте HashSet<TestEmployee> для хранения пользователей,
        которым понравилось сообщение.
        Создайте класс Community, представляющий сообщество или группу в социальной сети. Он должен содержать
        название сообщества (String) и список его участников (HashSet<TestEmployee>).
        Используйте HashMap<String, Community> для хранения всех сообществ в социальной сети, где ключ — это название сообщества.

    Поиск (Использование HashMap):
        Реализуйте функциональность поиска пользователей по имени. Используйте HashMap<Integer, TestEmployee> для хранения
        всех пользователей с их уникальными идентификаторами в качестве ключей.
        Добавьте функцию поиска сообществ по названию.

Дополнительные требования:

    Все классы должны иметь геттеры и сеттеры для своих полей.
    Реализуйте методы toString() для удобства отладки и вывода информации о пользователях, сообщениях и сообществах.
    Создайте тестовый класс с main методом, где вы демонстрируете работу вашей модели: создание пользователей,
    добавление их в друзья, отправка сообщений, использование лайков, создание и управление сообществами.




package homework24;

public class SocialNet {
    public static void main(String[] args) {
        TestEmployee user1 = new TestEmployee("Андрей",1);
        System.out.println(user1);

        Message mes = new Message(user1,"Hello", "22:30");
        System.out.println(mes);

    }

}
 */

