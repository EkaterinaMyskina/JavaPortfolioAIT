/* Видео:
        Атрибуты: идентификатор, название, длительность,
        количество просмотров, количество лайков, количество дизлайков.
        Методы: вывод информации о видео, обновление статистики (просмотры, лайки, дизлайки).

Реализуйте классы Video и Comment, наследующие абстрактный класс Content.
*/

package homework30;

import java.util.ArrayList;
import java.util.Objects;
   public class Video extends Content implements Interactable {
        private int videoId;
        private String videoName;
        private int howLongVideoInMin;
        private int howManyTimesLooked;
        private int howManyLikes;
        private int howManyDisLikes;
        private ArrayList<Comment> listOfAddedComments = new ArrayList<>();


       public Video( String dateOfPublication, int videoId, String videoName,
                    int howLongVideoInMin) {
           super(dateOfPublication);
           this.videoId = videoId;
           this.videoName = videoName;
           this.howLongVideoInMin = howLongVideoInMin;
       }


       //вывод информации о видео
       @Override
       public void showInfo() {
               System.out.println("Видео " + getVideoId() + " называется: " + getVideoName());
               System.out.println("Длительность видео: " + getHowLongVideoInMin() + " минут.");
       }

       // обновление статистики (просмотры, лайки, дизлайки)
       void statisticAboutVideo() {
           System.out.println("Видео просмотрено " + getHowManyTimesLooked() + " раз");
           System.out.println("Поставлено лайков " + getHowManyLikes() + " раз");
           System.out.println("Поставлено дизлайков " + getHowManyDislikes() + " раз");
       }
        // добавляем комментарий
       void addComment(Comment comment){
           listOfAddedComments.add(comment);
       }


       public int getVideoId() {
            return videoId;
        }

        public void setVideoId(int videoId) {
            this.videoId = videoId;
        }

        public String getVideoName() {
            return videoName;
        }

        public void setVideoName(String videoName) {
            this.videoName = videoName;
        }

        public int getHowLongVideoInMin() {
            return howLongVideoInMin;
        }

        public void setHowLongVideoInMin(int howLongVideoInMin) {
            this.howLongVideoInMin = howLongVideoInMin;
        }

        public int getHowManyTimesLooked() {
            return howManyTimesLooked;
        }

        public void setHowManyTimesLooked(int howManyTimesLooked) {
            this.howManyTimesLooked = howManyTimesLooked;
        }

        public int getHowManyLikes() {
            return howManyLikes;
        }

        public void setHowManyLikes(int howManyLikes) {
            this.howManyLikes = howManyLikes;
        }

        public int getHowManyDislikes() {
            return howManyDisLikes;
        }

        public void setHowManyDislikes(int howManyDislikes) {
            this.howManyDisLikes = howManyDislikes;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Video video = (Video) o;
            return videoId == video.videoId;
        }

        @Override
        public int hashCode() {
            return Objects.hash(videoId);
        }

        public String toStirng() {
                final StringBuffer sb = new StringBuffer("homework30.Video{");
                sb.append("howLongVideoInMin=").append(howLongVideoInMin);
                sb.append(", howManyDislikes=").append(howManyDisLikes);
                sb.append(", howManyLikes=").append(howManyLikes);
                sb.append(", howManyTimesLooked=").append(howManyTimesLooked);
                sb.append(", videoId=").append(videoId);
                sb.append(", videoName='").append(videoName).append('\'');
                sb.append('}');
                return sb.toString();
            }

       @Override
       public void like() {
          howManyLikes++;
       }

       @Override
       public void dislike() {
          howManyDisLikes++;
       }

       @Override
       public void looking() {
        howManyTimesLooked++;
       }
   }




