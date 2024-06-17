package login;

public class Operador extends Persona {


    protected final int tipoUsuario=1;
    public Operador(String nombre,int celular,String correo,int identificacion,String tipoIdentificacion,String nombreUsuario,String contrasena) {
        super(nombre, celular, correo, identificacion, tipoIdentificacion, nombreUsuario, contrasena);

    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }
}
