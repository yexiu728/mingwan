// 发布按钮功能
var submit = document.querySelector(".box .submit");
var inputObj = document.querySelector(".input textarea");
var messageObj = document.querySelector(".message");

// 发布功能封装函数
var sub = function() {
    // 获得数据并验证是否为空
    var message = inputObj.value.trim();
    if(!message) {
        inputObj.value = "";
        alert("内容不能为空");
        return;
    }

    // 创建节点
    var info = document.createElement("li");
    var p = document.createElement("p");
    var div = document.createElement("div");

    // 设置节点
    p.innerText = message;
    div.innerText = "删除";

    info.setAttribute("class", "info");
    info.appendChild(p);
    info.appendChild(div);

    // 添加节点到数据列表，并清空输入内容，实现发布功能
    var firstMessage = document.querySelector(".message .info");
    messageObj.insertBefore(info, firstMessage);
    inputObj.value = "";
};

submit.addEventListener("click", sub, false);
inputObj.addEventListener("keyup", function (e) {
    if(e.code === "Enter") {
        sub();
    }
}, false);

messageObj.onclick = function (e) {
   if(e.target.nodeName === "DIV") {
       messageObj.removeChild(e.target.parentNode);
   }
};

