<%@ include file="/init.jsp"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">
    <style>
        /* Your custom CSS styles */
        body {
            background-color: #f8f9fa;
        }

        .container {
            margin-top: 50px;
        }
    </style>
    <title>Your Page Title</title>
</head>

<body>
    <portlet:actionURL name="addEmployee" var="addEmployeeActionURL" />

    <div class="container">
        <h1>${employeeId}</h1>
        <h3>${employee.address}</h3>
        <div class="row justify-content-center">
            <div class="col-md-6">

                <h2 class="mb-4">Employee Information Form</h2>
                <form action="<%=addEmployeeActionURL%>" method="post">

                    <!-- Employee ID -->
                    <input type="hidden" name="<portlet:namespace/>employeeId" value="${employeeId}" />

                    <!-- First Name -->
                    <div class="mb-3">
                        <label for="firstName" class="form-label">First Name</label>
                        <input type="text" class="form-control" id="firstName" name="<portlet:namespace/>firstName" required value="${employee.firstName}" placeholder="Enter your first name">
                    </div>

                    <!-- Last Name -->
                    <div class="mb-3">
                        <label for="lastName" class="form-label">Last Name</label>
                        <input type="text" class="form-control" id="lastName" name="<portlet:namespace/>lastName" required value="${employee.lastName}" placeholder="Enter your last name">
                    </div>

                    <!-- Email -->
                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" id="email" name="<portlet:namespace/>email" required value="${employee.email}" placeholder="Enter your email">
                    </div>

                    <!-- Password -->
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" id="password" name="<portlet:namespace/>password" required value="${employee.password}" placeholder="Enter your password">
                    </div>

                    <!-- Phone Number -->
                    <div class="mb-3">
                        <label for="phoneNumber" class="form-label">Phone Number</label>
                        <input type="tel" class="form-control" id="phoneNumber" name="<portlet:namespace/>phoneNumber" required value="${employee.phoneNumber}" placeholder="Enter your phone number">
                    </div>

                    <!-- Address -->
                    <div class="mb-3">
                        <label for="address" class="form-label">Address</label>
                        <input class="form-control" id="address" name="<portlet:namespace/>address" required value="${employee.address}" placeholder="Enter your address">
                    </div>

                    <!-- Submit and Reset Buttons -->
                    <div class="mb-3">
                        <button type="submit" class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-secondary">Reset</button>
                    </div>

                </form>

            </div>
        </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
</body>
	
</html>
