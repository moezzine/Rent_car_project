$('document').ready(function(){
$('table #editButtonemployee').on('click',function(event){
    event.preventDefault();

    //////////cOUNTRY FindById////////


    var href=$(this).attr('href');
    $.get(href,function(c1,status){
      $('#id').val(c1.id);
        $('#editfirstname').val(c1.firstname);
        $('#editlastname').val(c1.lastname);
        $('#editothername').val(c1.othername);
        $('#editgender').val(c1.gender);
        $('#edittitle').val(c1.title);
        var hdate=c1.hireDate.substr(0,10);
        $('#edithireDate').val(hdate);
        $('#editphone').val(c1.phone);
        $('#editemail').val(c1.email);
        $('#editcity').val(c1.city);
        $('#editcountryid').val(c1.countryid);
        $('#editjobtitleid').val(c1.jobtitleid);
        $('#editemployeetypeid').val(c1.employeetypeid);
        var bdate=c1.hireDate.substr(0,10);
        $('#editdateOfBirth').val(bdate);
        $('#editstateid').val(c1.stateid);
        $('#editsocialSecurityNumber').val(c1.socialSecurityNumber);
        $('#editaddress').val(c1.address);
        $('#editmaritalStatus').val(c1.maritalStatus);
        $('#editinitials').val(c1.initials);
        $('#editmobile').val(c1.mobile);
        $('#txtUsernameEdit').val(employee.username);

    });
    $('#editModal').modal();
});
    $('table #deleteButtonemployee').on('click',function(event){
        event.preventDefault();
        var href=$(this).attr('href');
        $('#ConfirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
    $('table #detailsButtonemployee').on('click',function(event){
        event.preventDefault();

        //////////cOUNTRY FindById////////


        var href=$(this).attr('href');
        $.get(href,function(c1,status){
            $('#id').val(c1.id);
            $('#detailsfirstname').val(c1.firstname);
            $('#detailslastname').val(c1.lastname);
            $('#detailsothername').val(c1.othername);
            $('#detailsgender').val(c1.gender);
            $('#detailstitle').val(c1.title);
            var hdate=c1.hireDate.substr(0,10);
            $('#detailshireDate').val(hdate);
            $('#detailsphone').val(c1.phone);
            $('#detailsemail').val(c1.email);
            $('#detailscity').val(c1.city);
            $('#detailscountryid').val(c1.countryid);
            $('#detailsjobtitleid').val(c1.jobtitleid);
            $('#detailsemployeetypeid').val(c1.employeetypeid);
            var bdate=c1.hireDate.substr(0,10);
            $('#detailsdateOfBirth').val(bdate);
            $('#detailsstateid').val(c1.stateid);
            $('#detailssocialSecurityNumber').val(c1.socialSecurityNumber);
            $('#detailsaddress').val(c1.address);
            $('#detailsmaritalStatus').val(c1.maritalStatus);
            $('#detailsinitials').val(c1.initials);
            $('#detailsmobile').val(c1.mobile);

        });
        $('#detailsModal').modal();
    });
    $('.table #photoButton').on('click',function(event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#photoModal #employeePhoto').attr('src', href);
        $('#photoModal').modal();
    });

})
