package fr.ferielmd.pocketguide;

public class Item {
/* *******************************************
Pour chacune des RecyclerView, nous initialisons 3 string et une int
Grâce à des Get et Return on récupère puis on affecte l'information correspondante afin d'afficher
correctement dans la RecyclerView
**********************************************/
    String name;
    String lieu;
    String num;
    int image;

    public Item(String name, String lieu, String num, int image) {
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
