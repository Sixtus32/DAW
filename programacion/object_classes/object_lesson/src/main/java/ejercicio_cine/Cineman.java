/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_cine;

/**
 *
 * @author sixtu
 */
public class Cineman {
    public static void main(String[] args) {
        // Nombres.
        String [] nombres={"Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Harper", "Evelyn", "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett", "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora", "Lily", "Eleanor", "Hannah", "Lillian", "Addison", "Aubrey", "Ellie", "Stella", "Natalie", "Zoe", "Leah", "Hazel", "Violet", "Aurora", "Savannah", "Audrey", "Brooklyn", "Bella", "Claire", "Skylar"};
             
        // La pelicula que se va a proyectar 
        Pelicula pelicula=new Pelicula("El Irlandes", 1, (byte)18, "Martin Scorsese");
        
        // El Cine : Lope de Vega. 
        MyCine cine=new MyCine(pelicula, 4, 10, 9);
        // Def. La pelicula 
        // Def. La cuantia a pagar.
        // Def. El número de filas y columnas.
        
        
        // Número total de asientos por cine creado
        int numeroAsientoTotal=cine.getAsiento().length * cine.getAsiento()[0].length; // Aqui multiplicamos filas * columnas
        
        //Generará el número aletoria de Espectadores que intentaran entrar al cine.  
        int numEspectadores=(int)(Math.random() * (numeroAsientoTotal + 1));
        
        // Array de Espectadores 
        Espectador [] espectador=new Espectador[numEspectadores];
        
        // Para mostrar asientos 
        cine.mostrarAsientos();
        
        /*"⣿⣿⣿⡇⢩⠘⣴⣿⣥⣤⢦⢁⠄⠉⡄⡇⠛⠛⠛⢛⣭⣾⣿⣿⡏\n" +
        "⣿⣿⣿⡇⠹⢇⡹⣿⣿⣛⣓⣿⡿⠞⠑⣱⠄⢀⣴⣿⣿⣿⣿⡟\n" +
        "⣿⣿⣿⣧⣸⡄⣿⣪⡻⣿⠿⠋⠄⠄⣀⣀⢡⣿⣿⣿⣿⡿⠋\n" +
        "⠘⣿⣿⣿⣿⣷⣭⣓⡽⡆⡄⢀⣤⣾⣿⣿⣿⣿⣿⡿⠋\n" +
        "⠄⢨⡻⡇⣿⢿⣿⣿⣭⡶⣿⣿⣿⣜⢿⡇⡿⠟⠉\n" +
        "⠄⠸⣷⡅⣫⣾⣿⣿⣿⣷⣙⢿⣿⣿⣷⣦⣚⡀\n" +
        "⠄⠄⢉⣾⡟⠙❤️⠈⢻⣿⣷⣅⢻⣿⣿⣿⣿⣿⣶⣶⡆⠄⡀\n" +
        "⠄⢠⣿⣿⣧⣀⣀⣀⣀⣼⣿⣿⣿⡎⢿⣿⣿⣿⣿⣿⣿⣇❤️⠄\n" +
        "⠄⢸⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⢇⣎⢿⣿⣿⣿⣿⣿⣿⣿⣶⣶\n" +
        "⠄⠄⠻⢿⣿⣿⣿⣿⣿⣿⣿⢟⣫⣾⣿⣷⡹⣿⣿⣿⣿⣿⣿⣿⡟\n" +
        "⠄⠄⠄⠄⢮⣭⣍⡭⣭⡵⣾⣿⣿⣿⡎⣿⣿⣌⠻⠿⠿⠿⠟⠋\n" +
        "⠄⠄⠄⠄⠈⠻⣿⣿⣿⣿⣹⣿⣿⣿⡇⣿⣿⡿\n" +
        "⠄⠄⣀⣴⣾⣶⡞⣿⣿⣿⣿⣿⣿⣿⣾⣿⡿⠃\n" +
        "⣠⣾⣿⣿⣿⣿⣿⣹⣿⣿⣿⣿⣿⡟⣹⣿⣳⡄\""*/
        
        // Se mostra el número de posibles espectadores que se presentaron para ver la pelicula
        System.out.println("\n********************************************************\n\tAsistencia de : " + numEspectadores + "\n\tPara un total de : " + numeroAsientoTotal + " asientos disponibles.\n\n********************************************************");
        
        // A todos los espectadores se le asigna la info correspondiente de forma aletoria.
//        int num=0; // Con esto lo vamos sentado uno a uno, es decir, va en orden de elección de nombre del especatador.
        for (Espectador espectador1 : espectador) {
            espectador1=new Espectador(nombres[(int)(Math.random() * nombres.length)], (byte) (Math.random() * (60 - 16 + 1) + 16), Math.random() * 6);
            cine.venderEntradas(espectador1);
//            num++;
        }
        System.out.println("Información de los espectadores :");
        for (Espectador espectador1 : cine.getEspectador()) {
            System.out.println("\n - "+ espectador1);
        }
        
        System.out.println("\n********************************************************\n\tNumero de espectadores finales : " + cine.getEspectador().size() + " .\n********************************************************");
        
        cine.mostrarAsientosNoOcupados();
        
        
        /// !!! QUE QUIERE DECIR QUE LOS DATOS DE LA PELICULA SEAN ALETORIOS.
        /*
            Es decir, se supone que en una sala solo puede ser emitidad una
            pelicula.
        */
        
        System.out.println("s6x");
        
        
//        cine.venderEntradas();
        
//        cine.mostrarAsientos();
    }
}
