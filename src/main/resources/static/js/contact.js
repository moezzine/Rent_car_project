$('document').ready(function(){
$('table #editButtoncontact').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#ufirstname').val(c1.firstname);
        $('#ulastname').val(c1.lastname);
        $('#uphone').val(c1.phone);
        $('#uemail').val(c1.email);
        $('#umobile').val(c1.mobile);
        $('#uremarks').val(c1.remarks);
    });
    $('#editModal').modal();
});
    $('table #deleteButtoncontact').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtoncontact').on('click',function(event){
        event.preventDefault();

        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#id').val(c1.id);
            $('#dfirstname').val(c1.firstname);
            $('#dlastname').val(c1.lastname);
            $('#dphone').val(c1.phone);
            $('#demail').val(c1.email);
            $('#dmobile').val(c1.mobile);
            $('#dremarks').val(c1.remarks);
        });
        $('#detailsModal').modal();
    });
})
