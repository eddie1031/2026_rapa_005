import app.Chief;
import app.KoreanCuisineAbility;
import config.GameConfiguration;

import java.util.List;

public class CookingSimulatorApplication {

    static void main() {

        GameConfiguration configuration = new GameConfiguration();
        List<String> ingredients = List.of("김치", "대파", "마늘", "고춧가루", "설탕");

        Chief chief1 = configuration.chief();
        Chief chief2 = configuration.chief();

        chief1.cook(ingredients);
        chief2.cook(ingredients);

        KoreanCuisineAbility koreanCuisineAbility = configuration.koreanCuisineAbility();

        System.out.println("koreanCuisineAbility.getExp() = " + koreanCuisineAbility.getExp());


    }

}
