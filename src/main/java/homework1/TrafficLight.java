package homework1;

import java.util.LinkedHashMap;
import java.util.Map;

class TrafficLight {

    private final LinkedHashMap<Color, Long> config;
    private final long cycleTime;

    TrafficLight(LinkedHashMap<Color, Long> config) {
        if(config == null) {
            throw new IllegalArgumentException("Traffic light config is null");
        }

        if(config.isEmpty()) {
            throw new IllegalArgumentException("Traffic light config is empty");
        }

        if(config.values().stream().anyMatch(x -> x <= 0)) {
            throw new IllegalArgumentException("Config contains negative elements");
        }

        this.config = config;
        this.cycleTime = config.values().stream().mapToLong(x -> x).sum();
    }

    Color getColorAtTime(long time) {
        if(time < 0) {
            throw new IllegalArgumentException("Negative time passed to the function");
        }
        
        final long reducedTime = time % cycleTime;

        long counter = 0;
        for(Map.Entry<Color, Long> entry : config.entrySet()) {
            counter += entry.getValue();
            if(counter >= reducedTime) {
                return entry.getKey();
            }
        }

        throw new RuntimeException("Error at color computation");
    }
}
