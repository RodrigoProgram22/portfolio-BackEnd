<%@page import="java.util.List"%>
<%@page import="Class.Auto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Autos!</h1>
        <%
            List<Auto> listaAutos = (List) request.getSession().getAttribute("listaAutos");
            int cont=1;
            for(Auto aut : listaAutos){ %>
            <p><b>Auto N°<%=cont%></b></p>
            <p>Marca: <%=aut.getMarca()%><p>
            <p>Modelo: <%=aut.getModelo()%><p>
            <p>Color: <%=aut.getColor()%><p>
            <p>Tipo de motor: <%=aut.getTipo_motor()%><p>
            <br>
            <% cont= cont+1; %> 
        <% } %>    
    </body>
</html>
