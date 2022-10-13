$('document').ready(function(){
$('table #editButtoninvoiceStatus').on('click',function(event){
    event.preventDefault();
    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#editid').val(c1.id);
        $('#editdescription').val(c1.description);
        $('#editdetails').val(c1.details);

    });
    $('#editModal').modal();
});
    $('table #deleteButtoninvoiceStatus').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtoninvoiceStatus').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsdescription').val(c1.description);
            $('#detailsdetails').val(c1.details);
        });
        $('#detailsModal').modal();
    });
})
