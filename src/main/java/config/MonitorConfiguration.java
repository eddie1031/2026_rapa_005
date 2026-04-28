package config;

import app.Chief;
import controller.FrontDesk;

public class MonitorConfiguration {

    private final Chief chief;

    public MonitorConfiguration(Chief chief) {
        this.chief = chief;
    }

    public FrontDesk frontDesk() {
        return new FrontDesk(chief);
    }


}
