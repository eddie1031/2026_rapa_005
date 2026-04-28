package controller;

import app.Chief;

import java.util.List;

public class FrontDesk {

    private Chief chief;

    public FrontDesk(Chief chief) {
        this.chief = chief;
    }

    public void orderCuisine(List<String> ingredients) {
        chief.cook(ingredients);
    }

    public void checkExp() {
        System.out.println("누적 경험치 : " + chief.checkExp());
    }

}
