# Diagrama de Clases

![alt tag](https://github.com/cecicollazo/tp0-DDS/blob/master/Diagrama%20de%20clases.png)

# Aviso

Los test fallan debido a que el metodo con el before(init) no se puede ejecutar correctamente. El metodo
que falla dentro del init es operacion.cargarItem(item), no logre descifrar porque falla ese metodo.

## Objetivos

* Puesta en marcha del ambiente de desarrollo
* Repasar / familiarizarse con las tecnologías básicas a utilizar

## Contexto

Se debe modelar e implementar el siguiente requerimiento de la entrega 1 del TP:
Una operación de egreso es un gasto realizado por una organización. Una operación
de egresos puede contener varios artículos (o ítems de servicios). En general, una
operación de egreso está asociada a un documento comercial.
Requerimientos
Crear un proyecto Maven siguiendo el arquetipo básico. El mismo debe ser creado
sobre un repositorio Github creado por el alumno. El proyecto debe cumplir los siguientes
requerimientos:
* La operación de egreso debe poder calcular su valor en base a los items que contiene
* Una vez que la operación está cerrada, no se le puede cambiar el precio.
* Tenga en cuenta que pasa si se cambia el precio de un artículo
* La operación de compra genera el documento remito, solo si todos los ítems son artículos
(no servicios).
* Los tests deben ejecutarse correctamente cuando se ejecute por consola “mvn test”

## Entregable y Forma de entrega

Subir un tag en un repositorio propio de Github e implementar al menos 2 pruebas
conceptualmente distintas para cada uno de los items anteriores. Hay que registrar el tag
en este formulario . Se puede hacer más de una vez, pero finalmente se probará la última.

## Material Sugerido

https://zeroturnaround.com/rebellabs/git-commands-and-best-practices-cheat-sheet/

https://www.udacity.com/course/how-to-use-git-and-github--ud775

https://zeroturnaround.com/rebellabs/java-collections-cheat-sheet/

https://zeroturnaround.com/rebellabs/java-8-streams-cheat-sheet/

https://zeroturnaround.com/rebellabs/java-8-best-practices-cheat-sheet/

https://zeroturnaround.com/rebellabs/java-generics-cheat-sheet/

https://zeroturnaround.com/rebellabs/junit-cheat-sheet/

https://github.com/dds-utn/links-utiles -> Herramientas tecnológicas
