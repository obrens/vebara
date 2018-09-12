$(function (e) {
    $.get({
        url: 'rest/korisnik/meni/',
        dataType: 'json',
        success: function (data) {
            if(data.ulogovan) {
                // language=HTML
                $("#meni").html("<input type='button' id='mojaStranica' value='" + data.kime + "'/>");
                $("#mojaStranica").click(function(){window.location.replace("localhost:8080/vebprojekat/mojaStranica.html");});
            }else{
                $("#meni").html("njente ulogovan, uloguj sie");
            }
        },
        error: function () {
            alert('yado meni');
        }
    });
});