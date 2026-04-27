package app;

import java.util.List;

public class Chief {

    private CuisineAbility ability;

    public Chief(CuisineAbility ability) {
        this.ability = ability;
    }

    public void cook(List<String> ingredients) {
        ability.apply(ingredients);
    }

    public int checkExp() {
        return ability.getExp();
    }


}
