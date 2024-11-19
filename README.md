# Conversor de Monedas

## Descripción
Este proyecto es una aplicación en Java que permite realizar conversiones de moneda entre diferentes tipos de divisas utilizando la API de ExchangeRate-API. Es útil para calcular valores en diferentes monedas de forma rápida y sencilla.

## Funcionalidades
- Convertir de USD a otras monedas (COP, ARS, BRL).
- Convertir de otras monedas a USD.
- Manejo de tasas de cambio en tiempo real utilizando la API.

## Requisitos
- **Java 11 o superior**
- **IntelliJ IDEA** (opcional, para desarrollo)
- Biblioteca externa: [Gson](https://github.com/google/gson)

## Instalación
1. Clona el repositorio o descarga los archivos del proyecto.
2. Asegúrate de tener instalada la biblioteca Gson. Si no, puedes añadir el archivo `gson-2.11.0.jar` al classpath de tu proyecto.
3. Configura tu entorno de desarrollo con IntelliJ o el IDE de tu preferencia.

## Uso
1. Ejecuta la clase `Principal`.
2. Selecciona la opción de conversión deseada.
3. Ingresa las cantidades que quieres convertir.
4. Obtendrás el resultado basado en la tasa de cambio actual.

## Estructura del Proyecto
- `Principal.java`: Clase principal para ejecutar la aplicación.
- `ApiCliente.java`: Realiza solicitudes HTTP a la API de tasas de cambio.
- `ConversorDeMoneda.java`: Lógica principal para gestionar las conversiones.
- `FiltroDeMonedas.java`: Filtra y formatea los resultados.

## Autor
Creado por Diego Ariza.




