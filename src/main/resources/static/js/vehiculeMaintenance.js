$('document').ready(function(){
$('table #editButtonvehicule').on('click',function(event){
    event.preventDefault();
    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#editvehicleid').val(c1.vehicleid);
        $('#editstartDate').val(c1.startDate);
        $('#editremarks').val(c1.remarks);
        $('#editendDate').val(c1.endDate);
        $('#editsupplierid').val(c1.supplierid);
        $('#editprice').val(c1.price);

    });
    $('#editModal').modal();
});
    $('table #deleteButtonvehicule').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonvehicule').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#id').val(c1.id);
            $('#detailsvehicleid').val(c1.vehicleid);
            $('#detailsstartDate').val(c1.startDate);
            $('#detailsremarks').val(c1.remarks);
            $('#detailsendDate').val(c1.endDate);
            $('#detailssupplierid').val(c1.supplierid);
            $('#detailsprice').val(c1.price);

        });
        $('#detailsModal').modal();
    });
})
