# lz-cow-api
蓝奏云-奶牛快传的直链解析的API服务  
使用Jdk17+Vert.x4.4.1+Jsoup  
Core模块集成Vert.x实现类spring的注解式路由API  

示例:  
```
// 解析并重定向到直链
###
# @no-redirect
GET http://127.0.0.1:6400/parser?url=https://lanzoux.com/ia2cntg
###
# @no-redirect
GET http://127.0.0.1:6400/parser?url=https://cowtransfer.com/s/9a644fe3e3a748

// Rest请求(只提供共享文件Id): cow 奶牛快传; lz 蓝奏云
###
# @no-redirect
GET http://127.0.0.1:6400/cow/9a644fe3e3a748

// 解析返回json直链
###
GET http://127.0.0.1:6400/json/cow/9a644fe3e3a748
###
GET http://127.0.0.1:6400/json/lz/ia2cntg

```

TODO:  
解析蓝奏云加密链接


# 网盘对比

| 网盘名称 | 可直接下载分享     | 加密分享 | 初始网盘空间   | 单文件大小限制        | 登录接口 |
|------|-------------|------|----------|----------------|------|
| 蓝奏云  | √           | √    | 不限空间     | 100M           | √    |
| 奶牛快传 | √           | X    | 10G      | 不限大小           | √    |
| 夸克网盘 | X(>10M需要登录) | √    | 10G(20G) | 不限大小(>10M需要登录) | X    |
| 天翼云盘 |             |      |          |                |      |
| 阿里云盘 |             |      |          |                |      |

