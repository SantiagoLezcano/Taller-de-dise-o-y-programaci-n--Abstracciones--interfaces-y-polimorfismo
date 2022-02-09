package Spacecrafts;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de los Vehiculos no tripulados
 */
public class UnmannesSpacecraft extends Spacecraft{

    @Override
    public void isEfficient(Spacecraft unmannesSpacecraft) {
        if(unmannesSpacecraft.getPower()<=12){
            System.out.println( "Es Eficiente");
        }else{
            System.out.println("No es Eficiente");
        }
    }
    @Override
    public void isPowerFul(Spacecraft unmannesSpacecraft) {
        if(unmannesSpacecraft.getPower()>12){
            System.out.println( "Es Potente");
        }else{
            System.out.println("No es Potente");
        }
    }



    private static String typeFuelEEUUNasa;
    private static String typeFuelRussian;
    private static String typeFuelEuropeESAASI;
    private List<UnmannesSpacecraft> unmannesspacecraft= new ArrayList<UnmannesSpacecraft>();

    public UnmannesSpacecraft(String country, String nameShuttle, String activity, int power, String typeFuel) {
        super(country, nameShuttle, activity, power, typeFuel);
    }

    public UnmannesSpacecraft() {

    }



    public void createUnmannesspacecraft() {
        unmannesspacecraft=createListUnmannesspacecraft();
    }

    public static List<UnmannesSpacecraft> createListUnmannesspacecraft(){
        createFuels();
        List<UnmannesSpacecraft>HelpList= new ArrayList<UnmannesSpacecraft>();
        UnmannesSpacecraft spaceCraft1 = new UnmannesSpacecraft("Explorer", "EE.UU. NASA", "1958-1970", 20, typeFuelEEUUNasa);
        UnmannesSpacecraft spaceCraft2 = new UnmannesSpacecraft("luna I", "Russia", "1959-Act", 18, typeFuelRussian);
        UnmannesSpacecraft spaceCraft3 = new UnmannesSpacecraft("Cassini-Huygends", "Europe ESA/ASI", "1996-Act", 15, typeFuelEuropeESAASI);
        HelpList.add(spaceCraft1);
        HelpList.add(spaceCraft2);
        HelpList.add(spaceCraft3);

        return HelpList;
    }
    public static void createFuels() {
        typeFuelEEUUNasa = "8. Sólido*+Líquido******\n" +
                "9. 10. 12. 17. 20. NO4+MMH**\n" +
                "  11. 13. 15. N2H4***\n" +
                "   16. NO4+N2H4+He\n" +
                "  21. N(comp.)+N2H4\n" +
                "          24. Pu02";
        typeFuelRussian = "2. N2O4+UDMH\n" +
                "7. N2H4***+Amina";
        typeFuelEuropeESAASI = "1. MMH**+NO\n";
    }


    public List<UnmannesSpacecraft> getUnmannesspacecraft() {
        return unmannesspacecraft;
    }

    public void setUnmannesspacecraft(List<UnmannesSpacecraft> unmannesspacecraft) {
        this.unmannesspacecraft = unmannesspacecraft;
    }

    @Override
    public String toString() {
        return "UnmannesSpacecraft{" +
                "country='" + country + '\'' +
                ", nameShuttle='" + nameShuttle + '\'' +
                ", Activity='" + Activity + '\'' +
                ", power=" + power +
                ", typeFuel='" + typeFuel + '\'' +
                '}';
    }
}
