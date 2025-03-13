package com.example.kiosk.Lv4;




import java.util.ArrayList;
import java.util.List;

public class Menu {
   private List<MenuItem> items = new ArrayList<>();
   private String category;

    int checkNumber;
    public Menu(List<MenuItem> items,String category) {
        this.items = items;
        this.category = category;
    }

    public void printMenu(){

        if(category.equals("movie")){
            for(int i = 0; i <=2; i++) {
                Movie movieItem = (Movie) items.get(i);
                System.out.println((i+1)+". "+movieItem.getMovieName()+" // "+movieItem.getType()+" // "+movieItem.getHowlong());
            }
        } else if (category.equals("snack")){
            for (int i = 0; i <= 2; i++) {
                Snack snackItem = (Snack) items.get(i);
                System.out.println((i+1)+"."+snackItem.getSnacknameName()+" // "+snackItem.getHowmuch()+" // "+snackItem.getInfo());
            }
        }
    }

    public void saveMenu(int i){

        if(category.equals("movie")){
            {
                Movie movieItem = (Movie) items.get(i-1);
                System.out.println("선택하신 영화: "+(i)+". "+movieItem.getMovieName()+" // "+movieItem.getType()+" // "+movieItem.getHowlong());
            }
        } else if (category.equals("snack")){
             {
                Snack snackItem = (Snack) items.get(i-1);
                System.out.println("선택하신 간식: "+(i)+"."+snackItem.getSnacknameName()+" // "+snackItem.getHowmuch()+" // "+snackItem.getInfo());
            }
        }
    }
}







