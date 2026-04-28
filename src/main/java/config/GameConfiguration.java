package config;

import app.Chief;
import app.JapaneseCuisineAbility;
import app.KoreanCuisineAbility;
import repository.AbilityRepository;

public class GameConfiguration {

    public AbilityRepository abilityRepository() {
        return new AbilityRepository();
    }

    public JapaneseCuisineAbility japaneseCuisineAbility() {
        return new JapaneseCuisineAbility(abilityRepository());
    }

    public KoreanCuisineAbility koreanCuisineAbility() {
        return new KoreanCuisineAbility(abilityRepository());
    }

    public Chief chief() {
        return new Chief(koreanCuisineAbility());
    }

}
