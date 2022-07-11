package Sockets;

import java.io.DataOutputStream;
import java.io.IOException;

public class Cliente extends ConexionSockets{
    //Constructor
    //Pasamoss el tipo para que Coonexion lo tome e inicialice
    public Cliente() throws IOException{
        super("cliente");
    }
    
    //Iniciamos el cliente
    public void startClient(){
        try{
            //Flujo de datos hacia el servidor
            salidaServidor = new DataOutputStream(socketCliente.getOutputStream());
            
            //Enviamos 3 mnsajes para probar
            for (int i = 0; i < 3;i++){
                //Se escrribe en el servidor usand su flujo de datos
                salidaServidor.writeUTF("Este es el mensaje número " + (i+1) + "\n");
            }
            //Finalizamos la conexión
            socketCliente.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}