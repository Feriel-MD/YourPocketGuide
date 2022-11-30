package fr.ferielmd.pocketguide;

public class Item13 {

    String name;
    String lieu;
    String num;
    int image;

    public Item13(String name, String lieu, String num, int image) {
        this.name = name;
        this.lieu = lieu;
        this.num = num;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
