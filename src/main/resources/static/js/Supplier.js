$('document').ready(function(){
$('table #editButtonsupplier').on('click',function(event){
    event.preventDefault();
    //////////cOUNTRY FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#updatename').val(c1.name);
        $('#updatephone').val(c1.phone);
        $('#updateemail').val(c1.email);
        $('#updatecity').val(c1.city);
        $('#updatecountry').val(c1.countryid);
        $('#updatestate').val(c1.stateid);
        $('#updateaddress').val(c1.address);
        $('#updatemobile').val(c1.mobile);
        $('#updatedetails').val(c1.details);
        $('#updatewebsite').val(c1.website);
    });
    $('#editModal').modal();
});
    $('table #deleteButtonsupplier').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonsupplier').on('click',function(event){
        event.preventDefault();
        ////////////////////COUNTRY FindById//////////////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#id').val(c1.id);
            $('#detailsname').val(c1.name);
            $('#detailsphone').val(c1.phone);
            $('#detailsemail').val(c1.email);
            $('#detailscity').val(c1.city);
            $('#detailscountry').val(c1.countryid);
            $('#detailsstate').val(c1.stateid);
            $('#detailsaddress').val(c1.address);
            $('#detailsmobile').val(c1.mobile);
            $('#detailsdetails').val(c1.details);
            $('#detailswebsite').val(c1.website);
        });
        $('#detailsModal').modal();
    });

})
