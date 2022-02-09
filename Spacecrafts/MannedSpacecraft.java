package Spacecrafts;

import java.util.ArrayList;
import java.util.List;

public class MannedSpacecraft extends Spacecraft{

    @Override
    public void isEfficient(Spacecraft mannedSpacecraft) {
        if(mannedSpacecraft.getPower()<7){
            System.out.println( "Es Eficiente");
        }else{
            System.out.println("No es Eficiente");
        }
    }
    @Override
    public void isPowerFul(Spacecraft mannedSpacecraft) {
        if(mannedSpacecraft.getPower()>=7){
            System.out.println( "Es Potente");
        }else{
            System.out.println("No es Potente");
        }
    }
    private static String typeFuelEEUU;
    private static String typeFuelRussian;
    private static String typeFuelInternational;
    private static String typeFuelChinese;
    private List<MannedSpacecraft> mannedspacecraft= new ArrayList<MannedSpacecraft>();

    public MannedSpacecraft() {

    }



    public MannedSpacecraft(String country, String nameShuttle, String activity, int power, String typeFuel) {
        super(country, nameShuttle, activity, power, typeFuel);
    }
    public static List<MannedSpacecraft> createListMannedSpacecraft(){
        createFuels();
        List<MannedSpacecraft>HelpList= new ArrayList<MannedSpacecraft>();
        MannedSpacecraft spaceCraft1 = new MannedSpacecraft("Apolo", "EE.UU.", "1966-1975", 14, typeFuelEEUU);
        MannedSpacecraft spaceCraft2 = new MannedSpacecraft("Vostok", "Russian", "1960-1963", 9, typeFuelRussian);
        MannedSpacecraft spaceCraft3 = new MannedSpacecraft("EEI", "International", "1998-Act", 1, typeFuelInternational);
        MannedSpacecraft spaceCraft4 = new MannedSpacecraft("Shenzou", "Chinese", "1999-Act", 5, typeFuelChinese);
        HelpList.add(spaceCraft1);
        HelpList.add(spaceCraft2);
        HelpList.add(spaceCraft3);
        HelpList.add(spaceCraft4);
        return HelpList;
    }
    public static void createFuels() {
        typeFuelEEUU = "1. Sólido*\n" +
                "2. NO4+UDMH\n" +
                "3. Aerozina50**+NO4\n" +
                "4. 5. Sólido*\n" +
                "9. Queroseno+H(liq.)";
        typeFuelRussian = "6. NO+Amina\n" +
                "7. NO+Amina\n" +
                "8. N204+UDMH";
        typeFuelInternational = "N/A";
        typeFuelChinese = "10. N204+MMH\n";
    }



    @Override
    public String toString() {
        return "MannedSpacecraft{" +
                "country='" + country + '\'' +
                ", nameShuttle='" + nameShuttle + '\'' +
                ", Activity='" + Activity + '\'' +
                ", power=" + power +
                ", typeFuel='" + typeFuel + '\'' +
                '}';
    }

    public List<MannedSpacecraft> getMannedspacecraft() {
        return mannedspacecraft;
    }

    public void setMannedspacecraft(List<MannedSpacecraft> mannedspacecraft) {
        this.mannedspacecraft = mannedspacecraft;
    }
    public void createUnmannesspacecraft() {
        mannedspacecraft=createListMannedSpacecraft();
    }

}
