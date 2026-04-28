import config.GameConfiguration;
import config.MonitorConfiguration;
import controller.FrontDesk;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class CookingSimulatorApplication {

//    static void main() {
//
//        AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(
//                new Class[]{GameConfiguration.class, MonitorConfiguration.class}
//        );
//
//        List<String> ingredients = List.of("김치", "대파", "마늘", "고춧가루", "설탕");
//
//        FrontDesk frontDesk = springContainer.getBean(FrontDesk.class);
//
//        frontDesk.orderCuisine(ingredients);
//        frontDesk.orderCuisine(ingredients);
//        frontDesk.orderCuisine(ingredients);
//
//        frontDesk.checkExp();
//
//        FrontDesk frontDesk1 = springContainer.getBean(FrontDesk.class);
//        FrontDesk frontDesk2 = springContainer.getBean(FrontDesk.class);
//
//        System.out.println("isSingleton = " + (frontDesk1 == frontDesk2));
//
//    }

}
