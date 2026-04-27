package app;

import java.util.List;

public class JapaneseCuisineAbility implements CuisineAbility {

    private int exp = 0;

    private void increaseExp() {
        this.exp++;
    }

    @Override
    public void apply(List<String> ingredients) {

        this.increaseExp();

        String usedIngredients = String.join(" ", ingredients);

        System.out.println("%s을/를 볶아서 일본 음식을 요리했습니다!".formatted(usedIngredients));

    }

    @Override
    public int getExp() {
        return this.exp;
    }


}
