//***** Global variables *****//


//***** Called automatically on page load *****//
$(document).ready(function(){
});


//***** Custom functions *****//
function testGetEndpoint() {
    $.ajax({
        url: "/v1/testGet", //set in Controller.java, lines 10 and 19
        type: 'GET',
        dataType: 'json',
        success: function(response) {
            handleTestResponse(response);
        }
        //you can also have error handlers here
    });
}

function testPostEndpoint() {
    let body = {message: "POST Request"};

    $.ajax({
        url:"/v1/testPost",
        type:"POST",
        data:JSON.stringify(body),
        contentType:"application/json; charset=utf-8",
        dataType:"json",
        success: function (response) {
            handleTestResponse(response);
        }
        //you can also have error handlers here
    });
}

function handleTestResponse(response) {
    //Notice we're returning the same object in both endpoint methods so we'll be
    //dealing with the same object structure whether we hit the GET or POST endpoints

    let p = document.getElementById("output");

    //we access .value here because that's the field name in the TestResponse object
    p.innerText = p.innerText + response.value;
}

