// 顶部轮播图
// 获取图片数组，数组从 0 开始
var lunbo = function () {
    var imgs = document.querySelectorAll(".header .head-img img");
    // 定义一个标识符
    var flag = 1;
    // 定义一个循环定时器
    setInterval(function () {
        switch (flag) {
            case 1: // 用flag和case后面的值进行比较，满足则执行case后面的代码，不满足就不执行
                imgs[0].style.opacity = "1";
                imgs[1].style.opacity = "0";
                imgs[2].style.opacity = "0";
                flag = flag + 1;
                break; // 执行完上面的代码就直接结束
            case 2:
                imgs[0].style.opacity = "0";
                imgs[1].style.opacity = "1";
                imgs[2].style.opacity = "0";
                flag = flag + 1;
                break; // 执行完上面的代码就直接结束
            case 3:
                imgs[0].style.opacity = "0";
                imgs[1].style.opacity = "0";
                imgs[2].style.opacity = "1";
                flag = 1;
                break; // 执行完上面的代码就直接结束
        }
    }, 3000); // 1000ms=1s，每隔多少秒执行一次
};
lunbo();

// 京都商业街滚轮效果
var gunlun = function () {

    var client = document.querySelector(".jingdu-main .jingdu-top");
    var ul = document.querySelector(".jingdu-top ul");
    var moveBox = document.querySelector(".jingdu-main .jingdu-bottom");
    var moveItem = document.querySelector(".jingdu-main .jingdu-bottom .jingdu-move");

    // 移动单位（百分比）
    var unit = 0.05;
    // ul 移动的距离
    var ulMove = ul.offsetWidth * unit;
    // 按钮移动的距离
    var itemMove = moveBox.offsetWidth * unit * 1.5;
    // 显示区域的宽度
    var clientW = client.offsetWidth;

    function gunlun(event) {
        event = event || window.event;
        console.log(event);
    }

    ul.onmousewheel = function (eve) {
        eve = eve || window.event;
        eve.preventDefault();

        if (eve.wheelDelta >= 0) {
            if (ul.offsetLeft < 0) {
                console.log("上");
                // 上滑
                ul.style.left = (ul.offsetLeft + ulMove) + "px";
                moveItem.style.left = (moveItem.offsetLeft - itemMove) + "px";
            }
        } else if (eve.wheelDelta <= 0) {
            if ((-ul.offsetLeft) < ul.offsetWidth - clientW) {
                console.log("下");
                // 下滑
                ul.style.left = (ul.offsetLeft - ulMove) + "px";
                moveItem.style.left = (moveItem.offsetLeft + itemMove) + "px";
            }
        }
    };
};
gunlun();









