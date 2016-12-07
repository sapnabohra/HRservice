$(document).ready(function () {


	
	// Produce a list of books
    var produceEmployeeList = function (employees) {
        alert('insideinside');
        var content = '<ul>';
        for (var i = 0; i < employees.length; i++) {
            content += '<li class="EmployeeInfo" id="' + employees[i].gid + '">' + employees[i].lastname + ', Price ' + employees[i].firstname + '</li>';
        }
        content += '</ul>';

        $('#content').html(content);
    }
    
	var getSearchResults = function () {

        // Get the search term.
        var employeeID = $('#term').val();

        // If the title was empty, give an error message.
        if (employeeID == '') {
            $('#content').html('No ID to enter a search term.');

            // Otherwise do API call
        } else {
            $('#content').html("Fetching search results...");
            alert(employeeID);

            $.getJSON('http://localhost:8081/employeeservice/employee' + employeeID, function (employees) {
                alert('inside');
                produceEmployeeList(employees);
            });

        }
    }
	$('#search').click(getSearchResults);	
	
});