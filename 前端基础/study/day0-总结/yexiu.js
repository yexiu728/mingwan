
/* 获得范围内的随机数 */
function randomInt(min, max) {
    return Math.floor(Math.random() * (max - min)) + min;
}

/* 生成随机数 */
function getRandom(max) {
    return Math.floor(Math.random() * max);
}

/* 生成rgb颜色值 */
function randomRGBColor() {
    return "rgb(" + getRandom(256) + "," + getRandom(256) + "," + getRandom(256) + ")";
}

/* 生成十六进制颜色值 */
function randomHexColor() {
    var element = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"];
    var color = "#";
    for(var i = 0; i < 6; i++) {
        color += element[getRandom(16)];
    }
    return color;
}

/* 冒泡排序 */
function arraySort(arr) {
    for(var i = 0; i < arr.length; i++) {
        for(var j = 0; j < arr.length - 1 - i; j++) {
            if(arr[j] > arr[j + 1]) {
                var temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
