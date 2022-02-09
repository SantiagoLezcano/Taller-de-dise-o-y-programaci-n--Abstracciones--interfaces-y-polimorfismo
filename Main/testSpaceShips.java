package Main;

import Spacecrafts.*;
import User.User;

import java.util.List;
import java.util.Scanner;

public class testSpaceShips {

    public static void main(String[] args) {
        User user = new User();
        Scanner nx = new Scanner(System.in);
        ShuttleVehicles SV = new ShuttleVehicles();
        UnmannesSpacecraft US= new UnmannesSpacecraft();
        MannedSpacecraft MS= new MannedSpacecraft();
        int opSw;
        int op;
        do {System.out.println("Ingresa 1 para entrar, 2 para salir: ");
            op = Integer.parseInt(nx.nextLine());
            if (op == 1) {
                do {
                    System.out.println("BIENVENIDO A LA ENCICLOPEDIA DE LAS NAVES ESPACIALES\n" +
                            "¡HOY APRENDERAS DE ELLAS!");
                    System.out.println("Ingrese su id: ");
                    user.setIdUser(nx.nextLine());
                    System.out.println("Ingrese su nombre: ");
                    user.setNameUser(nx.nextLine());
                } while (user.getIdUser() == null && user.getNameUser() == null);
                System.out.println("BIENVENIDO: " + user.getNameUser() + " Disfruta de nuestras naves");

                do {
                    System.out.println("Ingresa \n" +
                            "1. Si quieres escoger tu nave\n" +
                            "2. Conocer las caracteristicas de mi nave actual\n" +
                            "3. Salir\n");
                    opSw = Integer.parseInt(nx.nextLine());
                    switch (opSw) {
                        case 1:
                            int opShip;
                            int opEfficiencyPower;
                            do {
                                System.out.println("Ingresa\n" +
                                        "1. Vehiculos Lanzaderos\n" +
                                        "2. Naves espaciales no tripuladas\n" +
                                        "3. Naves espaciales tripuladas\n" +
                                        "4. Atras\n");
                                opShip = Integer.parseInt(nx.nextLine());
                                if (opShip == 1) {
                                    SV.createSpacecrafts();
                                    int sizeList = SV.getShuttleVehiclesList().size();
                                    String vector[] = new String[sizeList];
                                    for (int i = 0; i < sizeList; i++) {
                                        vector[i] = SV.getShuttleVehiclesList().get(i).getCountry();
                                    }
                                    int opShipSelect = 0;
                                    do {
                                        System.out.println("Selecciona cual deseas tener\n" +
                                                "1. " + vector[0] +
                                                "\n2. " + vector[1] +
                                                "\n3. " + vector[2] +
                                                "\n4. " + vector[3]+
                                                "\n5. Salir" );

                                            opShipSelect = Integer.parseInt(nx.nextLine());
                                        if(opShipSelect!=5) {
                                            user.setSpacecraft(SV.getShuttleVehiclesList().get(opShipSelect - 1));
                                            do {
                                                System.out.println("Que deseas saber de tu nave" +
                                                        "\n1. Es potente" +
                                                        "\n2. Es eficiente" +
                                                        "\n3. Atras");
                                                opEfficiencyPower = Integer.parseInt(nx.nextLine());
                                                if (opEfficiencyPower == 1) {
                                                    SV.isPowerFul(SV.getShuttleVehiclesList().get(opShipSelect - 1));
                                                } else {
                                                    SV.isEfficient(SV.getShuttleVehiclesList().get(opShipSelect - 1));
                                                }
                                            } while (opEfficiencyPower != 3);
                                        }
                                    } while (opShipSelect != 5);


                                }else if(opShip==2){
                                    US.createUnmannesspacecraft();
                                    int sizeList = US.getUnmannesspacecraft().size();
                                    String vector[] = new String[sizeList];
                                    for (int i = 0; i < sizeList; i++) {
                                        vector[i] = US.getUnmannesspacecraft().get(i).getCountry();
                                    }
                                    int opShipSelect = 0;
                                    do {
                                        System.out.println("Selecciona cual deseas tener\n" +
                                                "1. " + vector[0] +
                                                "\n2. " + vector[1] +
                                                "\n3. " + vector[2] +
                                                "\n4. Salir" );

                                            opShipSelect = Integer.parseInt(nx.nextLine());
                                        if(opShipSelect!=4) {
                                            user.setSpacecraft(US.getUnmannesspacecraft().get(opShipSelect - 1));
                                            do {
                                                System.out.println("Que deseas saber de tu nave" +
                                                        "\n1. Es potente" +
                                                        "\n2. Es eficiente" +
                                                        "\n3. Atras");
                                                opEfficiencyPower = Integer.parseInt(nx.nextLine());
                                                if (opEfficiencyPower == 1) {
                                                    US.isPowerFul(US.getUnmannesspacecraft().get(opShipSelect - 1));
                                                } else {
                                                    US.isEfficient(US.getUnmannesspacecraft().get(opShipSelect - 1));
                                                }
                                            } while (opEfficiencyPower != 3);
                                        }
                                    } while (opShipSelect != 4);

                                }else if(opShip==3){
                                    MS.createUnmannesspacecraft();
                                    int sizeList = MS.getMannedspacecraft().size();
                                    String vector[] = new String[sizeList];
                                    for (int i = 0; i < sizeList; i++) {
                                        vector[i] = MS.getMannedspacecraft().get(i).getCountry();
                                    }
                                    int opShipSelect = 0;
                                    do {
                                        System.out.println("Selecciona cual deseas tener\n" +
                                                "1. " + vector[0] +
                                                "\n2. " + vector[1] +
                                                "\n3. " + vector[2] +
                                                "\n4. " + vector[3] +
                                                "\n5. Salir" );
                                        opShipSelect = Integer.parseInt(nx.nextLine());

                                        if(opShipSelect!=5) {
                                            user.setSpacecraft(MS.getMannedspacecraft().get(opShipSelect - 1));
                                            do {
                                                System.out.println("Que deseas saber de tu nave" +
                                                        "\n1. Es potente" +
                                                        "\n2. Es eficiente" +
                                                        "\n3. Atras");
                                                opEfficiencyPower = Integer.parseInt(nx.nextLine());
                                                if (opEfficiencyPower == 1) {
                                                    MS.isPowerFul(MS.getMannedspacecraft().get(opShipSelect - 1));
                                                } else {
                                                    MS.isEfficient(MS.getMannedspacecraft().get(opShipSelect - 1));
                                                }


                                            } while (opEfficiencyPower != 3);
                                        }
                                    } while (opShipSelect != 5);
                                }

                            } while (opShip != 4);
                            break;

                        case 2:
                            if(user.getSpacecraft()!=null){
                                System.out.println(user.getSpacecraft().toString());
                            }else{
                                System.out.println("no has escogido nave");
                            }
                            break;
                        case 3:
                            System.out.println("GRACIAS POR CONSULTAR NUESTRA ENCICLOPEDIA");
                            break;

                    }
                } while (opSw !=3);
            }
        } while (op != 2);
        System.out.println("ADIOS");


    }
}
