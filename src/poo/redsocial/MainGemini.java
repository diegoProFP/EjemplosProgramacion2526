package poo.redsocial;

public class MainGemini {

    public static void main(String[] args) {
        // 1. Inicializar el motor de la red social
        ProgramaRedSocial miRed = new ProgramaRedSocial();

        // 2. Crear algunas Direcciones
        Direccion dir1 = new Direccion("Calle Mayor 1", "Madrid", "28001", "España");
        Direccion dir2 = new Direccion("Av. Diagonal 45", "Barcelona", "08001", "España");
        Direccion dir3 = new Direccion("Rua da Sofia", "Coimbra", "3000", "Portugal");

        // 3. Crear Usuarios
        Usuario user1 = new Usuario("CoderArt", "arturo@mail.com", dir1);
        Usuario user2 = new Usuario("JavaQueen", "laura@mail.com", dir2);
        Usuario user3 = new Usuario("ByteMaster", "pedro@mail.com", dir3);
        Usuario userAnon = new Usuario("Anonimo", "anon@mail.com"); // Sin dirección

        // 4. Crear Publicaciones
        Publicacion pub1 = new Publicacion(user1, "¡Hola mundo! Mi primera publicación en esta red.");
        Publicacion pub2 = new Publicacion(user2, "Aprendiendo Programación Orientada a Objetos en Java.");
        Publicacion pub3 = new Publicacion(user3, "Ayer visité Coimbra y fue espectacular.");

        // 5. Agregar Comentarios a las publicaciones
        // Comentarios para la pub 1
        pub1.agregarComentario(new Comentario(user2, "¡Bienvenido a la red!"));
        pub1.agregarComentario(new Comentario(user3, "Dale duro al código.", true));

        // Comentarios para la pub 2
        pub2.agregarComentario(new Comentario(user1, "La POO es la base de todo."));
        pub2.agregarComentario(new Comentario(userAnon, "No olvides repasar la herencia."));

        // Comentarios para la pub 3
        pub3.agregarComentario(new Comentario(user2, "¡Qué envidia! Pásalo bien."));
        pub3.agregarComentario(new Comentario(user1, "¡PAcooo! Pásalo bien."));
        pub3.agregarComentario(new Comentario(user2, "¡Manueeee! Pásalo bien."));
        pub3.agregarComentario(new Comentario(user3, "¡Pásalo mal!."));

        // 6. Registrar las publicaciones en el programa principal
        miRed.agregarPublicacion(pub1);
        miRed.agregarPublicacion(pub2);
        miRed.agregarPublicacion(pub3);

        // 7. Mostrar el muro
        System.out.println("\n--- INICIANDO RENDERIZADO DEL MURO ---");
        miRed.mostrarMuro();
    }
}
