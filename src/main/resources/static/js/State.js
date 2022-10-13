$('document').ready(function(){
$('table #editButtonState').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////


    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#editid').val(c1.id);
        $('#editname').val(c1.name);
        $('#editcapital').val(c1.capital);
        $('#editcode').val(c1.code);
        $('#editcountry').val(c1.countryid);
        $('#editdetails').val(c1.details);

    });
    $('#editModal').modal();
});
    $('table #deleteButtonState').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonState').on('click',function(event){
        event.preventDefault();

        //////////cOUNTRY FindById////////


        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsname').val(c1.name);
            $('#detailscapital').val(c1.capital);
            $('#detailscode').val(c1.code);
            $('#detailscountry').val(c1.countryid);
            $('#detailsdetails').val(c1.details);

        });
        $('#detailsModal').modal();
    });

})
