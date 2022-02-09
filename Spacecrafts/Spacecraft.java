package Spacecrafts;

/**
 * Esta es la clase madre donde declararemos los atributos que comparten
 * todas las naves
 */
public abstract class Spacecraft {
    /**
     * Atributos de la clase
     */
    protected String country;
    protected String nameShuttle;
    protected String Activity;
    protected int power;
    protected String typeFuel;

    /**
     * Metodos abstractos
     * @param unmannesSpacecraft
     */
    public abstract void isEfficient(Spacecraft spacecraft);
    public abstract void isPowerFul(Spacecraft spacecraft);

    /**
     * Constructor con parametros
     * @param country
     * @param activity
     * @param power
     * @param typeFuel
     */
    public Spacecraft(String country, String nameShuttle, String activity, int power, String typeFuel) {
        this.country = country;
        this.nameShuttle = nameShuttle;
        this.Activity = activity;
        this.power = power;
        this.typeFuel = typeFuel;
    }

    /**
     * Constructor vacio
     */
    public Spacecraft() {

    }
    /**
     * Encapsulamiento Getter and Setter
     * @return
     */
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getActivity() {
        return Activity;
    }
    public void setActivity(String activity) {
        Activity = activity;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public String getTypeFuel() {
        return typeFuel;
    }
    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
    }
    public String getNameShuttle() {
        return nameShuttle;
    }
    public void setNameShuttle(String nameShuttle) {
        this.nameShuttle = nameShuttle;
    }

}

