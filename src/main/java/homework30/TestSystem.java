/*
3 Тестирование: - Напишите Класс-тест для проверки функциональности классов Video,
 Comment и User.

 Тест методов:
 вывод информации о видео,
 обновление статистики (просмотры, лайки, дизлайки).
 добавление видео,
 удаление видео,
 вывод списка загруженных видео,
 вывод информации о комментарии.

 */
package homework30;

import java.util.HashSet;

public class TestSystem {
    public static void main(String[] args) {

        Comment comment = new Comment("Andreyka","06.05.2024","It was super puper!");
        Comment comment2 = new Comment("Olyiona Vyacheslavovna","07.05.2024","Prosto velicolepno! Bravo,Bravo!");
        User user1 = new User(1, "Ivan Andreevich");
        User user2 = new User(2, "Anton Sergeevich");
        User user3 = new User(3, "Ilya Ivanovch");

        Video video = new Video("Petr",41,
                "Kak ya jaril shashlik",55);
        Video video2 = new Video("Onotoliy",8,
                "Kak ya rybachil",5);


        user1.addVideoToUserList(video); // добавлено видео в коллекцию к user1
        user1.addVideoToUserList(video2); // добавлено видео2 в коллекцию к user1
        video.addComment(comment);
        video2.addComment(comment);
        user2.displayAllUsers();
        user1.displayAllVideos();
        user1.removeVideoFromUserList(video);
        comment.showInfo();
        comment2.showInfo();
        video.like();
        video.dislike();
        video.looking();
        video2.getHowManyLikes();
        video.showInfo();

        }
    }



