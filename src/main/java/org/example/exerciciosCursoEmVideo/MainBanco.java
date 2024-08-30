package org.example.exerciciosCursoEmVideo;

public class MainBanco {
    public static void main(String[] args) {
        Banco banco1;
        banco1 = new Banco(true, "Abdiel Athayde",12345678, "abc");
        banco1.status();

        Banco banco2 = new Banco(false, "Johnny", 12122769, "123");
        banco2.status();

    }
}
