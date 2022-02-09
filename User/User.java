package User;

import Spacecrafts.Spacecraft;

/**
 * Clase usuario donde guardamos la info del usuario y su nave
 */
public class User {

    private String nameUser;
    private String idUser;
    private Spacecraft spacecraft;

    /**
     * Constructor vacio
     */
    public User( ) {}

    /**
     * Constructor con parametros
     * @param nameUser
     * @param idUser
     */
    public User(String nameUser, String idUser) {
        this.nameUser = nameUser;
        this.idUser = idUser;
    }

    /**
     * Encapsulamiento de parametros
     * @return
     */
    public String getNameUser() {
        return nameUser;
    }
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
    public String getIdUser() {
        return idUser;
    }
    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Spacecraft getSpacecraft() {
        return spacecraft;
    }

    public void setSpacecraft(Spacecraft spacecraft) {
        this.spacecraft = spacecraft;
    }

    /**
     * Imprimir
     * @return
     */
    @Override
    public String toString() {
        return "User{" +
                "spacecraft=" + spacecraft +
                '}';
    }
}
