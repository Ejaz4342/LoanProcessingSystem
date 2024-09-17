$(document).ready(function() {
    // Toggle fields based on checkbox
    $("#existingCustomer").on('change', function() {
        if ($(this).is(':checked')) {
            $("#existingCustomerFields").show();
            $("#newCustomerFields").hide();
        } else {
            $("#existingCustomerFields").hide();
            $("#newCustomerFields").show();
        }
    });

    // Fetch customer data on Go button click
    $("#goButton").on('click', function() {
        var customerId = $("#customerId").val();
        $.ajax({
            url: '/api/customers/' + customerId, // Ensure this URL matches your API endpoint
            type: 'GET',
            success: function(response) {
                // Populate form fields with customer data
                $("#customerName").val(response.name);
                $("#customerPan").val(response.pan);
                $("#customerAadhar").val(response.aadhar);
                $("#customerAddress").val(response.addressLine);
                $("#customerCity").val(response.city);
                $("#customerDistrict").val(response.district);
                $("#customerState").val(response.szstate);
                $("#customerIncome").val(response.netMonthlyIncome);
                $("#customerObligation").val(response.obligation);

                // Show the customer data section
                $("#customerData").show();
            },
            error: function() {
                alert("Customer not found!");
            }
        });
    });

    // Submit loan application
    $("#submitButton").on('click', function() {
        var data = {
            loanAmount: $("#loanAmount").val(),
            loanTerm: $("#loanTerm").val(),
            interestRate: $("#interestRate").val(),
        };

        if ($("#existingCustomer").is(':checked')) {
            data.customerId = $("#customerId").val();
        } else {
            data.customer = {
                name: $("#name").val(),
                pan: $("#pan").val(),
                aadhar: $("#aadhar").val(),
                addressLine: $("#addressLine").val(),
                city: $("#city").val(),
                district: $("#district").val(),
                state: $("#state").val(),
                netMonthlyIncome: $("#income").val(),
                obligation: $("#obligation").val()
            };
        }

        $.ajax({
            url: '/api/applications/submit',
            type: 'POST',
            contentType: 'application/json',
            data: JSON.stringify(data),
            success: function(response) {
                alert("Loan Application Submitted Successfully!");
                // Optionally, reset the form fields here
                // window.location.reload(); // Refresh the page to clear the form
            },
            error: function(xhr) {
                alert("Error: " + xhr.responseText);
            }
        });
    });
});
