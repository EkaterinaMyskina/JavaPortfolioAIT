/*
Комментарий:
        Атрибуты: текст комментария, автор комментария.
        Методы: вывод информации о комментарии.
 */

package homework30;


import java.util.HashMap;

public class Comment extends Content {
    private String commentText;


    public Comment(String nameAuthor, String dateOfPublication, String commentText) {
        super(nameAuthor, dateOfPublication);
        this.commentText = commentText;
    }
    @Override
    public void showInfo() {
                 System.out.println("Comment: " + getCommentText() + "created by author: " + super.getNameAuthor());
    }

    public void deleteInfo() {

        System.out.println("Comment: " + getCommentText() + "was deleted");
    }


    // ниже только getters & setters, toString
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("homework30.Comment{");
        sb.append("commentText='").append(commentText).append('\'');
        sb.append(", dateOfPublication='").append(getDateOfPublication()).append('\'');
        sb.append(", nameAuthor='").append(getNameAuthor()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

