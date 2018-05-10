package Inheritance;

public class MountainBike extends Bicycle {
    public int seatHight;

    public MountainBike(int seatHight, int gear, int speed)
    {
        super(gear, speed);
        this.seatHight = seatHight;
    }
    public void setHeight(int newValue)
    {
        this.seatHight = newValue;
    }

    @Override
    public String toString() {
        return super.toString() + "\nseat hight is: "+seatHight;
    }
}
