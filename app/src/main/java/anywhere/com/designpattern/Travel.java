package anywhere.com.designpattern;

public class Travel {
    private Vehicle vehicle;

    public void setTravel(Vehicle vehicle1)
    {
        this.vehicle = vehicle1;
    }

    public Vehicle getvehicle()
    {
        return vehicle;
    }

    public int wheels()
    {
      return   vehicle.wheels();

    }
    public int passenger()
    {
        return   vehicle.passengers();

    }
    public boolean gas()
    {
        return  vehicle.gas();

    }
}
