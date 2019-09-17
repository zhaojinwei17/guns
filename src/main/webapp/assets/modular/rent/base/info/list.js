layui.use(['table', 'form', 'laydate','layer'], function () {
    var $ = layui.$;
    var table = layui.table;
    var form = layui.form;
    var laydate = layui.laydate;
    var layer = layui.layer;
    var isSubmit;

    // //执行一个 table 实例
    table.render({
        elem: '#rentTable'
        ,id : 'rentTable'
        ,url: '/rent/base/info/list' //数据接口
        ,title: '房租基本信息表'
        ,method: "post"
        ,contentType: 'application/json'
        ,page: true //开启分页
        ,height: 'full-98'
        ,cols: [[ //表头
            ,{field: 'id', hide:true}
            ,{field: 'rentingHouse', title: '房租名称'}
            ,{field: 'rentingUnit', title: '房租规格' }
            ,{field: 'rentingAdress', title: '房租地址'}
            ,{field: 'tenantsName', title: '租客姓名'}
            ,{field: 'rentingTime', title: '收租日期'}
            ,{field: 'rentingPrice', title: '收租金额'}
            ,{align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]]
    });

    //添加
    $('#btnAdd').on('click', function(){
        openDetail("添加");
    });
    //搜索
    $('#btnSearch').on('click', function(){
        var where={"rentingHouse":$("#rentingHouse").val()};
        table.reload('rentTable', {
            url: '/rent/base/info/list'
            ,where: where //设定异步数据接口的额外参数
        });
    });

    //监听工具条
    table.on('tool(rentTable)', function(obj){ //注：tool 是工具条事件名，rentTable 是 table 原始容器的属性 lay-filter="对应的值"
        var data = obj.data; //获得当前行数据
        var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
        var tr = obj.tr; //获得当前行 tr 的 DOM 对象（如果有的话）

        if(layEvent === 'delete'){ //删除
            layer.confirm('真的删除行么', function(index){
                $.ajax({
                    type : "delete",//请求类型
                    url : "/rent/base/del/"+data.id,//请求的 URL地址
                    dataType : "json",//返回的数据类型
                    success: function (data) {
                        if(data.code===200){
                            Feng.success(data.message);
                            obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                            layer.close(index);
                        }else {
                            Feng.error(data.message);
                        }
                    },
                    error:function (data) {
                        Feng.error("服务器异常！");
                    }
                });
            });
        } else if(layEvent === 'edit'){ //编辑
            openDetail("编辑",data);
        }
    });

    var openDetail=function(title,data){
        layer.open({
            type: 1
            ,anim: 4
            ,title: title
            ,area: ['700px', '400px']
            ,shade:  [0.8,'#393D49']
            ,maxmin: true
            ,moveOut: true
            ,offset: 'auto'
            ,content: popupEdit.innerHTML
            ,btn: ['提交', '取消']
            ,yes: function(){
                $("#submit").trigger("click");
                if(isSubmit){
                    isSubmit=false;
                    $.ajax({
                        type : "post",//请求类型
                        url : "/rent/base/add/or/update",//请求的 URL地址
                        data : JSON.stringify(form.val('rentEdit')),
                        contentType:"application/json;charset=UTF-8",
                        dataType : "json",//返回的数据类型
                        success: function (data) {
                            if(data.code===200){
                                Feng.success(data.message);
                                $("#btnSearch").trigger("click");
                                layer.closeAll();
                            }else {
                                Feng.error(data.message);
                            }
                        },
                        error:function (data) {
                            Feng.error("服务器异常！");
                        }
                    });
                }
            }
            ,btn2: function(){
                layer.closeAll();
            }
            ,success: function(layero, index){
                //初始化表单
                form.val('rentEdit',data);
                //日期渲染
                laydate.render({
                    elem: '.date'
                });
                //取消按钮点击事件
                $('#cancel').on('click', function(){
                    layer.closeAll();
                });
            }
        });
    }
    //监听提交
    form.on('submit(submit)', function(data){
        isSubmit=true;
        return false;
    });
});