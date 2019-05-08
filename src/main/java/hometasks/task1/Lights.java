package hometasks.task1;

enum Lights {
    RED("Красный", 2),
    YELLOW("Желтый", 1),
    GREEN("Зеленый", 3);

    private String lightColour;
    private int lightTime;

    Lights(String lightColour, int lightTime){
        this.lightColour = lightColour;
        this.lightTime = lightTime;
    }


    @Override
    public String toString() {
        return this.lightColour;
    }

    public int getLightTime() {
        return lightTime;
    }
}
