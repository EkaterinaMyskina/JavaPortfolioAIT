/*
Создайте абстрактный класс Content, который будет содержать общие
 атрибуты и методы для видео и комментариев.
Реализуйте классы Video и Comment, наследующие абстрактный класс Content.
 */
package homework30;

abstract class Content {
    private String nameAuthor;
    private String dateOfPublication;

    public Content(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public Content(String nameAuthor,String dateOfPublication) {
        this.nameAuthor = nameAuthor;
        this.dateOfPublication = dateOfPublication;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(String dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    // абстрактные методы для видео и комментариев:
    // вывод информации
    abstract public void showInfo();


}

