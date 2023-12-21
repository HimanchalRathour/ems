<%@ include file="/init.jsp" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
<style>
div.polaroid {
	width: 70%;
	box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0
		rgba(0, 0, 0, 0.19);
}

div.container {
	padding: 10px;
}  

}

.button{
  margin-left: 20%;
  margin-right: 50%;
}
</style>
<title>Registration Form</title>
</head>

<body>

      <portlet:actionURL name="addUser" var="addUserActionURL"/>
	<div class="container mt-5 polaroid">
		<h2>Registration Form</h2>
		 <form action="${addUserActionURL}" method="post">
		 
		                    <!-- Employee ID -->
                    <input type="hidden" name="<portlet:namespace/>usersId" value="${userId}" />
		
		 
			<div class="mb-2">
				<label for="firstName" class="form-label">First Name:</label> <input
					type="text" class="form-control" id="firstName"  name="<portlet:namespace/>firstName" required value="${user.firstName}"
					placeholder="Enter_here">
			</div>
			<div class="mb-2">
				<label for="lastName" class="form-label">Last Name:</label> <input
					type="text" class="form-control" id="lastName" name="lastName"
					placeholder="Last Name">
			</div>
			<div class="mb-2">
				<label for="dob" class="form-label">Date of Birth:</label> <input
					type="date" class="form-control" id="dob" name="dob">
			</div>
			<div class="mb-2">
				<label for="contactNumber" class="form-label">Contact
					Number:</label> <input type="tel" class="form-control" id="contactNumber"
					name="contactNumber" placeholder="Contact Number">
			</div>
			<div class="mb-2">
				<label for="email" class="form-label">Email:</label> <input
					type="email" class="form-control" id="email" name="email"
					placeholder="Email">
			</div>

			<h4 class="mt-3">Address Information</h4>
			<div class="mb-2">
				<label for="streetAddress" class="form-label">Street
					Address:</label> <input type="text" class="form-control" id="streetAddress"
					name="streetAddress" placeholder="Street Address">
			</div>
			<div class="mb-2">
				<label for="city" class="form-label">City:</label> <input
					type="text" class="form-control" id="city" name="city"
					placeholder="City">
			</div>
			<div class="mb-2">
				<label for="state" class="form-label">State/Province:</label> <input
					type="text" class="form-control" id="state" name="state"
					placeholder="State/Province">
			</div>
			<div class="mb-2">
				<label for="zipCode" class="form-label">Zip Code:</label> <input
					type="text" class="form-control" id="zipCode" name="zipCode"
					placeholder="Zip Code">
			</div>
			<div class="mb-2">
				<label for="country" class="form-label">Country:</label> <input
					type="text" class="form-control" id="country" name="country"
					placeholder="Country">
			</div>

             <div class="button">

			<button type="submit" id="reset" class="btn btn-info">Reset</button>
			<button type="submit" id="submit" class="btn btn-primary">Submit</button>
			</div>
		</form>
	</div>

	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>

</html>






