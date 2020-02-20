function $(id) {
    return document.getElementById(id);
}

var flag = 1;
var img1 = $("img1");
var img2 = $("img2");
var img3 = $("img3");

window.onload = function (ev) {
    centerImg();
};

/*var centerImg = function() {
    // 实现中央图片居中
    var windowWidth = window.screen.width;
    var imgWidth = img1.clientWidth;
    console.log(windowWidth + "，" + imgWidth);
    // 左移宽度
    var translateX = (imgWidth - windowWidth) / 2;
    var top_banner = document.querySelector(".top_banner");
    console.log(translateX);
    top_banner.style.transform = "translateX(-" + translateX + "px)";
};*/

setInterval(function () {

   if(flag === 1) {
       img1.style.opacity = "1";
       img2.style.opacity = "0";
       img3.style.opacity = "0";
       flag = 2;
   }
    else if(flag === 2) {
        img1.style.opacity = "0";
        img2.style.opacity = "1";
        img3.style.opacity = "0";
        flag = 3;
    }
    else if(flag === 3) {
        img1.style.opacity = "0";
        img2.style.opacity = "0";
        img3.style.opacity = "1";
        flag = 1;
    }

}, 2000);
