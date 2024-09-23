import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Widget {
    ArrayList<Dia> dias;
    String localidad;
    String nombreFicherohtml = "widget";
    String nombreFicheroCss = "widget";

    public Widget(Conversor_jsonToPackDias pack) {
        this.dias = pack.getDias();
        this.localidad = pack.nomeConcello;
        crearHTML();
    }
    public Widget(String nomeHTML,String nomeCss,Conversor_jsonToPackDias pack) {
        this.nombreFicherohtml = nomeHTML;
        this.nombreFicheroCss = nomeCss;
        this.dias = pack.getDias();
        this.localidad = pack.nomeConcello;
        crearCSS();
        crearHTML();

    }
    private void crearHTML(){
        int hora = Integer.parseInt(String.valueOf(LocalTime.now()).substring(0,2));

        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();


        StringBuilder html = new StringBuilder();
        html.append("<!DOCTYPE html>\n" +
                "<html lang=\"es\">\n" +
                "<head>\n" +
                "<meta charset=\"UTF-8\">\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <link rel=\"stylesheet\" type=\"text/css\" href=\""+nombreFicheroCss+".css\">\n" +
                "<title>Widget del Tiempo</title>\n");
        /*css*/
        //html.append("<style type=\"text/css\">"+crearCSS()+"\n</style>\n");
        /*css*/

        html.append("\n</head>\n" +
                "<body>\n" +
                "<div class=\"weather-widget\">\n" +
                "    <div class=\"hour\">"+ dateFormat.format(date) +"</div>\n" +
                "    <div class=\"date-time\">Hoy: "+dias.get(0).getFecha()+"</div>\n"
        );

        if(hora < 13 ){
            //Maña
            html.append( "    <div class=\"weather-icon\"><img src=\"recursos/iconos/"+dias.get(0).getManha()+".png\" width=\"100\" height=\"80\" /></div>\n" +
                    "    <div class=\"temperature\">"+dias.get(0).getTemperaturaMaxmanha()+"/"+dias.get(0).getTemperaturaMinmanha()+"ºC</div>\n");

        }else if(hora < 20){
            //Tarde
            html.append( "    <div class=\"weather-icon\"><img src=\"recursos/iconos/"+dias.get(0).getTarde()+".png\" width=\"100\" height=\"80\" /></div>\n" +
                    "    <div class=\"temperature\">"+dias.get(0).getTemperaturaMaxtarde()+"/"+dias.get(0).getTemperaturaMintarde()+"ºC</div>\n");

        }else if(hora < 24){
            //Noche
            html.append( "    <div class=\"weather-icon\"><img src=\"recursos/iconos/"+dias.get(0).getNoche()+".png\" width=\"100\" height=\"80\" /></div>\n" +
                    "    <div class=\"temperature\">"+dias.get(0).getTemperaturaMaxnoche()+"/"+dias.get(0).getTemperaturaMinnoche()+"ºC</div>\n");


        }

        html.append("    <div class=\"location\">"+localidad+"</div>\n");

                        //Dia2
                        html.append("\n"+
                "    <div class=\"forecast\">\n" +
                "        <div class=\"forecast-day\">\n" +
                "            <div class=\"small-icon\"><img src=\"recursos/iconos/"+dias.get(1).getManha()+".png\" width=\"50\" height=\"40\" /></div>\n" +
                "            <div class=\"day-name\">Dia:"+dias.get(1).getFecha().substring(8)+"</div>\n" +
                "            <div class=\"small-temperature\">"+dias.get(1).getTemperaturaMax()+"/"+dias.get(1).getTemperaturaMin()+"ºC</div>\n" +
                "        </div>\n");

                        //Dia3
                        html.append("\n"+
                "        <div class=\"forecast-day\">\n" +
                "            <div class=\"small-icon\"><img src=\"recursos/iconos/"+dias.get(2).getManha()+".png\" width=\"50\" height=\"40\" /></div>\n" +
                "            <div class=\"day-name\">Dia:"+dias.get(2).getFecha().substring(8)+"</div>\n" +
                "            <div class=\"small-temperature\">"+dias.get(2).getTemperaturaMax()+"/"+dias.get(2).getTemperaturaMin()+"ºC</div>\n" +
                "        </div>\n");

                        //Dia4
                        html.append(
                "        <div class=\"forecast-day\">\n" +
                "            <div class=\"small-icon\"><img src=\"recursos/iconos/"+dias.get(3).getManha()+".png\" width=\"50\" height=\"40\" /></div>\n" +
                "            <div class=\"day-name\">Dia:"+dias.get(3).getFecha().substring(8)+"</div>\n" +
                "            <div class=\"small-temperature\">"+dias.get(3).getTemperaturaMax()+"/"+dias.get(3).getTemperaturaMin()+"ºC</div>\n" +
                "        </div>\n");



                html.append("\n"+
                "    </div>\n" +
                "</div>\n"
                );
        /*js*/
        //html.append("\n"+crearScript()+"\n");
        /*js*/
        html.append("</body>\n" +
                "</html>");
        try{
            File crearCarpeta = new File("generado/whidget");
            crearCarpeta.mkdir();
        //EscrituraArchivo
        BufferedWriter bufferCrear = new BufferedWriter(
                new FileWriter("generado/whidget/"+nombreFicherohtml+".html")
        );

        bufferCrear.write(html.toString());

        bufferCrear.close();
    } catch (
    FileNotFoundException e) {
        System.out.println("Error al acceder al fichero " + e);
    } catch (
    IOException e) {
        System.out.println("No se ha podido escribir en el fichero");
    } catch (Exception e) {
        System.out.println("Error al acceder al fichero " + e);
    }

    }

    private String crearCSS(){

        StringBuilder css = new StringBuilder();

        css.append("\nbody {\n" +
                "        font-family: Cursive,Arial, sans-serif;\n" +
                "        display: flex;\n" +
                "        justify-content: center;\n" +
                "        align-items: center;\n" +
                "        height: 100vh;\n" +
                "        margin: 0;\n" +
                "        background-image: url(recursos/fondos/depositphotos_308814794-stock-photo-blue-sky-shining-stars-clouds.jpg);\n" +
                "        background-size: cover;\n" +
                "        background-position: center;\n" +
                "    }\n" +
                "    .weather-widget {\n" +
                "        background: rgba(255, 255, 255, 0.1);\n" +
                "        color: #fff;\n" +
                "        border-radius: 20px;\n" +
                "        padding: 10px;\n" +
                "        backdrop-filter: blur(10px);\n" +
                "        box-shadow: 0 8px 32px 0 #080808;\n" +
                "        border: 1px solid rgba(255, 255, 255, 0.18);\n" +
                "        text-align: center;\n" +
                "    }\n" +
                "    .weather-icon {\n" +
                "        font-size: 48px;\n" +
                "        margin-bottom: 2px;\n" +
                "    }\n" +
                "    .temperature {\n" +
                "        font-size: 24px;\n" +
                "        font-weight: bold;\n" +
                "        margin-top: -10px;\n" +
                "        margin-bottom: 5px;\n" +
                "    }\n" +
                "    .location {\n" +
                "        font-size: 16px;\n" +
                "        margin-bottom: 15px;\n" +
                "    }\n" +
                "    .date-time {\n" +
                "        font-size: 14px;\n" +
                "        margin-bottom: 15px;\n" +
                "    }\n" +
                "    .hour {\n" +
                "        font-size: 42px;\n" +
                "        margin-bottom: 10px;\n" +
                "    }\n" +
                "    .date {\n" +
                "        font-size: 14px;\n" +
                "        margin-bottom: 15px;\n" +
                "    }\n" +
                "    .thermometer-icon {\n" +
                "        font-size: 24px;\n" +
                "        vertical-align: middle;\n" +
                "        margin-left: 5px;\n" +
                "    }\n" +
                "    .forecast {\n" +
                "        display: flex;\n" +
                "        justify-content: space-between;\n" +
                "        margin-top: 15px;\n" +
                "    }\n" +
                "    .forecast-day {\n" +
                "        flex-grow: 1;\n" +
                "        text-align: center;\n" +
                "        margin-right: 5px; \n" +
                "        margin-left: 5px; \n" +
                "    }\n" +
                "    .day-name {\n" +
                "        font-size: 5px;\n" +
                "        font-weight: bold;\n" +
                "        margin-bottom: 5px;\n" +
                "    }\n" +
                "    .small-icon {\n" +
                "        font-size: 24px;\n" +
                "        margin-bottom: 0px;\n" +
                "    }\n" +
                "    .small-temperature {\n" +
                "        font-size: 9px;\n" +
                "        margin-bottom: 5px;\n" +
                "    }");
        try{
            File crearCarpeta = new File("generados/whidget");
            crearCarpeta.mkdir();
            //EscrituraArchivo
            BufferedWriter bufferCrear = new BufferedWriter(
                    new FileWriter("generado/whidget/"+nombreFicheroCss+".css")
            );
            bufferCrear.write(css.toString());
            bufferCrear.close();

        } catch (
                FileNotFoundException e) {
            System.out.println("Error al acceder al fichero " + e);
        } catch (
                IOException e) {
            System.out.println("No se ha podido escribir en el fichero");
        } catch (Exception e) {
            System.out.println("Error al acceder al fichero " + e);
        }

        return css.toString();
    }


    private String crearScript(){

        StringBuilder script = new StringBuilder();

        script.append("<script>\n" +
                "    function actualizarHoraYFecha() {\n" +
                "        var ahora = new Date();\n" +
                "        var hora = ahora.getHours();\n" +
                "        var minutos = ahora.getMinutes();\n" +
                "        minutos = minutos < 10 ? '0' + minutos : minutos;\n" +
                "        document.getElementById('hora').textContent = hora + ':' + minutos ;\n" +
                "        var dia = ahora.getDate();\n" +
                "        var mes = ahora.getMonth() + 1;\n" +
                "        var año = ahora.getFullYear();\n" +
                "        dia = dia < 10 ? '0' + dia : dia;\n" +
                "        mes = mes < 10 ? '0' + mes : mes;\n" +
                "        document.getElementById('fecha').textContent = dia + '/' + mes + '/' + año;\n" +
                "    }\n" +
                "    setInterval(actualizarHoraYFecha, 1000);\n" +
                "</script>\n");

        //System.out.println(script.toString());
        return script.toString();
    }

}
