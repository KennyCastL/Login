package login;

import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static ArrayList<Persona> integrantes = new ArrayList<Persona>();

    private static String nomGuardar;
    private static String clvGuardar;

    public static void main(String[] args) {

        Cliente cl1 = new Cliente("Heidi", 2, "H@gmail", 253, "CC", "Hav", "123", 465);
        Operador op1 = new Operador("Kenny", 3, "K@plan.com", 754, "cc", "KC", "456");

        integrantes.add(cl1);
        integrantes.add(op1);


        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese su nombre : " + cl1.getNombre());
        Persona.nombre = sc.next();
        Scanner psc = new Scanner(System.in);
        System.out.println("ingrese su contraseña : ");
        Persona.contrasena = psc.next();
        if (sc.equals(Persona.nombre) && psc.equals(Persona.contrasena)) {
            System.out.println("Ingreso exitoso");
        } else {
            System.out.println("Datos incorrectos");
        }

    }


}
