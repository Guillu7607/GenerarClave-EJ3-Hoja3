# Resumen
Este proyecto consiste en una aplicación de consola desarrollada en Java. El objetivo principal del ejercicio es aprender a extraer información posicional específica de cadenas de texto dinámicas y manipular estructuras mutables mediante la clase StringBuilder, asegurando un control estricto sobre la longitud final del resultado (relleno o padding).

## Características
Lectura Dinámica Indefinida: Utiliza un bucle while(true) que procesa de manera interactiva las entradas del usuario por consola a través de Scanner, finalizando de forma limpia mediante la detección de una cadena vacía (linea.isEmpty()).

Prevención de Errores de Desbordamiento (IndexOutOfBoundsException): Implementa el método matemático Math.min(10, lineas.size()) para establecer un límite superior seguro antes de iterar sobre la lista indexada.

Lógica de Relleno (Padding): Si los datos de entrada aportados por el usuario no cumplen con el tamaño estándar requerido (10 caracteres), la aplicación replica el último carácter analizado de forma iterativa hasta alcanzar el tamaño exacto.

Manipulación de Strings Eficiente: Centraliza la concatenación de caracteres individuales utilizando la API nativa StringBuilder, optimizando la recolección de basura (Garbage Collector) en memoria.
