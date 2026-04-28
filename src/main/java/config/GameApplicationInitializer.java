package config;

import org.jspecify.annotations.Nullable;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GameApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    // Service, Repository -> root-context.xml
    @Override
    protected Class<?> @Nullable [] getRootConfigClasses() {
        return new Class[] { GameConfiguration.class };
    }

    // Controller, 그외 view 설정 -> servlet-content.xml
    @Override
    protected Class<?> @Nullable [] getServletConfigClasses() {
        return new Class[] { MonitorConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

}
