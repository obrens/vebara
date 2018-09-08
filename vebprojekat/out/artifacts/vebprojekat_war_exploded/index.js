$(function (e) {
    $.get({
        url: 'rest/moja/test/',
        dataType: 'json',
        success: function (data) {
            alert(data.imejl);
        },
        error: function () {
            alert('yado');
        }
    });
});