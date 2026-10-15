package pablo.jimenez.lab1ut3_ad_pablojimenezjorquera;

import java.util.List;

public class Lab1ut3_AD_PabloJimenezJorquera {

    public static void main(String[] args) {
        EscuadronDataAccessObject dao = new EscuadronDataAccessObjectImplementacion();

        dao.crearEstructura();

        dao.registrarEscuadron(new EscuadronDataTransferObject("ESC-001", "Escuadron Alfa", "Sector Lothal", 12));
        dao.registrarEscuadron(new EscuadronDataTransferObject("ESC-002", "Escuadron Sombra", "Sector Endor", 8));

        System.out.println("\n--- REGISTRO DE ESCUADRONES ---");
        List<EscuadronDataTransferObject> escuadrones = dao.obtenerTodos();
        for (EscuadronDataTransferObject e : escuadrones) {
            System.out.println(e);
        }
    }
}