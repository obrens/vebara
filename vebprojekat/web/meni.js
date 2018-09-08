$(function (e) {
    $.get({
        url: 'rest/korisnik/ulogovanLiSam/',
        dataType: 'json',
        success: function (data) {
            if(data) {
                $("#meni").html("<input type='button' id='mojaStranica'>");
            }else{

            }
        },
        error: function () {
            alert('yado');
        }
    });
});