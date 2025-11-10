# Uso de Semaphore en Java
## Moisés Ortiz Fernández 2º DAM

Semaphore es una clase en Java que se puede utilizar para la gestión de hilos que gestiona si un recurso de una sección crítica está disponible o no. La ventaja de utilizar Semaphore es que se le puede indicar el número de hilos que entrarán a la vez, o también se 
puede establecer de forma binaria si no le introducimos ningún valor. Por eso Semaphore es el más apropiado para este problema, puesto que queremos que puedan entrar tres coches (hilos) al aparcamiento al mismo tiempo y se acceda a su información (si fuese necesaria).
Mientras que si utlizasemos synchronized, solo podrían entrar los coches uno por uno y esperar a que cada uno termine su función o en el caso de usar wait()/notify() sería más obstuso controlar la entrada y salida.

Salida de la aplicación:
<p align="center">
  <img width="410" height="572" alt="imagen" src="https://github.com/user-attachments/assets/5f6d07c9-0176-4c53-8974-bc44a42dfada" />
</p>
