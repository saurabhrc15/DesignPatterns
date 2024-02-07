package CreationalPatterns.Prototype;

public abstract class Vehicle implements Cloneable{
    private String vehicleType;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
