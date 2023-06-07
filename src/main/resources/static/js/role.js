$('document').ready(function(){
$('table #editButtonrole').on('click',function(event){
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
    $('table #deleteButtonrole').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonrole').on('click',function(event){
        event.preventDefault();
        //////////cOUNTRY FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsdescription').val(c1.description);
            $('#detailsdetails').val(c1.details);
            $('#createdBy').val(c1.createdBy);
            $('#createdDate').val(c1.createdDate);
            $('#lastModifiedDate').val(c1.lastModifiedDate);
            $('#lastModifiedBy').val(c1.lastModifiedBy);
        });
        $('#detailsModal').modal();
    });
})
