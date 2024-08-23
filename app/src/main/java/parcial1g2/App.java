
package parcial1g2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int avaluoVeh = 0, numVeh = 0, totalPagar = 0;
        String decadaVeh;

        System.out.print("Cuántos Vehiculos desea calcular?: ");
        numVeh = Integer.parseInt(sc.nextLine());

        try {
            for (int i = 0; i < numVeh; i++) {
                System.out.print("Ingrese la decada del vehiculo (90 | 00 | 10 | 20): ");
                decadaVeh = sc.nextLine();

                System.out.print("Ingrese el avaluo del vehiculo: ");
                avaluoVeh = Integer.parseInt(sc.nextLine().trim());

                totalPagar = calcularTotalImpuestos(avaluoVeh, decadaVeh);

                System.out.printf("""
                        %nEl avaluo del vehiculo es: $%d
                        La decada del vehiculo es: %s
                        El total a pagar es de: $%d
                        %n
                        """, avaluoVeh, decadaVeh, totalPagar);
            }
        } catch (Exception e) {
            System.out.println(-1);
        }

        // Logica de solución

    }

    public static int calcularTotalImpuestos(int avaluoVeh, String decadaVeh) {
        try {
            int impuestoRodamiento = 0, totalPagar = 0, seguro = 0;

            double tasaSeguro = 0, tasaRodamiento = 0;
            if (avaluoVeh > 0) {
                switch (decadaVeh) {
                    case "90":
                        tasaSeguro = 0.00816;
                        tasaRodamiento = 0.0409;
                        impuestoRodamiento = (int) (avaluoVeh * tasaRodamiento);
                        seguro = (int) (avaluoVeh * tasaSeguro);
                        totalPagar = (int) (impuestoRodamiento + seguro);

                        break;

                    case "00":
                        tasaSeguro = 0.00798;
                        tasaRodamiento = 0.0434;
                        impuestoRodamiento = (int) (avaluoVeh * tasaRodamiento);
                        seguro = (int) (avaluoVeh * tasaSeguro);
                        totalPagar = (int) (impuestoRodamiento + seguro);

                        break;
                    case "10":
                        tasaSeguro = 0.00712;
                        tasaRodamiento = 0.0493;
                        impuestoRodamiento = (int) (avaluoVeh * tasaRodamiento);
                        seguro = (int) (avaluoVeh * tasaSeguro);
                        totalPagar = (int) (impuestoRodamiento + seguro);

                        break;
                    case "20":
                        tasaSeguro = 0.0699;
                        tasaRodamiento = 0.05680;
                        impuestoRodamiento = (int) (avaluoVeh * tasaRodamiento);
                        seguro = (int) (avaluoVeh * tasaSeguro);
                        totalPagar = (int) (impuestoRodamiento + seguro);

                        break;

                    default:
                        totalPagar = -1;
                        break;
                }
            }
            return (int) totalPagar;
        } catch (Exception e) {
            return -1;
        }
    }

    /*
     * Implemente una funcion llamada calcularTotalImpuestos que cumpla con las
     * siguientes caracteristicas
     * Recibe:
     * - Una cadena de caracteres que representa la decada (70, 80, 90, 00, 10, 20,
     * Otra)
     * - Un entero que representa avaluo del vehiculo
     * Retorna:
     * - Un entero representando el valor total a pagar de los impuestos
     * Controlar errores retornando -1
     */
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------

}
