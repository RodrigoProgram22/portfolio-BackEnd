package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ConexionSockets {
    private final int puerto = 8090;//Puerto para conectar
    private final String host = "localhost";//Dirección ip para la conexión
    protected String mensajeServidor;//Variable para los mensajes recibidos en el servidor
    protected ServerSocket socketServidor;//Socket del servidor
    protected Socket socketCliente;//Socket del cliente
    protected DataOutputStream salidaServidor, salidaCliente;//Variables de salida

    public ConexionSockets(String tipo) throws IOException //Constructor
    {
    if(tipo.equalsIgnoreCase("servidor")){
        //Creamos socket para el servidor
        //se usa el puerto que configuramos anteiormente
        socketServidor = new ServerSocket(puerto);
        //Creamos el socket para el cliente
        socketCliente = new Socket();
    }else{
        //Creamos socket para el cliente 
        //le pasamos como parametro el host y el puerto
        socketCliente = new Socket(host,puerto);
    }
    }
}