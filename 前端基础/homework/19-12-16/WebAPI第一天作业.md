# WebAPI第一天作业

## 填空题

### DOM 全称是什么？

```
Document Object Model
```

### WebAPI 常见术语

| 术语   | 英文单词      | 备注   |
| ---- | --------- | ---- |
| 文档   | Document  | 重点   |
| 元素   | Element   | 重点   |
| 节点   | Node      |      |
| 属性   | Attribute |      |

### 获取元素 5 种方式

| 获取元素方式         | 方法名                   | 返回值的数据格式                     | 备注   |
| -------------- | --------------------- | ---------------------------- | ---- |
| 根据`选择器`获取一个元素  | querySelector         | 成功返回：标签            失败返回：null | 重点   |
| 根据`选择器`获取全部元素  | querySelectorAll      | 成功返回：NodeList    失败返回：[]     | 重点   |
| 根据 `id名称` 获取元素 | getElementById        | 成功返回：标签            失败返回：null |      |
| 根据`标签名称`获取元素   | getElementByTagName   | 成功返回：HTMLCollection 失败：[]    |      |
| 根据`类名称`获取元素    | getElementByClassName | 成功返回：HTMLCollection 失败：[]    |      |

### 获取和修改元素内容

| 获取和修改元素内容     | 属性名       | 备注   |
| ------------- | --------- | ---- |
| 获取和修改 HTML 内容 | innerHTML |      |
| 获取和修改 文本 内容   | innerText |      |

### 修改元素样式

修改行内样式

```
element.???  element.style
```

修改类名的属性

```
element.???  element.className
```



## 实操题

### 随机点名效果

#### 要求

​	随机点名效果实现，界面自由发挥，独立完成。

#### 主要锻炼的知识点

- 获取元素
- 点击事件
- 操作元素HTML内容
- 操作表单元素属性
- 随机数方法
- 数组方法
- ...

#### 随机点名效果参考

![1571737914385](WebAPI第一天作业.assets/1571737914385.png)

![1571737927713](WebAPI第一天作业.assets/1571737927713.png)

