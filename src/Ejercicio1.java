import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] si){
        String cadena= "hola";
        ArrayList<String> listaDeCadenas = new ArrayList<>();
        listaDeCadenas.add("Cadena 1");
        listaDeCadenas.add("Cadena 2");
        listaDeCadenas.add("Cadena 3");
        listaDeCadenas.add("Cadena 4");
        listaDeCadenas.add("Cadena 5");

        String resultados= this.ejercicio1(cadena, listaDeCadenas);
        System.out.println();
    }
    public String ejercicio1(String unString, ArrayList<String> unaListaDeStrings){
        for(int i = 0; i< unaListaDeStrings.size(); i++) {
            String siguienteString = unaListaDeStrings.get(i);
            if (unString.equals(siguienteString)) {
                return siguienteString;
            }
        }
        return null;
    }
}
