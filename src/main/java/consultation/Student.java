package consultation;

public class Student {
    private String firstname;
    private String secondname;
    private String adsress;
    private String phoenumber;

    public Student(String firstname, String secondname, String adsress, String phoenumber) {
        this.firstname = firstname;
        this.secondname = secondname;
        this.adsress = adsress;
        this.phoenumber = phoenumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSecondname() {
        return secondname;
    }

    public String getAdsress() {
        return adsress;
    }

    public String getPhoenumber() {
        return phoenumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstname='" + firstname + '\'' +
                ", secondname='" + secondname + '\'' +
                ", adsress='" + adsress + '\'' +
                ", phoenumber='" + phoenumber + '\'' +
                '}';
    }
}

