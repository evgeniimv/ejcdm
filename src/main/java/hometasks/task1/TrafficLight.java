package hometasks.task1;

import java.util.Arrays;


class TrafficLight {
    private Lights[] lightsOrder;

    TrafficLight(Lights ... lightsOrder) {
        this.lightsOrder = lightsOrder;
    }

    /**
     *
     * @param currentMinute the time to calculate corresponding light
     * @return light corresponding to given time
     * @throws IllegalArgumentException
     *         if given time is less than zero
     * @throws LogicException
     *         replacement for return statement which is not supposed to be reached
     */
    Lights getStatus(int currentMinute) throws IllegalArgumentException, LogicException{
        if (currentMinute < 0)
            throw new IllegalArgumentException("Time cannot be less than 0");

        int fullCircleTime = Arrays.stream(lightsOrder)
                .mapToInt(Lights::getLightTime)
                .sum();

        int minutesLeft = currentMinute % fullCircleTime;

        for(Lights currentLight: lightsOrder){
            minutesLeft -= currentLight.getLightTime();
            if (minutesLeft < 0) return currentLight;
        }

        throw new LogicException("There is a logic breach in TrafficLight.getStatus() method");
    }
}
