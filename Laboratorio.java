import java.util.ArrayList;
public class Laboratorio
{
    private ArrayList<Alumno> alumnos;
    
    public Laboratorio()
    {
        alumnos = new ArrayList<Alumno>();
    }
    
    public void inscribir(String nombre, int clave)
    {
        Alumno agregar = new Alumno(nombre,clave);
        alumnos.add(agregar);
    }
    
    public void darBaja(int claveBaja)
    {
        for(int i = 0; i < alumnos.size(); i++)
        {
            Alumno alum = alumnos.get(i);
            if(alum.dimeClave() == claveBaja)
            {
                alumnos.remove(i);
            }
        }
    }
    
    public void imprimirLista()
    {
        for(int i = 0; i < alumnos.size(); i++)
        {
            Alumno alum = alumnos.get(i);
            System.out.println(alum);
        }
    }
}