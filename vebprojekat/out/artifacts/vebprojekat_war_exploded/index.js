$(function (e) {
    $.get({
        url: 'rest/moja/test/',
        dataType: 'json',
        success: function (data) {
            alert(data.imejl);
            $("p").append("<br/>" + data.lozinka);
        },
        error: function () {
            alert('yado');
        }
    });
});