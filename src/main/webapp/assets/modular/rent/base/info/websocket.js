layui.use(['table', 'form', 'laydate','layer'], function () {
    var $ = layui.$;
    var table = layui.table;
    var form = layui.form;
    var laydate = layui.laydate;
    var layer = layui.layer;

    var sid=Math.floor(Math.random()*10000);
    var socket;

    //添加
    $('#connection').on('click', function(){

        if(typeof(WebSocket) == "undefined") {
            console.log("您的浏览器不支持WebSocket");
        }else{
            console.log("您的浏览器支持WebSocket");
            //实现化WebSocket对象，指定要连接的服务器地址与端口  建立连接
            //等同于socket = new WebSocket("ws://localhost:8083/checkcentersys/websocket/20");
            socket = new WebSocket("ws://localhost/websocket/"+sid);
            //打开事件
            socket.onopen = function() {
                console.log("Socket 已打开");
                //socket.send("这是来自客户端的消息" + location.href + new Date());
            };
            //获得消息事件
            socket.onmessage = function(msg) {
                $("#msg").html($("#msg").html()+"<span>"+JSON.parse(msg.data).sid+":</span><span>"+JSON.parse(msg.data).message+"</span><br/>");
                //发现消息进入    开始处理前端触发逻辑
            };
            //关闭事件
            socket.onclose = function() {
                console.log("Socket已关闭");
            };
            //发生了错误事件
            socket.onerror = function() {
                alert("Socket发生了错误");
                //此时可以尝试刷新页面
            }
            //离开页面时，关闭socket
            //jquery1.8中已经被废弃，3.0中已经移除
            // $(window).unload(function(){
            //     socket.close();
            //});
        }
    });
    //搜索
    $('#send').on('click', function(){
        socket.send($("#message").val());
    });
});