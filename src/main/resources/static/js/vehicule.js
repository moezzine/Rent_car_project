$('document').ready(function(){
$('table #editButtonvehicule').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////


    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#editname').val(c1.name);
        $('#editehicletypeid').val(c1.vehicletypeid);
        $('#editvehicleNumber').val(c1.vehicleNumber);
        var regDate=c1.registrationDate.substr(0,10);
        $('#editregistrationDate').val(regDate);
        var acDate=c1.acquisitionDate.substr(0,10);
        $('#editacquisitionDate').val(acDate);
        $('#editdescription').val(c1.description);
        $('#editvehiclemakeid').val(c1.vehiclemakeid);
        $('#editvehiclestatusid').val(c1.vehiclestatusid);
        $('#editpower').val(c1.power);
        $('#editfuelCapacity').val(c1.fuelCapacity);
        $('#editnetWeight').val(c1.netWeight);
        $('#editemployeeid').val(c1.employeeid);
        $('#editvehiclemodelid').val(c1.vehiclemodelid);
        $('#editlocationid').val(c1.locationid);
      $('#editremarks').val(c1.remarks);
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
            $('#detailsname').val(c1.name);
            $('#detailsehicletypeid').val(c1.vehicletypeid);
            $('#detailsvehicleNumber').val(c1.vehicleNumber);
            var regDate=c1.registrationDate.substr(0,10);
            $('#detailsregistrationDate').val(regDate);
            var acDate=c1.acquisitionDate.substr(0,10);
            $('#detailsacquisitionDate').val(ac);
            $('#detailsdescription').val(c1.description);
            $('#detailsvehiclemakeid').val(c1.vehiclemakeid);
            $('#detailsvehiclestatusid').val(c1.vehiclestatusid);
            $('#detailspower').val(c1.power);
            $('#detailsfuelCapacity').val(c1.fuelCapacity);
            $('#detailsnetWeight').val(c1.netWeight);
            $('#detailsemployeeid').val(c1.employeeid);
            $('#detailsvehiclemodelid').val(c1.vehiclemodelid);
            $('#detailslocationid').val(c1.locationid);
            $('#detailsremarks').val(c1.remarks);
        });
        $('#detailsModal').modal();
    });

})
