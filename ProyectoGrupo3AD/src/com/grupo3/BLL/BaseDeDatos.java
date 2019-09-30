package com.grupo3.BLL;

import com.grupo3.DAL.DB4O;
import com.grupo3.DAL.Datos;
import com.grupo3.DAL.MySQL;
import com.grupo3.DAL.SQLite;

public abstract class BaseDeDatos {
    private static Datos datos;
    private static MySQL mySQL;
    private static DB4O db4O;
    private static SQLite sqLite;

    public static void introducirDatosCC (String nombreCC, String tipoBDD) {
        datos = new Datos(nombreCC,tipoBDD);
    }

    public static Datos getDatos() {
        return datos;
    }

    public static void conectarBDD() {
        switch (datos.getTipoBDD()) {
            case "MYSQL":
                /*
                mySQL.conectar();
                 */
            case "SQLITE":
                /*
                sqLite.conectar()
                 */
            case "DB4O":
                /*
                mySQL.conectar()
                 */
        }
    }
}
