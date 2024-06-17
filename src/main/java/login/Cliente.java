package login;

public class Cliente extends Persona {
    private int numProducto;
    protected final int tipoUsuario = 0 ;

    public Cliente(String nombre,int celular,String correo,int identificacion,String tipoIdentificacion,String nombreUsuario,String contrasena,int numProducto){
        super(nombre,celular,correo,identificacion,tipoIdentificacion,nombreUsuario,contrasena);
        this.numProducto = this.numProducto;
    }

    public void setNumProducto(int numProducto) {

        this.numProducto = numProducto;
    }

    public int getNumProducto() {
        return numProducto;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }



}
