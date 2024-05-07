/*
Задание: Разработка системы моделирования для YouTube
Цель:
Создать программу на Java, используя абстрактные классы, для моделирования
основных функций YouTube, включая управление видео и пользователями.
Основные сущности:

    Видео: готово
        Атрибуты: идентификатор, название, длительность,
        количество просмотров, количество лайков, количество дизлайков.
        Методы: вывод информации о видео, обновление статистики (просмотры, лайки, дизлайки).

    Пользователь:
        Атрибуты: идентификатор, имя пользователя, список загруженных видео.
        Методы: добавление видео, удаление видео, вывод списка загруженных видео.

    Комментарий: готово
        Атрибуты: текст комментария, автор комментария.
        Методы: вывод информации о комментарии.

Задания:

    Разработка абстрактных классов и интерфейсов:
        Создайте абстрактный класс Content, который будет содержать общие
        атрибуты и методы для видео и комментариев.
        Определите интерфейс Interactable с методами для взаимодействия
        (например, лайк, дизлайк, просмотр).

    Реализация конкретных классов:
        Реализуйте классы Video и Comment, наследующие абстрактный класс Content.
        Реализуйте класс User, который управляет видео и комментариями.

3 Тестирование: - Напишите Класс-тест для проверки функциональности классов Video, Comment и User.

 */


/*
 Пользователь: неясно, нужен ли список = HashSet пользователей?
        Атрибуты: идентификатор, имя пользователя, список загруженных видео.
        Методы: добавление видео, удаление видео, вывод списка загруженных видео.
        Реализуйте класс User, который управляет видео и комментариями.
 */

package homework30;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;


public class User {
    private int userId;
    private String userName;
    private HashMap<Integer, Video> usersVideos;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.usersVideos = new HashMap<>();
    }

    // 3 МЕТОДА: добавление видео в список пользователя, удаление видео из списка пользователя, вывод списка загруженных видео пользователя
//добавление видео

    // добавление видео в список пользователя
    public void addVideoToUserList(Video usersVideo) {
        if(usersVideos.containsKey(usersVideo.getVideoId())) { // проходимся по списку и ищем совпадения по ключу, переданного объекта
            System.out.println("Video was not added.");
        } else {
            usersVideos.put(usersVideo.getVideoId(),usersVideo);
            usersVideo.setNameAuthor(this.getUserName()); // устанавливается поле автора, который добавил видео
        System.out.println("Video" + getUsersVideos() + " was added.");
        }
    }

    // удаление видео из списка пользователя
    public void removeVideoFromUserList(Video usersVideo) {
        usersVideos.remove(usersVideo.getVideoId());
    }
    //метод вывода списка загруженных видео
    public void displayAllVideos(){
        for(Video video: usersVideos.values()){
            video.showInfo();
        }
    }

    // вывод списка загруженных видео пользователя
    public void displayAllUsers() {
        System.out.println(usersVideos);
    }


    // далее идут только getters & setters, toString, equals and hash


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public HashMap<Integer, Video> getUsersVideos() {
        return usersVideos;
    }

    public void setUsersVideos(HashMap<Integer, Video> usersVideos) {
        this.usersVideos = usersVideos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return userId == user.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework30.User{");
        sb.append("userId=").append(userId);
        sb.append(", userName='").append(userName).append('\'');
        sb.append(", usersVideos=").append(usersVideos);
        sb.append('}');
        return sb.toString();
    }
}










