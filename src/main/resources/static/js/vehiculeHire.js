$('document').ready(function(){
$('table #editButtonvehiculeHire').on('click',function(event){
    event.preventDefault();
    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#editvehicleid').val(c1.vehicleid);
        $('#editdateOut').val(c1.dateOut);
        $('#editdateIn').val(c1.dateIn);
        $('#edittimeOut').val(c1.timeOut);
        $('#edittimeIn').val(c1.timeIn);
        $('#editlocationid').val(c1.locationid);
        $('#editclientid').val(c1.clientid);
        $('#editremarks').val(c1.remarks);
        $('#editprice').val(c1.price);

    });
    $('#editModal').modal();
});
    $('table #deleteButtonvehiculeHire').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonvehiculeHire').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){

            $('#id').val(c1.id);
            $('#detailsvehicleid').val(c1.vehicleid);
            $('#detailsdateOut').val(c1.dateOut);
            $('#detailsdateIn').val(c1.dateIn);
            $('#detailstimeOut').val(c1.timeOut);
            $('#detailstimeIn').val(c1.timeIn);
            $('#detailslocationid').val(c1.locationid);
            $('#detailsclientid').val(c1.clientid);
            $('#detailsremarks').val(c1.remarks);
            $('#detailsprice').val(c1.price);
        });
        $('#detailsModal').modal();
    });
})
