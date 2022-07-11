package Sockets;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Servidor extends ConexionSockets {
    //implementa el constructor de conexion sockets
    //pasamos el tipo para que Conexion lo tome e inicialice
    public Servidor() throws IOException{
        super("servidor");
    }
    public void startServer(){
        try{
        //el método accept inicializa el socket
        //queda a la espera de solicitudes
        System.out.println("Esperando por una Conexion");
        socketCliente = socketServidor.accept();
        
        //se obtiene el flujo de salida del cliente
        System.out.println("Cliente en linea");
        salidaCliente = new DataOutputStream(socketCliente.getOutputStream());
        
        //Enviamos un mensaje al cliente
        salidaCliente.writeUTF("Petición recibida y aceptada");
        
        //Se obtiene el flujo entrante desde el cliente
        BufferedReader entrada = new BufferedReader(new InputStreamReader(socketCliente.getInputStream()));
       
        //Mientras haya mensajes del cliente
        while((mensajeServidor = entrada.readLine()) != null){
            //Mostramos los mensajes recibidos
            System.out.println(mensajeServidor);
        }
        //Una vez que termino de leer los mensajes
        //Finalizamos la conexion
        System.out.println("Fin de la conexión");
        socketServidor.close(); //Se finaliza la conexión con el cliente
        }
        catch (IOException e){
        System.out.println(e.getMessage());
        }
    }
}