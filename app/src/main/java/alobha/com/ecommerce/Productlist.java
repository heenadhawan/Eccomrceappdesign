package alobha.com.ecommerce;

/**
 * Created by Dell on 5/25/2018.
 */

public class Productlist {
    String name;
    int image;

    public Productlist(String name, int image) {
        this.name = name;
        this.image=image;
    }
    public String getName() {
        return name;
    }
    public int getImage() {
        return image;
    }}


