import app.Chief;
import app.KoreanCuisineAbility;
import config.GameConfiguration;
import config.MonitorConfiguration;
import controller.FrontDesk;

import java.util.List;

public class CookingSimulatorApplication {

    static void main() {

        GameConfiguration configuration = new GameConfiguration();
        List<String> ingredients = List.of("김치", "대파", "마늘", "고춧가루", "설탕");

        Chief chief1 = configuration.chief();
        MonitorConfiguration monitorConfiguration = new MonitorConfiguration(chief1);

        FrontDesk frontDesk = monitorConfiguration.frontDesk();

        frontDesk.orderCuisine(ingredients);
        frontDesk.orderCuisine(ingredients);
        frontDesk.orderCuisine(ingredients);

        frontDesk.checkExp();

    }

}
