<%@ include file="/init.jsp"%>
<portlet:defineObjects />
<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">


<script src="https://cdn.jsdelivr.net/npm/sweetalert2@10"></script>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css"
	rel="stylesheet" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>




<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>

<script
	src="https://cdn.datatables.net/1.13.7/js/jquery.dataTables.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.datatables.net/1.13.7/css/jquery.dataTables.min.css">


<script>
 $(document).ready( function() {
	 let table = new DataTable('#employeeTable');
 });
	 
 </script>
<title>Your Page Title</title>

<style>
body {
	background-color: #f8f9fa;
}

.container {
	margin-top: 50px;
}
</style>
</head>

<body>

	<portlet:renderURL var="addEmployee">
		<portlet:param name="mvcRenderCommandName" value="/add_Employee" />
	</portlet:renderURL>

	<div class="container">
		<a class="btn btn-primary"
			style="margin-bottom: 1%; margin-left: 88%;" href="<%=addEmployee%>">AddEmployee</a>
		<div class="row justify-content-center">
			<!-- ListAll view Start ------------------------ -->
			<div>
				<table class="table table-striped" id="employeeTable">
					<thead>
						<tr>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Email</th>
							<th>Password</th>
							<th>Phone Number</th>
							<th>Address</th>
							<th> <h4> Action</h4> </th>
							
						</tr>
					</thead>
					<tbody>
					
						 <c:forEach items="${employeeList}" var="employee">
							<portlet:actionURL name="updateEmployee"
								var="updateEmployeeActionURL">
								<portlet:param name="employeeId" value="${employee.employeeId}" />
							</portlet:actionURL>

							<portlet:actionURL name="deleteEmployee"
								var="deleteEmployeeActionURL">
								<portlet:param name="empId" value="${employee.employeeId}" />
							</portlet:actionURL>

							<tr>
								<td>${employee.firstName}</td>
								<td>${employee.lastName}</td>
								<td>${employee.email}</td>
								<td>${employee.password}</td>
								<td>${employee.phoneNumber}</td>
								<td>${employee.address}</td>
								<td><a class="btn btn-warning"
									href="<%=updateEmployeeActionURL%>">Update</a> <a
									class="btn btn-danger"
									onclick="deleteAlert('${deleteEmployeeActionURL}')">Delete</a>
								</td>
							</tr>
						</c:forEach> 
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<script>
        if (typeof jQuery == 'undefined') {
            console.error('jQuery is not loaded.');
        } else {
            console.log('jQuery is loaded!');
        }
       /*  $(document).ready(function() {
            $('#').DataTable();
        }); */

        function deleteAlert(deleteEmployeeActionURL) {
            swal({
                title: "Are you sure?",
                text: "Are you sure to delete this exam permanently?",
                type: "info",
                showCancelButton: true,
                confirmButtonColor: "#7FFFD4",
                confirmButtonText: "Sure",
                cancelButtonText: "Cancel",
                cancelButtonColor: '#cccccc',
                closeOnConfirm: false,
                closeOnCancel: false
            }, function(isConfirm) {
                if (isConfirm) {
                    $.get(deleteEmployeeActionURL, function(data, status) {
                        swal("OK!", "Deleted Successfully!", "success");
                        location.reload();
                    });
                } else {
                    swal("Cancel", "Your item is safe.", "success");
                }
            });
        }
    </script>

</body>

</html>
