$(window).load(function() {
	getMbtiList();
});

function checkSession() {
	$.ajax({
		type: 'GET',
		url: "UserController.php?method=session",
		dataType: "text",
		success: function(bSession) {
			if (bSession == true) {
				location.href = './index.php';
			}
		}
	});
}
function register() {
	let registerForm = {
		id: $("#id").val(),
		password: $("#password").val(),
		password2: $("#password2").val(),
		mbtiOption: $("#mbtiOptionSelect option:selected").val()
	};
	$.ajax({
		url: "api/register",
		type: "POST",
		dataType: "json",
		data: JSON.stringify(registerForm),
		contentType: "application/json",
		async: true,
		success: function(result) {
			if(result['code']=='400') {
				alert(result['message']);
				location.href='/register';
			}
			else {
				alert(result['message']);
				location.href='/login';
			}
		},
		error: function(request, status, error) {

		}
	})
}
function getMbtiList() {
	$.getJSON('/api/mbtiOptions', function(mbtiOptionList) {
		let option = "";
		$.each(mbtiOptionList, function(index, item) {
			option += '<option id="' + item["seq"] + '"';
			option += ' name="' + item["seq"] + '"';
			option += ' value = "' + item["seq"] + '">';
			option += item["name"] + '</option>';
		});
		$("#mbtiOptionSelect").html(option);
	})
}