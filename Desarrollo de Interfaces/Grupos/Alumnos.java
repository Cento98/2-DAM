public class Alumnos {
    
    private int id;
    private String nombre;
    private int grupo;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrupo() {
        return this.grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Alumnos(){
        id=0;
        nombre="Alumno0";
        grupo=0;
    }

    public Alumnos(int id, String nombre,int grupo){
        this.id=id;
        this.nombre=nombre;
        this.grupo=grupo;
    }

    public void tostring(){
        System.out.println(nombre);
        System.out.println("Grupo: "+grupo);
    }


}
