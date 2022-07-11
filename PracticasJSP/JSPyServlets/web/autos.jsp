<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Autos</title>
    </head>
    <body>
        <h1>Carga tu Auto favorito!</h1>
        <form action="SvAutos" method="POST">
            <p><label>Placa/Patente:</label><input type="text" name="placa"></p>
            <p><label>Marca:</label><input type="text" name="marca"></p>
            <p><label>Modelo:</label><input type="text" name="modelo"></p>
            <p><label>Color:</label><input type="text" name="color"></p> 
            <p><label>Tipo de motor:</label><input type="text" name="tipo_motor"></p> 
            <button type="submit">Enviar</button>   
        </form>
        <div style="background-color: red; color:white ;">
        <h1>Ver lista de Autos</h2>
        <p>Si desea ver todos los autos haga click en el botón mostrar todos los autos</p>
        <form action="SvAutos" method="GET">
            <button type="submit">Ver Autos</button>
        </form>   
        </div>  
    </body>
</html>
