$('document').ready(function(){
$('table #editButton').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////


    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#idEdit').val(c1.id);
        $('#descriptionEdit').val(c1.description);
        $('#capitalEdit').val(c1.capital);
        $('#codeEdit').val(c1.code);
        $('#nationalityEdit').val(c1.nationality);
        $('#continentEdit').val(c1.continent);

    });

    $('#editModal').modal();
});
    $('table #deleteButton').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
})
