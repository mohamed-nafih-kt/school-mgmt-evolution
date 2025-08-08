package functions_folder;

public class Student {
    private int adm;
    private String name, clas, place, contact;

    public Student(int adm, String name, String clas, String place, String contact) {
        this.adm = adm;
        this.name = name;
        this.clas = clas;
        this.place = place;
        this.contact = contact;
    }

    public int getAdm() {
        return adm;
    }

    public String getName() {
        return name;
    }

    public String getClas() {
        return clas;
    }

    public String getPlace() {
        return place;
    }

    public String getContact() {
        return contact;
    }
}