<%@page import="java.util.List"%>
<%@page import="Class.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <h1>Lista de clientes!</h1>
        <%
            List<Cliente> listaClientes = (List) request.getSession().getAttribute("listaClientes");
            int cont=1;
            for(Cliente cli : listaClientes){ %>
            <p><b>Cliente N°<%=cont%></b></p>
            <p>DNI: <%=cli.getDni()%><p>
            <p>Nombre: <%=cli.getNombre()%><p>
            <p>Apellido: <%=cli.getApellido()%><p>
            <p>Telefono: <%=cli.getTelefono()%><p>
            <br>
            <% cont= cont+1; %> 
        <% } %>    
    </body>
</html>
