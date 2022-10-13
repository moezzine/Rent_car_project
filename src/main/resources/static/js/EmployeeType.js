$('document').ready(function(){
$('table #editButtonemployeeTypes').on('click',function(event){
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
    $('table #deleteButtonemployeeTypes').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonemployeeTypes').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsdescription').val(c1.description);
            $('#detailsdetails').val(c1.details);
            $('#createdBy').val(c1.createdBy);
            $('#createdDate').val(c1.createdDate.substr(0,19).replace("T",""));
            $('#lastModifiedDate').val(c1.lastModifiedDate.substr(0,19).replace("T",""));
            $('#lastModifiedBy').val(c1.lastModifiedBy);
        });
        $('#detailsModal').modal();
    });
})
