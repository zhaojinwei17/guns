layui.use(['table'], function () {
    var $ = layui.$;
    var table = layui.table;

    // //执行一个 table 实例
    table.render({
        elem: '#rentTable'
        ,url: '/rent/base/info/list' //数据接口
        ,title: '房租基本信息表'
        ,method: "post"
        ,contentType: 'application/json'
        ,page: true //开启分页
        ,height: 'full-98'
        ,cols: [[ //表头
            {type: 'checkbox', fixed: 'left'}
            ,{field: 'rentingHouse', title: '房租名称'}
            ,{field: 'rentingUnit', title: '房租规格' }
            ,{field: 'rentingAdress', title: '房租地址'}
            ,{field: 'tenantsName', title: '租客姓名'}
            ,{field: 'rentingTime', title: '收租日期'}
            ,{field: 'rentingPrice', title: '收租金额'}
            ,{align: 'center', toolbar: '#tableBar', title: '操作', minWidth: 200}
        ]]
    });
});
