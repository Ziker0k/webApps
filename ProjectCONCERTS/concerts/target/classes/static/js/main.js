$(function(){
    $("#all-tickets").click(function()
    {
        $("#rock, #rap, #classic").removeClass("active");
        $("#all-tickets").addClass("active");
        $.get('/allTicket/', function(response)
        {
            $("#tickets").empty();


            for (i in response){
                $("#tickets").append("<div class=''  style='width: 30%' id = 'tick" + response[i][9] +"' >");
                $("#tick" + response[i][9]).append("<div class='tickets' id = 'tick_2" + response[i][9] +"' style='box-shadow: 0px 5px 10px dimgray;'>");
                $("#tick_2" + response[i][9]).append("<img src='" + response[i][6] + "'" + " width='200' height='200' class='card-img-top'>");
                $("#tick_2" + response[i][9]).append("<div class='p-2' id = 'tick_3" + response[i][9] +"' style='background-color: #e0e0e0;'>");
                $("#tick_3" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")'>" + response[i][0] + " </a>");
                $("#tick_3" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                $("#tick_3" + response[i][9]).append("<div id='" + response[i][9] + "' class='d-none p-2'>");
                $("#" + response[i][9]).append("<div id ='zat" + response[i][9] + "'class='zatemnenie'>");
                $("#zat" + response[i][9]).append("<div id='okn"+ response[i][9] + "' class='mt-5 okno'>");
                $("#okn" + response[i][9]).append("<p>" + response[i][0] + "</p>");
                $("#okn" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#okn" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#okn" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#okn" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#okn" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
//                    $("#okn" + response[i][9]).append("<div id=" + response[i][9] + " class='d-none p-2'>");
                $("#okn" + response[i][9]).append("<img src='" + response[i][6] + "' width='200' height='200' ><br>");
                $("#okn" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")' id='close'>Закрыть </a>");

            }

        });
    });
    $("#rock").click(function()
    {
        $("#all-tickets, #rap, #rock").removeClass("active");
        $("#rock").addClass("active");
        $.get('/rock/', function(response)
        {
            $("#tickets").empty();
            for (i in response){
                $("#tickets").append("<div class=''  style='width: 30%' id = 'tick" + response[i][9] +"' >");
                $("#tick" + response[i][9]).append("<div class='tickets' id = 'tick_2" + response[i][9] +"' style='box-shadow: 0px 5px 10px dimgray;'>");
                $("#tick_2" + response[i][9]).append("<img src='" + response[i][6] + "'" + " width='200' height='200' class='card-img-top'>");
                $("#tick_2" + response[i][9]).append("<div class='p-2' id = 'tick_3" + response[i][9] +"' style='background-color: #e0e0e0;'>");
                $("#tick_3" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")'>" + response[i][0] + " </a>");
                $("#tick_3" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                $("#tick_3" + response[i][9]).append("<div id='" + response[i][9] + "' class='d-none p-2'>");
                $("#" + response[i][9]).append("<div id ='zat" + response[i][9] + "'class='zatemnenie'>");
                $("#zat" + response[i][9]).append("<div id='okn"+ response[i][9] + "' class='mt-5 okno'>");
                $("#okn" + response[i][9]).append("<p>" + response[i][0] + "</p>");
                $("#okn" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#okn" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#okn" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#okn" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#okn" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                //                    $("#okn" + response[i][9]).append("<div id=" + response[i][9] + " class='d-none p-2'>");
                $("#okn" + response[i][9]).append("<img src='" + response[i][6] + "' width='200' height='200' ><br>");
                $("#okn" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")' id='close'>Закрыть </a>");

            }

        });
    });

    $("#rap").click(function()
    {
        $("#all-tickets, #rock, #classic").removeClass("active");
        $("#rap").addClass("active");
        $.get('/rap/', function(response)
        {
            $("#tickets").empty();
            for (i in response){
                $("#tickets").append("<div class=''  style='width: 30%' id = 'tick" + response[i][9] +"' >");
                $("#tick" + response[i][9]).append("<div class='tickets' id = 'tick_2" + response[i][9] +"' style='box-shadow: 0px 5px 10px dimgray;'>");
                $("#tick_2" + response[i][9]).append("<img src='" + response[i][6] + "'" + " width='200' height='200' class='card-img-top'>");
                $("#tick_2" + response[i][9]).append("<div class='p-2' id = 'tick_3" + response[i][9] +"' style='background-color: #e0e0e0;'>");
                $("#tick_3" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")'>" + response[i][0] + " </a>");
                $("#tick_3" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                $("#tick_3" + response[i][9]).append("<div id='" + response[i][9] + "' class='d-none p-2'>");
                $("#" + response[i][9]).append("<div id ='zat" + response[i][9] + "'class='zatemnenie'>");
                $("#zat" + response[i][9]).append("<div id='okn"+ response[i][9] + "' class='mt-5 okno'>");
                $("#okn" + response[i][9]).append("<p>" + response[i][0] + "</p>");
                $("#okn" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#okn" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#okn" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#okn" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#okn" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                //                    $("#okn" + response[i][9]).append("<div id=" + response[i][9] + " class='d-none p-2'>");
                $("#okn" + response[i][9]).append("<img src='" + response[i][6] + "' width='200' height='200' ><br>");
                $("#okn" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")' id='close'>Закрыть </a>");

            }
        });
    });
    $("#classic").click(function()
    {
        $("#all-tickets, #rap, #rock").removeClass("active");
        $("#classic").addClass("active");
        $.get('/classic/', function(response)
        {
            $("#tickets").empty();
            for (i in response){
                $("#tickets").append("<div class=''  style='width: 30%' id = 'tick" + response[i][9] +"' >");
                $("#tick" + response[i][9]).append("<div class='tickets' id = 'tick_2" + response[i][9] +"' style='box-shadow: 0px 5px 10px dimgray;'>");
                $("#tick_2" + response[i][9]).append("<img src='" + response[i][6] + "'" + " width='200' height='200' class='card-img-top'>");
                $("#tick_2" + response[i][9]).append("<div class='p-2' id = 'tick_3" + response[i][9] +"' style='background-color: #e0e0e0;'>");
                $("#tick_3" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")'>" + response[i][0] + " </a>");
                $("#tick_3" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#tick_3" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                $("#tick_3" + response[i][9]).append("<div id='" + response[i][9] + "' class='d-none p-2'>");
                $("#" + response[i][9]).append("<div id ='zat" + response[i][9] + "'class='zatemnenie'>");
                $("#zat" + response[i][9]).append("<div id='okn"+ response[i][9] + "' class='mt-5 okno'>");
                $("#okn" + response[i][9]).append("<p>" + response[i][0] + "</p>");
                $("#okn" + response[i][9]).append("<p>Участники: " + response[i][0] + " </p>");
                $("#okn" + response[i][9]).append("<p>Жанр: " + response[i][2] + " </p>");
                $("#okn" + response[i][9]).append("<p>Дата: " + response[i][4] + " </p>");
                $("#okn" + response[i][9]).append("<p>Адресс: " + response[i][3] + " </p>");
                $("#okn" + response[i][9]).append("<p>Цена: " + response[i][1] + " </p>");
                //                    $("#okn" + response[i][9]).append("<div id=" + response[i][9] + " class='d-none p-2'>");
                $("#okn" + response[i][9]).append("<img src='" + response[i][6] + "' width='200' height='200' ><br>");
                $("#okn" + response[i][9]).append("<a href='#' onclick='openclose(" + response[i][9] + ")' id='close'>Закрыть </a>");

            }

        });
    });

});