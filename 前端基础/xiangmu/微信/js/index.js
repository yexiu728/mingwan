
// 轮播图效果

// 获得轮播图容器
var box = document.querySelector(".slice .slice-right");
// 获得轮播图的li
var lis = document.querySelectorAll(".slice-right .slice-images li");
// 获得轮播图底部的点
var spots = document.querySelectorAll(".slice-right .slice-spot li");
// 获得轮播图左右按钮
var btn_left = document.querySelector(".slice-right .move-left");
var btn_right = document.querySelector(".slice-right .move-right");

// 根据 index 使对应的 li 和 点 显示
// index 要从 0 开始
var show = function (index) {
    // 排他，排除类样式
    for(var i = 0; i < lis.length; i++) {
        lis[i].className = "";
        spots[i].className = "";
    }
    // 根据index 添加current 类样式
    lis[index].className = "current";
    spots[index].className = "current";
};

// 默认开启定时器
var index = 0;
var next = function () {
    index ++;
    if(index >= lis.length) {
        index = 0;
    }
    show(index);
};
var timeId = setInterval(next, 3000);

// 如果鼠标进入轮播图，清除定时器
box.onmouseenter = function () {
    timeId = clearInterval(timeId);
    // console.log("定时器关闭：" +timeId);
};
// 如果鼠标离开轮播图，再次开启定时器
box.onmouseleave = function () {
    if(!timeId) {
        timeId = setInterval(next, 3000);
        // console.log("定时器开启："  + timeId);
    }
};

// 点击左边按钮，播放上一张，同时底部的点上一个
btn_left.onclick = function () {
    index --;
    if(index < 0) {
        index = lis.length - 1;
    }
    show(index);
    // console.log("播放上一张：" + index);
};
// 点击右边按钮，播放下一张，同时底部的点下一个
btn_right.onclick = function () {
    index ++;
    if(index >= lis.length) {
        index = 0;
    }
    show(index);
    // console.log("播放下一张：" + index);
};

// 给每一个点 放置索引，用于记录点所在的位置
// 并给每个点设置点击事件
for(var i = 0; i < spots.length; i++) {
    spots[i].setAttribute("index", i);
    spots[i].onclick = function () {
        var temp = this.getAttribute("index");
        if(temp !== index) {
            index = temp;
            show(index);
            // console.log("播放第" + index + "张(索引)");
        }
    };
}



