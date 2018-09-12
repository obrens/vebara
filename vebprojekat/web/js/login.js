$(function (e) {
    $("#regButton").click(function() {
        var kime = $("#regKime").val();
        var lozinka = $("#regLozinka").val();
        var imejl = $("#regImejl").val();

        $.post({
            url: 'rest/korisnik/',
            data: JSON.stringify({kime: kime, lozinka: lozinka, imejl: imejl}),
            contentType: 'application/json',
            dataType: 'json',
            success: function (data) {
                alert(data.imejl);
                $("p").append("<br/>" + data.lozinka);
            },
            error: function(xhr, status, error) {
                var err = eval("(" + xhr.responseText + ")");
                alert('yado login> ' + err.Message);
            }
        });
    });
});