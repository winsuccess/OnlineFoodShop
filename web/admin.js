/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/*disappear message*/
function disappear(ele) {
    ele.style.display = "none";
}
function delete_confirm(e) {
    var r = confirm("bạn có chắc chắn muốn xóa?");
    if (r == false) {
        e.preventDefault();
    } else {
        
    }
}