# Lecciones de Interfaces Graficas con Java Swing

## Objetivo general

Esta secuencia esta pensada para alumnado con nivel intermedio de Java que ya domina variables, condicionales, bucles, metodos y clases. El objetivo es introducir Swing de forma progresiva, centrandose primero en la construccion de ventanas y componentes, y terminando con eventos y una separacion simple entre vista y controlador.

## Propuesta de secuencia

1. Leccion 1: crear una ventana minima.
2. Leccion 2: colocar componentes basicos.
3. Leccion 3: organizar la interfaz con layouts.
4. Leccion 4: responder a eventos del usuario.
5. Leccion 5: recoger datos de un formulario.
6. Leccion 6: separar vista y controlador.

---

## Leccion 1. Mi primera ventana

**Archivo:** `src/ui/leccion01/ventana/VentanaHolaMundo.java`

### Objetivos

- Entender que una aplicacion Swing se apoya en ventanas y componentes.
- Crear un `JFrame` sencillo.
- Mostrar un `JLabel` dentro de la ventana.
- Introducir `SwingUtilities.invokeLater(...)`.

### Ideas clave para explicar

- `JFrame` representa una ventana.
- `setTitle`, `setSize`, `setLocationRelativeTo` y `setDefaultCloseOperation` son configuraciones basicas.
- `setVisible(true)` muestra la interfaz.
- `invokeLater` lanza la creacion de la interfaz en el hilo de eventos de Swing.

### Guion sugerido para clase

1. Mostrar una clase `main` vacia y recordar la estructura basica de un programa Java.
2. Crear una ventana sin contenido.
3. Anadir un `JLabel` centrado.
4. Cambiar el texto y el tamano en directo para que el alumnado vea el efecto inmediato.

### Actividades propuestas

- Cambiar el titulo de la ventana.
- Probar distintos tamanos.
- Sustituir el texto del `JLabel` por el nombre del alumno o del modulo.

---

## Leccion 2. Componentes basicos

**Archivo:** `src/ui/leccion02/componentes/VentanaComponentesBasicos.java`

### Objetivos

- Identificar varios componentes de Swing.
- Usar `JLabel`, `JTextField`, `JComboBox`, `JCheckBox` y `JButton`.
- Entender que una interfaz puede construirse sin programar todavia el comportamiento.

### Ideas clave para explicar

- Los componentes graficos son objetos Java.
- Un `JPanel` sirve como contenedor.
- `GridLayout` reparte el espacio en una cuadricula sencilla.
- La interfaz ya comunica intencion aunque todavia no tenga eventos.

### Guion sugerido para clase

1. Partir de la ventana del ejemplo anterior.
2. Introducir un `JPanel`.
3. Ir anadiendo componentes uno a uno.
4. Pedir al alumnado que adivine el papel de cada componente antes de explicarlo.

### Actividades propuestas

- Anadir un nuevo campo para edad.
- Cambiar el contenido del `JComboBox`.
- Anadir un segundo `JCheckBox` para "Repite modulo".

---

## Leccion 3. Organizacion con layouts

**Archivo:** `src/ui/leccion03/layouts/FormularioRegistroLayout.java`

### Objetivos

- Entender por que no conviene posicionar componentes manualmente.
- Trabajar con `BorderLayout` y `GridLayout`.
- Construir una interfaz algo mas realista.

### Ideas clave para explicar

- Un layout decide como se colocan y redimensionan los componentes.
- `BorderLayout` divide la ventana en zonas.
- `GridLayout` funciona bien en formularios simples.
- Es habitual combinar varios paneles, cada uno con su layout.

### Guion sugerido para clase

1. Mostrar una interfaz desordenada como contraejemplo.
2. Explicar las zonas de `BorderLayout`.
3. Crear un formulario central con `GridLayout`.
4. Comentar por que los botones suelen ir en la parte inferior.

### Actividades propuestas

- Mover el area de observaciones al centro usando otro panel.
- Anadir un boton mas, por ejemplo `Limpiar`.
- Probar otros layouts y comparar el resultado visual.

---

## Leccion 4. Eventos

**Archivo:** `src/ui/leccion04/eventos/ContadorClicks.java`

### Objetivos

- Introducir la programacion orientada a eventos.
- Asociar acciones a botones con `addActionListener`.
- Modificar el estado de la interfaz cuando el usuario interactua.

### Ideas clave para explicar

- La aplicacion espera acciones del usuario.
- Un evento dispara codigo.
- La variable `contador` representa el estado interno.
- La etiqueta se actualiza para reflejar ese estado.

### Guion sugerido para clase

1. Ejecutar la interfaz y preguntar que deberia ocurrir al pulsar el boton.
2. Escribir el listener del boton principal.
3. Anadir un segundo boton para reiniciar.
4. Relacionar este modelo con otros eventos conocidos por el alumnado, como lectura de teclado o menus.

### Actividades propuestas

- Hacer que el contador sume de 2 en 2.
- Desactivar el boton al llegar a 10 clics.
- Anadir una etiqueta que diga si el numero es par o impar.

---

## Leccion 5. Recogida de datos de formulario

**Archivo:** `src/ui/leccion05/recogidadatos/ResumenFormularioAlumno.java`

### Objetivos

- Leer datos escritos por el usuario en distintos componentes.
- Reutilizar `ActionListener` para capturar el momento de lectura.
- Usar `getText()`, `getSelectedItem()` e `isSelected()`.
- Construir un resumen a partir de la informacion del formulario.

### Ideas clave para explicar

- Un `JTextField` se consulta con `getText()`.
- Un `JComboBox` permite recuperar la opcion elegida con `getSelectedItem()`.
- Un `JCheckBox` devuelve un booleano con `isSelected()`.
- Los datos suelen leerse cuando el usuario pulsa un boton.

### Guion sugerido para clase

1. Recordar brevemente el ejemplo anterior y localizar otra vez el `addActionListener`.
2. Ejecutar el formulario y pedir al alumnado que identifique que tipo de dato aporta cada control.
3. Leer cada componente por separado y guardar el valor en variables al pulsar el boton.
4. Construir una cadena resumen y mostrarla tanto en una etiqueta como en un `JOptionPane`.

### Actividades propuestas

- Anadir otro `JCheckBox` para indicar si el alumno repite modulo.
- Sustituir la edad por un `JComboBox` de rangos de edad.
- Validar que el nombre no este vacio antes de mostrar el resumen.

---

## Leccion 6. Vista y controlador

**Archivos:**

- `src/ui/leccion06/controladores/CalculadoraMediaView.java`
- `src/ui/leccion06/controladores/CalculadoraMediaController.java`
- `src/ui/leccion06/controladores/CalculadoraMediaApp.java`

### Objetivos

- Separar la parte visual de la logica.
- Mostrar una primera aproximacion al patron vista-controlador.
- Reutilizar conceptos previos de eventos y parseo de datos.

### Ideas clave para explicar

- La vista contiene componentes y metodos de acceso.
- El controlador escucha eventos y decide que hacer.
- Esta separacion mejora la organizacion cuando la interfaz crece.
- El ejemplo reutiliza `Double.parseDouble(...)` y manejo basico de errores.

### Guion sugerido para clase

1. Comparar este ejemplo con el de `ContadorClicks`.
2. Senalar que antes todo estaba junto y ahora se reparte en varias clases.
3. Mostrar como el controlador lee datos, calcula la media y actualiza la vista.
4. Abrir debate sobre cuando merece la pena separar responsabilidades.

### Actividades propuestas

- Mostrar tambien si el alumno aprueba o suspende.
- Anadir un boton `Limpiar`.
- Validar que las notas esten entre 0 y 10.

---

## Recomendaciones metodologicas

- Ejecutar cada ejemplo al inicio de la sesion para que el alumnado vea la meta.
- Construir el codigo poco a poco en clase, aunque ya exista un ejemplo completo.
- Pedir pequenas modificaciones tras cada bloque para forzar comprension real.
- Relacionar los eventos con conceptos ya conocidos de llamadas a metodos y objetos.

## Posible extension final

Como practica de cierre, se puede pedir un mini formulario de inscripcion con:

- nombre del alumno,
- curso o modulo,
- seleccion de turno,
- boton para validar datos,
- mensaje final en etiqueta o cuadro de dialogo.

Ese ejercicio permite reutilizar casi todo lo aprendido en la secuencia.
