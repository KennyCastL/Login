package login;

public class Persona {
    public static String nombre;
    public static String contrasena;
    private int celular;
    private String correo;
    private int identificacion;
    private String tipoIdentificacion;
    private String nombreUsuario;



    public Persona(String nombre, int celular, String correo, int identificacion, String tipoIdentificacion, String nombreUsuario, String contrasena) {
        this.nombre = this.nombre;
        this.celular = this.celular;
        this.correo = this.correo;
        this.identificacion = this.identificacion;
        this.tipoIdentificacion = this.tipoIdentificacion;
        this.nombreUsuario = this.nombreUsuario;
        this.contrasena = this.contrasena;

    }

    /* private int numProducto;
        private int codVerificacion;
        private int tipoProducto;*/
    public String getNombre() {
        return Persona.nombre;
    }

    public int getCelular() {
        return celular;
    }

    public String getCorreo() {
        return correo;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void accesoExitoso(){
        System.out.println("Acceso Exitoso"+ getNombre()+"/n");
    }




    protected void producto(int tipoProducto){
        switch (tipoProducto){
            case 1:
                System.out.println("Libre inversion");
                break;
            case 2:
                System.out.println("Tarjeta de Credito");
                break;
            case 3:
                System.out.println("Libranza");
                break;
            case 4:
                System.out.println("Hipotecario");
                break;
            default:
                System.out.println("Tipo de producto invalido");

        }

}
    protected void roles (int tipoUsuario){
        switch (tipoUsuario){
            case 0:
                System.out.println("Cliente");
                break;
            case 1:
                System.out.println("Operador");
                break;
            case 2:
                System.out.println("Gerencia");
                break;
            case 3:
                System.out.println("TI");
                break;
            default:
                System.out.println("Tipo de usuario invalido");

        }

    }


}
