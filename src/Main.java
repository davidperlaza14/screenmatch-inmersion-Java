import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersion en Java");
        //System.out.println("Pelicula Matrix");

        //Declaracion de variables
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
//        String sinopsis = """
//                La mejor pelicula del fin del milenio
//                """;
        double mediaEvaluacionesUsuarios = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("Esta incluido: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluacion de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("Pelicula Popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuarios = mediaEvaluacionesUsuarios + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calcula por el usuario es: " + mediaEvaluacionesUsuarios / 3);
    }
}