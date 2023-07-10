package _02_OOP._01_WorkingWithAbstraction.Exercise._04_TrafficLight;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public void changeColor(){
        switch (color) {
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
