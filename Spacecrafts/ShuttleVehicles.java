package Spacecrafts;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase de vehiculos lanzadera
 */
public class ShuttleVehicles extends Spacecraft {
    /**
     * Declaracion de variables, tipo de combustible de cada pais
     * Lista de vehiculos tipo lanzadera
     */
    private static String typeFuelEEUU;
    private static String typeFuelRussianUkraine;
    private static String typeFuelEurope;
    private static String typeFuelJapan;
    private static String typeFuelChinese;
    private List<ShuttleVehicles>shuttleVehiclesList= new ArrayList<ShuttleVehicles>();

    /**
     * Constructor con parametros
     *
     * @param country
     * @param activity
     * @param power
     * @param typeFuel
     */
    public ShuttleVehicles(String nameShuttle, String country, String activity, int power, String typeFuel) {
        super(nameShuttle, country, activity, power, typeFuel);

    }

    /**
     * Constructor vacio
     */
    public ShuttleVehicles() {
        super();
    }

    /**
     * Inicializacion de mis naves
     */
    public void createSpacecrafts() {
        shuttleVehiclesList=createListShuttle();
    }

    /**
     * metodos heredades de la clase asbstracta
     * @param mannedSpacecraft
     */


    /**
     * Estudio de potencia y eficiencia de acuerdo a la escala de potencia
     * @param spacecraft
     */
    @Override
    public void isEfficient(Spacecraft spacecraft) {
        if(spacecraft.getPower()<=7){
            System.out.println( "Es Eficiente");
        }else{
            System.out.println("No es Eficiente");
        }
    }
    @Override
    public void isPowerFul(Spacecraft spacecraft) {
        if(spacecraft.getPower()>7){
            System.out.println( "Es Potente");
        }else{
            System.out.println("No es Potente");
        }
    }

    /**
     * Creacion e ingreso de datos de la Lista de Shuttle
     */

    public static List<ShuttleVehicles> createListShuttle(){
        createFuels();
        List<ShuttleVehicles>HelpList= new ArrayList<ShuttleVehicles>();
        ShuttleVehicles spaceCraft1 = new ShuttleVehicles("Saturno V", "EE.UU.", "1967-1973", 14, typeFuelEEUU);
        ShuttleVehicles spaceCraft2 = new ShuttleVehicles("Protón", "Russian/Ukraine", "2001-Act", 9, typeFuelRussianUkraine);
        ShuttleVehicles spaceCraft3 = new ShuttleVehicles("Ariane V", "Europe", "1996-Act", 8, typeFuelEurope);
        ShuttleVehicles spaceCraft4 = new ShuttleVehicles("H-IIA", "Japan", "2001-Act", 7, typeFuelJapan);
        ShuttleVehicles spaceCraft5 = new ShuttleVehicles("Larga Marcha 3B", "Chinese", "1996-Act", 5, typeFuelChinese);
        HelpList.add(spaceCraft1);
        HelpList.add(spaceCraft2);
        HelpList.add(spaceCraft3);
        HelpList.add(spaceCraft4);
        HelpList.add(spaceCraft5);

    return HelpList;
    }

    /**
     * Creamos los tipos de combustible usados por pais
     *
     */
    public static void createFuels() {
         typeFuelEEUU = "H(liq.)+O(liq.)\n" +
                "Sólido*+Queroseno+N(liq.)\n" +
                "Queroseno+O(liq.)\n" +
                "H(liq.)+O(liq.)\n" +
                "Queroseno+O(liq)";
         typeFuelRussianUkraine = "Queroseno+O(liq)\n" +
                "  C2H8N2+NO\n" +
                "Queroseno+O(liq)\n" +
                "Queroseno+O(liq)\n" +
                "Queroseno+O(liq)";
         typeFuelEurope = "Sólido+N(liq.)+O(liq.)";
         typeFuelJapan = "Sólido+N(liq.)+O(liq.)\n";
         typeFuelChinese = "UDMH+N204";
    }

    /**
     * Imprimir
     * @return
     */
    @Override
    public String toString() {
        return "ShuttleVehicles{" +
                "shuttleVehiclesList=" + shuttleVehiclesList +
                ", Pais='" + country + '\'' +
                ", nameShuttle='" + nameShuttle + '\'' +
                ", Activity='" + Activity + '\'' +
                ", power=" + power +
                ", typeFuel='" + typeFuel + '\'' +
                '}';
    }

    /**
     * Encapsulamiento de los datos
     * @return
     */
    public List<ShuttleVehicles> getShuttleVehiclesList() {
        return shuttleVehiclesList;
    }

    public void setShuttleVehiclesList(List<ShuttleVehicles> shuttleVehiclesList) {
        this.shuttleVehiclesList = shuttleVehiclesList;
    }
}
