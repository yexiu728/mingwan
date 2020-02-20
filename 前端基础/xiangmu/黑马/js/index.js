
// 左边的 li
var lis = document.querySelectorAll(".body-main .slice-left li");
// 右边要显示内容的 ul
var uls = document.querySelectorAll(".body-main .slice-right ul");
// 左边 li 的线
var line = document.querySelector(".body .slice-left .line");

// 注册点击事件
for (var i = 0; i < lis.length; i++) {
    // 点击事件处理函数
    lis[i].onclick = function (ev) {

        // 所有li 去掉 current 类属性
        for(var j = 0; j < lis.length; j++) {
            var className = lis[j].className;
            // 如果有current属性，则去除
            var currentIndex = className.indexOf("current");
            if(currentIndex >= 0) {
                lis[j].className = className.slice(0, 3).trim();
            }
            // console.log(lis[j].className);
        }

        // 获得当前被点击的 li
        // 提取类名，使对应的 ul 显示，其他ul隐藏，并设置 li 的 current 类属性

        var clickName = this.className;

        for(j = 0; j < uls.length; j++) {
            var ulName = uls[j].className;

            if(ulName.indexOf(clickName) >= 0) {
                // 设置 ul 为显示
                uls[j].style.display = "block";
            } else {
                // 隐藏 ul
                uls[j].style.display = "none";
            }
        }

        // 添加current属性
        this.className = clickName.concat(" current");

        // 设置竖线的位置 top
        var liTop = this.offsetTop;
        line.style.top = liTop + 2 + "px";
    };
}