
// 事件源
var lis = document.querySelectorAll(".box .top li");
// 事件对象
var mains = document.querySelectorAll(".box .main");

lis.forEach(function (value, key) {
    // 存储索引值
    value.setAttribute("index", key);

    // 注册点击事件
    value.onclick = function () {

        lis.forEach(function (value1) {
            value1.className = "";
        });
        value.className = "current";

        mains.forEach(function (value1) {
            value1.className = "main dn"
        });
        mains[value.value].className = "main";
    };
});

