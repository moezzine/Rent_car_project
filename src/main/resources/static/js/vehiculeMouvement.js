$('document').ready(function(){
$('table #editButtonvehiculeMouvement').on('click',function(event){
    event.preventDefault();
    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#editvehicleid').val(c1.vehicleid);
        $('#editdate1').val(c1.date1);
        $('#editdate2').val(c1.date2);
        $('#editlocationid2').val(c1.locationid2);
        $('#editlocationid1').val(c1.locationid1);
        $('#editremarks').val(c1.remarks);

    });
    $('#editModal').modal();
});
    $('table #deleteButtonvehiculeMouvement').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonvehiculeMouvement').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){

            $('#id').val(c1.id);
            $('#detailsvehicleid').val(c1.vehicleid);
            $('#detailsdate1').val(c1.date1);
            $('#detailsdate2').val(c1.date2);
            $('#detailslocationid2').val(c1.locationid2);
            $('#detailslocationid1').val(c1.locationid1);
            $('#detailsremarks').val(c1.remarks);
        });
        $('#detailsModal').modal();
    });
})
