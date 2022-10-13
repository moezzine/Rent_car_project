$('document').ready(function(){
$('table #editButtonLocation').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////

    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#editid').val(c1.id);
        $('#editdescription').val(c1.description);
        $('#editcity').val(c1.city);
        $('#editstate').val(c1.stateid);
        $('#editcountry').val(c1.countryid);
        $('#editaddress').val(c1.address);
        $('#editdetails').val(c1.details);




    });
    $('#editModal').modal();
});
    $('table #deleteButtonLocation').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonLocation').on('click',function(event){
        event.preventDefault();

        //////////cOUNTRY FindById////////

        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsdescription').val(c1.description);
            $('#detailscity').val(c1.city);
            $('#detailsstate').val(c1.stateid);
            $('#detailscountry').val(c1.countryid);
            $('#detailsaddress').val(c1.address);
            $('#detailsdetails').val(c1.details);
            $('#detailsupdatedon').val(c1.updatedon);
            $('#detailsupdatedby').val(c1.updatedby);
        });
        $('#detailsModal').modal();
    });

})
