$('document').ready(function(){
$('table #editButtoninvoice').on('click',function(event){
    event.preventDefault();
    //////////FindById////////
    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#editid').val(c1.id);
        $('#editclient').val(c1.clientid);
        $('#editinvoicestatus').val(c1.invoicestatusid);
        $('#editremarks').val(c1.remarks);
      var invoiceDate=invoice.invoiceDate.substr(0,10);
        $('#editinvoiceDate').val(invoiceDate);

    });
    $('#editModal').modal();
});
    $('table #deleteButtoninvoice').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtoninvoice').on('click',function(event){
        event.preventDefault();
        //////////FindById////////
        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#detailsid').val(c1.id);
            $('#detailsclient').val(c1.clientid);
            $('#detailsinvoicestatus').val(c1.invoicestatusid);
            $('#detailsremarks').val(c1.remarks);
            var invoiceDate=invoice.invoiceDate.substr(0,10);
            $('#detailsinvoiceDate').val(invoiceDate);

        });
        $('#detailsModal').modal();
    });
})
