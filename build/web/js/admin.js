function sidebarDrop(sidebarRow) {
    sidebarRow.classList.toggle("active");
    var content = sidebarRow.nextElementSibling;
    if (content.style.display == "" || content.style.display == "none") {
        content.style.display = "block";
    } else {
        content.style.display = "none";
    }
}

/* delete element*/
function delete_confirm(e) {
    var r = confirm("bạn có chắc chắn muốn xóa?");
    if (r == false) {
        e.preventDefault();
    } else {
        
    }
}

/*disappear message*/
function disappear(ele) {
    ele.style.display = "none";
}

/*check text*/
function checkText(e) {
    var text = document.getElementsByClassName("rows-content-text");
    var select = document.getElementsByClassName("rows-content-select");
    for (var i = 0; i < text.length; i++) {
        if (text[i].value == "") {
            alert("Bạn hãy điền đầy đủ thông tin !!!");
            e.preventDefault();
            return;
        }
    }
    for (var i = 0; i < text.length; i++) {
        if (select[i].options[select[i].selectedIndex].value == "") {
            alert("Bạn hãy điền đầy đủ thông tin !!!");
            e.preventDefault();
            return;
        }
    }
}
/*check email*/
function checkEmail(email) {
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (email.value != "") {
        if (!filter.test(email.value)) {
            email.nextElementSibling.innerHTML = " * Hãy nhập địa chỉ email hợp lệ. VD: Example@gmail.com";
            email.value = "";
        } else {
            email.nextElementSibling.innerHTML = "";
        }
    }
}
/*check pass length*/
function checkPassLength(pass) {
    if (pass.value != "") {
        if (pass.value.length < 8) {
            pass.nextElementSibling.innerHTML = " * Mật khẩu tối thiểu 8 ký tự";
            pass.value = "";
        } else {
            pass.nextElementSibling.innerHTML = "";
        }
    }
}

/*check pass match*/
function checkPassMatch(repass) {
    var pass = document.getElementById("pass");
    if (repass.value != "") {
        if (pass.value === repass.value) {
            repass.nextElementSibling.innerHTML = "";
        } else {
            repass.nextElementSibling.innerHTML = " * Mật khẩu không khớp";
            repass.value = "";
        }
    }
}
/*display Password edit*/
function displayEditPassword(button) {
    var oldPass = document.getElementById("oldPass");
    var newPass = document.getElementById("pass");
    var rePass = document.getElementById("rePass");
    var newPassRow = button.nextElementSibling;
    var rePassRow = newPassRow.nextElementSibling;
    if (button.innerHTML == "Change password") {
        oldPass.disabled = false;
        newPass.disabled = false;
        rePass.disabled = false;
        button.style.top = 330 + 'px';
        oldPass.value = "";
        newPassRow.style.display = "block";
        rePassRow.style.display = "block";
        button.innerHTML = "Unchange password";
        newPass.classList.add("rows-content-text");
        rePass.classList.add("rows-content-text");
    } else {
        oldPass.disabled = true;
        newPass.disabled = true;
        rePass.disabled = true;
        button.style.top = 360 + 'px';
        oldPass.value = "password";
        newPassRow.style.display = "none";
        rePassRow.style.display = "none";
        button.innerHTML = "Change password";
        oldPass.nextElementSibling.innerHTML = "";
        newPass.nextElementSibling.innerHTML = "";
        rePass.nextElementSibling.innerHTML = "";
        newPass.classList.remove("rows-content-text");
        rePass.classList.remove("rows-content-text");
    }
}

/*Enable Group*/
function enableGroupId(select) {
    var groupId = document.getElementById("product_group_id");
    if (select.options[select.selectedIndex].value == "2") {
        groupId.disabled = false;
    } else {
        groupId.disabled = true;
    }
}
